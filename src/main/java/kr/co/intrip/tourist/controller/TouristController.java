package kr.co.intrip.tourist.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.intrip.login_signup.service.MemberService;
import kr.co.intrip.tourist.service.TouristService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class TouristController {

	@Autowired
	   private TouristService tourservice;
	
	// 관광지 페이지 목록
	   @RequestMapping(value = "tourist/tourist_PageList")
	   public ModelAndView signupInput (HttpServletRequest request, HttpServletResponse response) throws Exception {
	      ModelAndView mav = new ModelAndView();
	      mav.setViewName("tourist/tourist_PageList");
	      
	      return mav;
	   }
	
}
