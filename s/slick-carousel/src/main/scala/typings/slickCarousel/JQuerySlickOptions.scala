package typings.slickCarousel

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySlickOptions extends js.Object {
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
  implicit class JQuerySlickOptionsOps[Self <: JQuerySlickOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessibility(value: Boolean): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def setAdaptiveHeight(value: Boolean): Self = this.set("adaptiveHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptiveHeight: Self = this.set("adaptiveHeight", js.undefined)
    @scala.inline
    def setAppendArrowsVarargs(value: Element*): Self = this.set("appendArrows", js.Array(value :_*))
    @scala.inline
    def setAppendArrows(value: Element | js.Array[Element] | JQuery | String | Boolean): Self = this.set("appendArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendArrows: Self = this.set("appendArrows", js.undefined)
    @scala.inline
    def setAppendDotsVarargs(value: Element*): Self = this.set("appendDots", js.Array(value :_*))
    @scala.inline
    def setAppendDots(value: Element | js.Array[Element] | JQuery | String): Self = this.set("appendDots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendDots: Self = this.set("appendDots", js.undefined)
    @scala.inline
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def setAsNavFor(value: Element | JQuery | String): Self = this.set("asNavFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsNavFor: Self = this.set("asNavFor", js.undefined)
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setAutoplaySpeed(value: Double): Self = this.set("autoplaySpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplaySpeed: Self = this.set("autoplaySpeed", js.undefined)
    @scala.inline
    def setCenterMode(value: Boolean): Self = this.set("centerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterMode: Self = this.set("centerMode", js.undefined)
    @scala.inline
    def setCenterPadding(value: String): Self = this.set("centerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterPadding: Self = this.set("centerPadding", js.undefined)
    @scala.inline
    def setCssEase(value: String): Self = this.set("cssEase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssEase: Self = this.set("cssEase", js.undefined)
    @scala.inline
    def setCustomPaging(value: (/* slider */ js.Any, /* i */ Double) => String): Self = this.set("customPaging", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCustomPaging: Self = this.set("customPaging", js.undefined)
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setDotsClass(value: String): Self = this.set("dotsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotsClass: Self = this.set("dotsClass", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEdgeFriction(value: Double): Self = this.set("edgeFriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeFriction: Self = this.set("edgeFriction", js.undefined)
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    @scala.inline
    def setFocusOnChange(value: Boolean): Self = this.set("focusOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnChange: Self = this.set("focusOnChange", js.undefined)
    @scala.inline
    def setFocusOnSelect(value: Boolean): Self = this.set("focusOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnSelect: Self = this.set("focusOnSelect", js.undefined)
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    @scala.inline
    def setInitialSlide(value: Double): Self = this.set("initialSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSlide: Self = this.set("initialSlide", js.undefined)
    @scala.inline
    def setLazyLoad(value: String): Self = this.set("lazyLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    @scala.inline
    def setMobileFirst(value: Boolean): Self = this.set("mobileFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileFirst: Self = this.set("mobileFirst", js.undefined)
    @scala.inline
    def setNextArrow(value: Element | JQuery | String): Self = this.set("nextArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextArrow: Self = this.set("nextArrow", js.undefined)
    @scala.inline
    def setPauseOnDotsHover(value: Boolean): Self = this.set("pauseOnDotsHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnDotsHover: Self = this.set("pauseOnDotsHover", js.undefined)
    @scala.inline
    def setPauseOnFocus(value: Boolean): Self = this.set("pauseOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnFocus: Self = this.set("pauseOnFocus", js.undefined)
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    @scala.inline
    def setPrevArrow(value: Element | JQuery | String): Self = this.set("prevArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevArrow: Self = this.set("prevArrow", js.undefined)
    @scala.inline
    def setRespondTo(value: String): Self = this.set("respondTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRespondTo: Self = this.set("respondTo", js.undefined)
    @scala.inline
    def setResponsive(value: js.Object): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setSlide(value: String): Self = this.set("slide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    @scala.inline
    def setSlidesPerRow(value: Double): Self = this.set("slidesPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesPerRow: Self = this.set("slidesPerRow", js.undefined)
    @scala.inline
    def setSlidesToScroll(value: Double): Self = this.set("slidesToScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesToScroll: Self = this.set("slidesToScroll", js.undefined)
    @scala.inline
    def setSlidesToShow(value: Double): Self = this.set("slidesToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesToShow: Self = this.set("slidesToShow", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setSwipe(value: Boolean): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
    @scala.inline
    def setSwipeToSlide(value: Boolean): Self = this.set("swipeToSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeToSlide: Self = this.set("swipeToSlide", js.undefined)
    @scala.inline
    def setTouchMove(value: Boolean): Self = this.set("touchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchMove: Self = this.set("touchMove", js.undefined)
    @scala.inline
    def setTouchThreshold(value: Double): Self = this.set("touchThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchThreshold: Self = this.set("touchThreshold", js.undefined)
    @scala.inline
    def setUseCSS(value: Boolean): Self = this.set("useCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCSS: Self = this.set("useCSS", js.undefined)
    @scala.inline
    def setUseTransform(value: Boolean): Self = this.set("useTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTransform: Self = this.set("useTransform", js.undefined)
    @scala.inline
    def setVariableWidth(value: Boolean): Self = this.set("variableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableWidth: Self = this.set("variableWidth", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    @scala.inline
    def setVerticalSwiping(value: Boolean): Self = this.set("verticalSwiping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalSwiping: Self = this.set("verticalSwiping", js.undefined)
    @scala.inline
    def setWaitForAnimate(value: Boolean): Self = this.set("waitForAnimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForAnimate: Self = this.set("waitForAnimate", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

