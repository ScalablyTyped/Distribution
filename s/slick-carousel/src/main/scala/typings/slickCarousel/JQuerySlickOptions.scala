package typings.slickCarousel

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuerySlickOptions extends StObject {
  
  /**
    * Enables tabbing and arrow key navigation
    * Default: true
    */
  var accessibility: js.UndefOr[Boolean] = js.native
  
  /**
    * Enables adaptive height for single slide horizontal carousels.
    * Default: false
    */
  var adaptiveHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Change where the navigation arrows are attached (Selector, htmlString, Array, Element, jQuery object)
    * `false` will prevent arrows from being created/appended
    * Default: $(element)
    */
  var appendArrows: js.UndefOr[Element | js.Array[Element] | JQuery | String | Boolean] = js.native
  
  /**
    * Change where the navigation dots are attached (Selector, htmlString, Array, Element, jQuery object)
    * Default: $(element)
    */
  var appendDots: js.UndefOr[Element | js.Array[Element] | JQuery | String] = js.native
  
  /**
    * Prev/Next Arrows
    * Default: true
    */
  var arrows: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the slider to be the navigation of other slider
    * Default: null
    */
  var asNavFor: js.UndefOr[Element | JQuery | String] = js.native
  
  /**
    * Enables Autoplay
    * Default: false
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /**
    * Autoplay Speed in milliseconds
    * Default: 3000
    */
  var autoplaySpeed: js.UndefOr[Double] = js.native
  
  /**
    * Enables centered view with partial prev/next slides. Use with odd numbered slidesToShow counts.
    * Default: false
    */
  var centerMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Side padding when in center mode (px or %)
    * Default: '50px'
    */
  var centerPadding: js.UndefOr[String] = js.native
  
  /**
    * CSS3 Animation Easing
    * Default: 'ease'
    */
  var cssEase: js.UndefOr[String] = js.native
  
  /**
    * Custom paging templates. See source for use example.
    * Default: n/a
    */
  var customPaging: js.UndefOr[js.Function2[/* slider */ js.Any, /* i */ Double, String]] = js.native
  
  /**
    * Show dot indicators
    * Default: false
    */
  var dots: js.UndefOr[Boolean] = js.native
  
  /**
    * Class for slide indicator dots container
    * Default: 'slick-dots'
    */
  var dotsClass: js.UndefOr[String] = js.native
  
  /**
    * Enable mouse dragging
    * Default: true
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * Add easing for jQuery animate. Use with easing libraries or default easing methods
    * Default: 'linear'
    */
  var easing: js.UndefOr[String] = js.native
  
  /**
    * Resistance when swiping edges of non-infinite carousels
    * Default: 0.15
    */
  var edgeFriction: js.UndefOr[Double] = js.native
  
  /**
    * Enable fade
    * Default: false
    */
  var fade: js.UndefOr[Boolean] = js.native
  
  /**
    * Puts focus on slide after change
    * Default: false
    */
  var focusOnChange: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable focus on selected element (click)
    * Default: false
    */
  var focusOnSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * Infinite loop sliding
    * Default: true
    */
  var infinite: js.UndefOr[Boolean] = js.native
  
  /**
    * Slide to start on
    * Default: 0
    */
  var initialSlide: js.UndefOr[Double] = js.native
  
  /**
    * Set lazy loading technique. Accepts 'ondemand' or 'progressive'.
    * Default: 'ondemand'
    */
  var lazyLoad: js.UndefOr[String] = js.native
  
  /**
    * Responsive settings use mobile first calculation
    * Default: false
    */
  var mobileFirst: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows you to select a node or customize the HTML for the "Next" arrow.
    * Default: <button type="button" class="slick-next">Next</button>
    */
  var nextArrow: js.UndefOr[Element | JQuery | String] = js.native
  
  /**
    * Pause Autoplay when a dot is hovered
    * Default: false
    */
  var pauseOnDotsHover: js.UndefOr[Boolean] = js.native
  
  /**
    * Pause Autoplay On Focus
    * Default: true
    */
  var pauseOnFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Pause Autoplay On Hover
    * Default: true
    */
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows you to select a node or customize the HTML for the "Previous" arrow.
    * Default: <button type="button" class="slick-prev">Previous</button>
    */
  var prevArrow: js.UndefOr[Element | JQuery | String] = js.native
  
  /**
    * Width that responsive object responds to. Can be 'window', 'slider' or 'min' (the smaller of the two)
    * Default: 'window'
    */
  var respondTo: js.UndefOr[String] = js.native
  
  /**
    * Object containing breakpoints and settings objects (see demo).
    * Enables settings sets at given screen width.
    * Set settings to "unslick" instead of an object to disable slick at a given breakpoint.
    * Default: none
    */
  var responsive: js.UndefOr[js.Object] = js.native
  
  /**
    * Setting this to more than 1 initializes grid mode. Use slidesPerRow to set how many slides should be in each row.
    * Default: 1
    */
  var rows: js.UndefOr[Double] = js.native
  
  /**
    * Change the slider's direction to become right-to-left
    * Default: false
    */
  var rtl: js.UndefOr[Boolean] = js.native
  
  /**
    * Element query to use as slide
    * Default: 'div'
    */
  var slide: js.UndefOr[String] = js.native
  
  /**
    * With grid mode intialized via the rows option, this sets how many slides are in each grid row.
    * Default: 1
    */
  var slidesPerRow: js.UndefOr[Double] = js.native
  
  /**
    * # of slides to scroll
    * Default: 1
    */
  var slidesToScroll: js.UndefOr[Double] = js.native
  
  /**
    * # of slides to show
    * Default: 1
    */
  var slidesToShow: js.UndefOr[Double] = js.native
  
  /**
    * Slide/Fade animation speed (ms)
    * Default: 300
    */
  var speed: js.UndefOr[Double] = js.native
  
  /**
    * Enable swiping
    * Default: true
    */
  var swipe: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow users to drag or swipe directly to a slide irrespective of slidesToScroll.
    * Default: false
    */
  var swipeToSlide: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable slide motion with touch
    * Default: true
    */
  var touchMove: js.UndefOr[Boolean] = js.native
  
  /**
    * To advance slides, the user must swipe a length of (1/touchThreshold) * the width of the slider.
    * Default: 5
    */
  var touchThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Enable/Disable CSS Transitions
    * Default: true
    */
  var useCSS: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable/Disable CSS Transforms
    * Default: true
    */
  var useTransform: js.UndefOr[Boolean] = js.native
  
  /**
    * Variable width slides.
    * Default: false
    */
  var variableWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * Vertical slide mode
    * Default: false
    */
  var vertical: js.UndefOr[Boolean] = js.native
  
  /**
    * Vertical swipe mode
    * Default: false
    */
  var verticalSwiping: js.UndefOr[Boolean] = js.native
  
  /**
    * Change the slider's direction to become right-to-left
    * Default: false
    */
  var waitForAnimate: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the zIndex values for slides, useful for IE9 and lower
    * Default: 1000
    */
  var zIndex: js.UndefOr[Double] = js.native
}
object JQuerySlickOptions {
  
  @scala.inline
  def apply(): JQuerySlickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQuerySlickOptions]
  }
  
  @scala.inline
  implicit class JQuerySlickOptionsMutableBuilder[Self <: JQuerySlickOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: Boolean): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setAdaptiveHeight(value: Boolean): Self = StObject.set(x, "adaptiveHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdaptiveHeightUndefined: Self = StObject.set(x, "adaptiveHeight", js.undefined)
    
    @scala.inline
    def setAppendArrows(value: Element | js.Array[Element] | JQuery | String | Boolean): Self = StObject.set(x, "appendArrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendArrowsUndefined: Self = StObject.set(x, "appendArrows", js.undefined)
    
    @scala.inline
    def setAppendArrowsVarargs(value: Element*): Self = StObject.set(x, "appendArrows", js.Array(value :_*))
    
    @scala.inline
    def setAppendDots(value: Element | js.Array[Element] | JQuery | String): Self = StObject.set(x, "appendDots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendDotsUndefined: Self = StObject.set(x, "appendDots", js.undefined)
    
    @scala.inline
    def setAppendDotsVarargs(value: Element*): Self = StObject.set(x, "appendDots", js.Array(value :_*))
    
    @scala.inline
    def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
    
    @scala.inline
    def setAsNavFor(value: Element | JQuery | String): Self = StObject.set(x, "asNavFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsNavForUndefined: Self = StObject.set(x, "asNavFor", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplaySpeed(value: Double): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setCenterMode(value: Boolean): Self = StObject.set(x, "centerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterModeUndefined: Self = StObject.set(x, "centerMode", js.undefined)
    
    @scala.inline
    def setCenterPadding(value: String): Self = StObject.set(x, "centerPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterPaddingUndefined: Self = StObject.set(x, "centerPadding", js.undefined)
    
    @scala.inline
    def setCssEase(value: String): Self = StObject.set(x, "cssEase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssEaseUndefined: Self = StObject.set(x, "cssEase", js.undefined)
    
    @scala.inline
    def setCustomPaging(value: (/* slider */ js.Any, /* i */ Double) => String): Self = StObject.set(x, "customPaging", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomPagingUndefined: Self = StObject.set(x, "customPaging", js.undefined)
    
    @scala.inline
    def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotsClass(value: String): Self = StObject.set(x, "dotsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotsClassUndefined: Self = StObject.set(x, "dotsClass", js.undefined)
    
    @scala.inline
    def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    @scala.inline
    def setEdgeFriction(value: Double): Self = StObject.set(x, "edgeFriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeFrictionUndefined: Self = StObject.set(x, "edgeFriction", js.undefined)
    
    @scala.inline
    def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
    
    @scala.inline
    def setFocusOnChange(value: Boolean): Self = StObject.set(x, "focusOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOnChangeUndefined: Self = StObject.set(x, "focusOnChange", js.undefined)
    
    @scala.inline
    def setFocusOnSelect(value: Boolean): Self = StObject.set(x, "focusOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOnSelectUndefined: Self = StObject.set(x, "focusOnSelect", js.undefined)
    
    @scala.inline
    def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    @scala.inline
    def setInitialSlide(value: Double): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSlideUndefined: Self = StObject.set(x, "initialSlide", js.undefined)
    
    @scala.inline
    def setLazyLoad(value: String): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
    
    @scala.inline
    def setMobileFirst(value: Boolean): Self = StObject.set(x, "mobileFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileFirstUndefined: Self = StObject.set(x, "mobileFirst", js.undefined)
    
    @scala.inline
    def setNextArrow(value: Element | JQuery | String): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
    
    @scala.inline
    def setPauseOnDotsHover(value: Boolean): Self = StObject.set(x, "pauseOnDotsHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseOnDotsHoverUndefined: Self = StObject.set(x, "pauseOnDotsHover", js.undefined)
    
    @scala.inline
    def setPauseOnFocus(value: Boolean): Self = StObject.set(x, "pauseOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseOnFocusUndefined: Self = StObject.set(x, "pauseOnFocus", js.undefined)
    
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
    
    @scala.inline
    def setPrevArrow(value: Element | JQuery | String): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevArrowUndefined: Self = StObject.set(x, "prevArrow", js.undefined)
    
    @scala.inline
    def setRespondTo(value: String): Self = StObject.set(x, "respondTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespondToUndefined: Self = StObject.set(x, "respondTo", js.undefined)
    
    @scala.inline
    def setResponsive(value: js.Object): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    
    @scala.inline
    def setSlide(value: String): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    
    @scala.inline
    def setSlidesPerRow(value: Double): Self = StObject.set(x, "slidesPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesPerRowUndefined: Self = StObject.set(x, "slidesPerRow", js.undefined)
    
    @scala.inline
    def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
    
    @scala.inline
    def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeToSlide(value: Boolean): Self = StObject.set(x, "swipeToSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeToSlideUndefined: Self = StObject.set(x, "swipeToSlide", js.undefined)
    
    @scala.inline
    def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
    
    @scala.inline
    def setTouchMove(value: Boolean): Self = StObject.set(x, "touchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchMoveUndefined: Self = StObject.set(x, "touchMove", js.undefined)
    
    @scala.inline
    def setTouchThreshold(value: Double): Self = StObject.set(x, "touchThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchThresholdUndefined: Self = StObject.set(x, "touchThreshold", js.undefined)
    
    @scala.inline
    def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
    
    @scala.inline
    def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransformUndefined: Self = StObject.set(x, "useTransform", js.undefined)
    
    @scala.inline
    def setVariableWidth(value: Boolean): Self = StObject.set(x, "variableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableWidthUndefined: Self = StObject.set(x, "variableWidth", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalSwiping(value: Boolean): Self = StObject.set(x, "verticalSwiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalSwipingUndefined: Self = StObject.set(x, "verticalSwiping", js.undefined)
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    @scala.inline
    def setWaitForAnimate(value: Boolean): Self = StObject.set(x, "waitForAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForAnimateUndefined: Self = StObject.set(x, "waitForAnimate", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
