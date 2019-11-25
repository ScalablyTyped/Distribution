package typings.slickDashCarousel

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySlickOptions extends js.Object {
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
  @scala.inline
  def apply(
    accessibility: js.UndefOr[Boolean] = js.undefined,
    adaptiveHeight: js.UndefOr[Boolean] = js.undefined,
    appendArrows: Element | js.Array[Element] | JQuery | String | Boolean = null,
    appendDots: Element | js.Array[Element] | JQuery | String = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    asNavFor: Element | JQuery | String = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplaySpeed: Int | Double = null,
    centerMode: js.UndefOr[Boolean] = js.undefined,
    centerPadding: String = null,
    cssEase: String = null,
    customPaging: (/* slider */ js.Any, /* i */ Double) => String = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    dotsClass: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    edgeFriction: Int | Double = null,
    fade: js.UndefOr[Boolean] = js.undefined,
    focusOnSelect: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlide: Int | Double = null,
    lazyLoad: String = null,
    mobileFirst: js.UndefOr[Boolean] = js.undefined,
    nextArrow: Element | JQuery | String = null,
    pauseOnDotsHover: js.UndefOr[Boolean] = js.undefined,
    pauseOnFocus: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    prevArrow: Element | JQuery | String = null,
    respondTo: String = null,
    responsive: js.Object = null,
    rows: Int | Double = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    slide: String = null,
    slidesPerRow: Int | Double = null,
    slidesToScroll: Int | Double = null,
    slidesToShow: Int | Double = null,
    speed: Int | Double = null,
    swipe: js.UndefOr[Boolean] = js.undefined,
    swipeToSlide: js.UndefOr[Boolean] = js.undefined,
    touchMove: js.UndefOr[Boolean] = js.undefined,
    touchThreshold: Int | Double = null,
    useCSS: js.UndefOr[Boolean] = js.undefined,
    useTransform: js.UndefOr[Boolean] = js.undefined,
    variableWidth: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    verticalSwiping: js.UndefOr[Boolean] = js.undefined,
    waitForAnimate: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): JQuerySlickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility.asInstanceOf[js.Any])
    if (!js.isUndefined(adaptiveHeight)) __obj.updateDynamic("adaptiveHeight")(adaptiveHeight.asInstanceOf[js.Any])
    if (appendArrows != null) __obj.updateDynamic("appendArrows")(appendArrows.asInstanceOf[js.Any])
    if (appendDots != null) __obj.updateDynamic("appendDots")(appendDots.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (asNavFor != null) __obj.updateDynamic("asNavFor")(asNavFor.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(centerMode)) __obj.updateDynamic("centerMode")(centerMode.asInstanceOf[js.Any])
    if (centerPadding != null) __obj.updateDynamic("centerPadding")(centerPadding.asInstanceOf[js.Any])
    if (cssEase != null) __obj.updateDynamic("cssEase")(cssEase.asInstanceOf[js.Any])
    if (customPaging != null) __obj.updateDynamic("customPaging")(js.Any.fromFunction2(customPaging))
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeFriction != null) __obj.updateDynamic("edgeFriction")(edgeFriction.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (initialSlide != null) __obj.updateDynamic("initialSlide")(initialSlide.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileFirst)) __obj.updateDynamic("mobileFirst")(mobileFirst.asInstanceOf[js.Any])
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnDotsHover)) __obj.updateDynamic("pauseOnDotsHover")(pauseOnDotsHover.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnFocus)) __obj.updateDynamic("pauseOnFocus")(pauseOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.asInstanceOf[js.Any])
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow.asInstanceOf[js.Any])
    if (respondTo != null) __obj.updateDynamic("respondTo")(respondTo.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (slidesPerRow != null) __obj.updateDynamic("slidesPerRow")(slidesPerRow.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeToSlide)) __obj.updateDynamic("swipeToSlide")(swipeToSlide.asInstanceOf[js.Any])
    if (!js.isUndefined(touchMove)) __obj.updateDynamic("touchMove")(touchMove.asInstanceOf[js.Any])
    if (touchThreshold != null) __obj.updateDynamic("touchThreshold")(touchThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(variableWidth)) __obj.updateDynamic("variableWidth")(variableWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalSwiping)) __obj.updateDynamic("verticalSwiping")(verticalSwiping.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAnimate)) __obj.updateDynamic("waitForAnimate")(waitForAnimate.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlickOptions]
  }
}

