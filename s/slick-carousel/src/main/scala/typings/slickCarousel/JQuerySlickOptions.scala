package typings.slickCarousel

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuerySlickOptions extends StObject {
  
  /**
    * Enables tabbing and arrow key navigation
    * Default: true
    */
  var accessibility: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables adaptive height for single slide horizontal carousels.
    * Default: false
    */
  var adaptiveHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Change where the navigation arrows are attached (Selector, htmlString, Array, Element, jQuery object)
    * `false` will prevent arrows from being created/appended
    * Default: $(element)
    */
  var appendArrows: js.UndefOr[Element | js.Array[Element] | JQuery | String | Boolean] = js.undefined
  
  /**
    * Change where the navigation dots are attached (Selector, htmlString, Array, Element, jQuery object)
    * Default: $(element)
    */
  var appendDots: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.undefined
  
  /**
    * Prev/Next Arrows
    * Default: true
    */
  var arrows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the slider to be the navigation of other slider
    * Default: null
    */
  var asNavFor: js.UndefOr[Element | JQuery | String] = js.undefined
  
  /**
    * Enables Autoplay
    * Default: false
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Autoplay Speed in milliseconds
    * Default: 3000
    */
  var autoplaySpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables centered view with partial prev/next slides. Use with odd numbered slidesToShow counts.
    * Default: false
    */
  var centerMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Side padding when in center mode (px or %)
    * Default: '50px'
    */
  var centerPadding: js.UndefOr[String] = js.undefined
  
  /**
    * CSS3 Animation Easing
    * Default: 'ease'
    */
  var cssEase: js.UndefOr[String] = js.undefined
  
  /**
    * Custom paging templates. See source for use example.
    * Default: n/a
    */
  var customPaging: js.UndefOr[js.Function2[/* slider */ js.Any, /* i */ Double, String]] = js.undefined
  
  /**
    * Show dot indicators
    * Default: false
    */
  var dots: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Class for slide indicator dots container
    * Default: 'slick-dots'
    */
  var dotsClass: js.UndefOr[String] = js.undefined
  
  /**
    * Enable mouse dragging
    * Default: true
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Add easing for jQuery animate. Use with easing libraries or default easing methods
    * Default: 'linear'
    */
  var easing: js.UndefOr[String] = js.undefined
  
  /**
    * Resistance when swiping edges of non-infinite carousels
    * Default: 0.15
    */
  var edgeFriction: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable fade
    * Default: false
    */
  var fade: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Puts focus on slide after change
    * Default: false
    */
  var focusOnChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable focus on selected element (click)
    * Default: false
    */
  var focusOnSelect: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Infinite loop sliding
    * Default: true
    */
  var infinite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Slide to start on
    * Default: 0
    */
  var initialSlide: js.UndefOr[Double] = js.undefined
  
  /**
    * Set lazy loading technique. Accepts 'ondemand' or 'progressive'.
    * Default: 'ondemand'
    */
  var lazyLoad: js.UndefOr[String] = js.undefined
  
  /**
    * Responsive settings use mobile first calculation
    * Default: false
    */
  var mobileFirst: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to select a node or customize the HTML for the "Next" arrow.
    * Default: <button type="button" class="slick-next">Next</button>
    */
  var nextArrow: js.UndefOr[Element | JQuery | String] = js.undefined
  
  /**
    * Pause Autoplay when a dot is hovered
    * Default: false
    */
  var pauseOnDotsHover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Pause Autoplay On Focus
    * Default: true
    */
  var pauseOnFocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Pause Autoplay On Hover
    * Default: true
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to select a node or customize the HTML for the "Previous" arrow.
    * Default: <button type="button" class="slick-prev">Previous</button>
    */
  var prevArrow: js.UndefOr[Element | JQuery | String] = js.undefined
  
  /**
    * Width that responsive object responds to. Can be 'window', 'slider' or 'min' (the smaller of the two)
    * Default: 'window'
    */
  var respondTo: js.UndefOr[String] = js.undefined
  
  /**
    * Object containing breakpoints and settings objects (see demo).
    * Enables settings sets at given screen width.
    * Set settings to "unslick" instead of an object to disable slick at a given breakpoint.
    * Default: none
    */
  var responsive: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Setting this to more than 1 initializes grid mode. Use slidesPerRow to set how many slides should be in each row.
    * Default: 1
    */
  var rows: js.UndefOr[Double] = js.undefined
  
  /**
    * Change the slider's direction to become right-to-left
    * Default: false
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Element query to use as slide
    * Default: 'div'
    */
  var slide: js.UndefOr[String] = js.undefined
  
  /**
    * With grid mode intialized via the rows option, this sets how many slides are in each grid row.
    * Default: 1
    */
  var slidesPerRow: js.UndefOr[Double] = js.undefined
  
  /**
    * # of slides to scroll
    * Default: 1
    */
  var slidesToScroll: js.UndefOr[Double] = js.undefined
  
  /**
    * # of slides to show
    * Default: 1
    */
  var slidesToShow: js.UndefOr[Double] = js.undefined
  
  /**
    * Slide/Fade animation speed (ms)
    * Default: 300
    */
  var speed: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable swiping
    * Default: true
    */
  var swipe: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow users to drag or swipe directly to a slide irrespective of slidesToScroll.
    * Default: false
    */
  var swipeToSlide: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable slide motion with touch
    * Default: true
    */
  var touchMove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To advance slides, the user must swipe a length of (1/touchThreshold) * the width of the slider.
    * Default: 5
    */
  var touchThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Enable/Disable CSS Transitions
    * Default: true
    */
  var useCSS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable/Disable CSS Transforms
    * Default: true
    */
  var useTransform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Variable width slides.
    * Default: false
    */
  var variableWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertical slide mode
    * Default: false
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Vertical swipe mode
    * Default: false
    */
  var verticalSwiping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Change the slider's direction to become right-to-left
    * Default: false
    */
  var waitForAnimate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the zIndex values for slides, useful for IE9 and lower
    * Default: 1000
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object JQuerySlickOptions {
  
  inline def apply(): JQuerySlickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQuerySlickOptions]
  }
  
  extension [Self <: JQuerySlickOptions](x: Self) {
    
    inline def setAccessibility(value: Boolean): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setAdaptiveHeight(value: Boolean): Self = StObject.set(x, "adaptiveHeight", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveHeightUndefined: Self = StObject.set(x, "adaptiveHeight", js.undefined)
    
    inline def setAppendArrows(value: Element | js.Array[Element] | JQuery | String | Boolean): Self = StObject.set(x, "appendArrows", value.asInstanceOf[js.Any])
    
    inline def setAppendArrowsUndefined: Self = StObject.set(x, "appendArrows", js.undefined)
    
    inline def setAppendArrowsVarargs(value: Element*): Self = StObject.set(x, "appendArrows", js.Array(value :_*))
    
    inline def setAppendDots(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "appendDots", value.asInstanceOf[js.Any])
    
    inline def setAppendDotsUndefined: Self = StObject.set(x, "appendDots", js.undefined)
    
    inline def setAppendDotsVarargs(value: Element*): Self = StObject.set(x, "appendDots", js.Array(value :_*))
    
    inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
    
    inline def setAsNavFor(value: Element | JQuery | String): Self = StObject.set(x, "asNavFor", value.asInstanceOf[js.Any])
    
    inline def setAsNavForUndefined: Self = StObject.set(x, "asNavFor", js.undefined)
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplaySpeed(value: Double): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
    
    inline def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setCenterMode(value: Boolean): Self = StObject.set(x, "centerMode", value.asInstanceOf[js.Any])
    
    inline def setCenterModeUndefined: Self = StObject.set(x, "centerMode", js.undefined)
    
    inline def setCenterPadding(value: String): Self = StObject.set(x, "centerPadding", value.asInstanceOf[js.Any])
    
    inline def setCenterPaddingUndefined: Self = StObject.set(x, "centerPadding", js.undefined)
    
    inline def setCssEase(value: String): Self = StObject.set(x, "cssEase", value.asInstanceOf[js.Any])
    
    inline def setCssEaseUndefined: Self = StObject.set(x, "cssEase", js.undefined)
    
    inline def setCustomPaging(value: (/* slider */ js.Any, /* i */ Double) => String): Self = StObject.set(x, "customPaging", js.Any.fromFunction2(value))
    
    inline def setCustomPagingUndefined: Self = StObject.set(x, "customPaging", js.undefined)
    
    inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDotsClass(value: String): Self = StObject.set(x, "dotsClass", value.asInstanceOf[js.Any])
    
    inline def setDotsClassUndefined: Self = StObject.set(x, "dotsClass", js.undefined)
    
    inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setEdgeFriction(value: Double): Self = StObject.set(x, "edgeFriction", value.asInstanceOf[js.Any])
    
    inline def setEdgeFrictionUndefined: Self = StObject.set(x, "edgeFriction", js.undefined)
    
    inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
    
    inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    
    inline def setFocusOnChange(value: Boolean): Self = StObject.set(x, "focusOnChange", value.asInstanceOf[js.Any])
    
    inline def setFocusOnChangeUndefined: Self = StObject.set(x, "focusOnChange", js.undefined)
    
    inline def setFocusOnSelect(value: Boolean): Self = StObject.set(x, "focusOnSelect", value.asInstanceOf[js.Any])
    
    inline def setFocusOnSelectUndefined: Self = StObject.set(x, "focusOnSelect", js.undefined)
    
    inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    inline def setInitialSlide(value: Double): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
    
    inline def setInitialSlideUndefined: Self = StObject.set(x, "initialSlide", js.undefined)
    
    inline def setLazyLoad(value: String): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
    
    inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
    
    inline def setMobileFirst(value: Boolean): Self = StObject.set(x, "mobileFirst", value.asInstanceOf[js.Any])
    
    inline def setMobileFirstUndefined: Self = StObject.set(x, "mobileFirst", js.undefined)
    
    inline def setNextArrow(value: Element | JQuery | String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
    
    inline def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
    
    inline def setPauseOnDotsHover(value: Boolean): Self = StObject.set(x, "pauseOnDotsHover", value.asInstanceOf[js.Any])
    
    inline def setPauseOnDotsHoverUndefined: Self = StObject.set(x, "pauseOnDotsHover", js.undefined)
    
    inline def setPauseOnFocus(value: Boolean): Self = StObject.set(x, "pauseOnFocus", value.asInstanceOf[js.Any])
    
    inline def setPauseOnFocusUndefined: Self = StObject.set(x, "pauseOnFocus", js.undefined)
    
    inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
    
    inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
    
    inline def setPrevArrow(value: Element | JQuery | String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
    
    inline def setPrevArrowUndefined: Self = StObject.set(x, "prevArrow", js.undefined)
    
    inline def setRespondTo(value: String): Self = StObject.set(x, "respondTo", value.asInstanceOf[js.Any])
    
    inline def setRespondToUndefined: Self = StObject.set(x, "respondTo", js.undefined)
    
    inline def setResponsive(value: js.Object): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    inline def setSlide(value: String): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
    
    inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    
    inline def setSlidesPerRow(value: Double): Self = StObject.set(x, "slidesPerRow", value.asInstanceOf[js.Any])
    
    inline def setSlidesPerRowUndefined: Self = StObject.set(x, "slidesPerRow", js.undefined)
    
    inline def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
    
    inline def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
    
    inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
    
    inline def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    inline def setSwipeToSlide(value: Boolean): Self = StObject.set(x, "swipeToSlide", value.asInstanceOf[js.Any])
    
    inline def setSwipeToSlideUndefined: Self = StObject.set(x, "swipeToSlide", js.undefined)
    
    inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
    
    inline def setTouchMove(value: Boolean): Self = StObject.set(x, "touchMove", value.asInstanceOf[js.Any])
    
    inline def setTouchMoveUndefined: Self = StObject.set(x, "touchMove", js.undefined)
    
    inline def setTouchThreshold(value: Double): Self = StObject.set(x, "touchThreshold", value.asInstanceOf[js.Any])
    
    inline def setTouchThresholdUndefined: Self = StObject.set(x, "touchThreshold", js.undefined)
    
    inline def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
    
    inline def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
    
    inline def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
    
    inline def setUseTransformUndefined: Self = StObject.set(x, "useTransform", js.undefined)
    
    inline def setVariableWidth(value: Boolean): Self = StObject.set(x, "variableWidth", value.asInstanceOf[js.Any])
    
    inline def setVariableWidthUndefined: Self = StObject.set(x, "variableWidth", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalSwiping(value: Boolean): Self = StObject.set(x, "verticalSwiping", value.asInstanceOf[js.Any])
    
    inline def setVerticalSwipingUndefined: Self = StObject.set(x, "verticalSwiping", js.undefined)
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    inline def setWaitForAnimate(value: Boolean): Self = StObject.set(x, "waitForAnimate", value.asInstanceOf[js.Any])
    
    inline def setWaitForAnimateUndefined: Self = StObject.set(x, "waitForAnimate", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
