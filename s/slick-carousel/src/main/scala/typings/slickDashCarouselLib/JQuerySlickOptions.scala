package typings
package slickDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySlickOptions extends js.Object {
  /**
    * Enables tabbing and arrow key navigation
    * Default: true
    */
  var accessibility: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables adaptive height for single slide horizontal carousels.
    * Default: false
    */
  var adaptiveHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Change where the navigation arrows are attached (Selector, htmlString, Array, Element, jQuery object)
    * `false` will prevent arrows from being created/appended
    * Default: $(element)
    */
  var appendArrows: js.UndefOr[
    stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String | scala.Boolean
  ] = js.undefined
  /**
    * Change where the navigation dots are attached (Selector, htmlString, Array, Element, jQuery object)
    * Default: $(element)
    */
  var appendDots: js.UndefOr[stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String] = js.undefined
  /**
    * Prev/Next Arrows
    * Default: true
    */
  var arrows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the slider to be the navigation of other slider
    * Default: null
    */
  var asNavFor: js.UndefOr[stdLib.Element | JQuery | java.lang.String] = js.undefined
  /**
    * Enables Autoplay
    * Default: false
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Autoplay Speed in milliseconds
    * Default: 3000
    */
  var autoplaySpeed: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enables centered view with partial prev/next slides. Use with odd numbered slidesToShow counts.
    * Default: false
    */
  var centerMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Side padding when in center mode (px or %)
    * Default: '50px'
    */
  var centerPadding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * CSS3 Animation Easing
    * Default: 'ease'
    */
  var cssEase: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom paging templates. See source for use example.
    * Default: n/a
    */
  var customPaging: js.UndefOr[js.Function2[/* slider */ js.Any, /* i */ scala.Double, java.lang.String]] = js.undefined
  /**
    * Show dot indicators
    * Default: false
    */
  var dots: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Class for slide indicator dots container
    * Default: 'slick-dots'
    */
  var dotsClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable mouse dragging
    * Default: true
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add easing for jQuery animate. Use with easing libraries or default easing methods
    * Default: 'linear'
    */
  var easing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Resistance when swiping edges of non-infinite carousels
    * Default: 0.15
    */
  var edgeFriction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable fade
    * Default: false
    */
  var fade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable focus on selected element (click)
    * Default: false
    */
  var focusOnSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Infinite loop sliding
    * Default: true
    */
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Slide to start on
    * Default: 0
    */
  var initialSlide: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set lazy loading technique. Accepts 'ondemand' or 'progressive'.
    * Default: 'ondemand'
    */
  var lazyLoad: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Responsive settings use mobile first calculation
    * Default: false
    */
  var mobileFirst: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows you to select a node or customize the HTML for the "Next" arrow.
    * Default: <button type="button" class="slick-next">Next</button>
    */
  var nextArrow: js.UndefOr[stdLib.Element | JQuery | java.lang.String] = js.undefined
  /**
    * Pause Autoplay when a dot is hovered
    * Default: false
    */
  var pauseOnDotsHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pause Autoplay On Focus
    * Default: true
    */
  var pauseOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pause Autoplay On Hover
    * Default: true
    */
  var pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows you to select a node or customize the HTML for the "Previous" arrow.
    * Default: <button type="button" class="slick-prev">Previous</button>
    */
  var prevArrow: js.UndefOr[stdLib.Element | JQuery | java.lang.String] = js.undefined
  /**
    * Width that responsive object responds to. Can be 'window', 'slider' or 'min' (the smaller of the two)
    * Default: 'window'
    */
  var respondTo: js.UndefOr[java.lang.String] = js.undefined
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
  var rows: js.UndefOr[scala.Double] = js.undefined
  /**
    * Change the slider's direction to become right-to-left
    * Default: false
    */
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Element query to use as slide
    * Default: 'div'
    */
  var slide: js.UndefOr[java.lang.String] = js.undefined
  /**
    * With grid mode intialized via the rows option, this sets how many slides are in each grid row.
    * Default: 1
    */
  var slidesPerRow: js.UndefOr[scala.Double] = js.undefined
  /**
    * # of slides to scroll
    * Default: 1
    */
  var slidesToScroll: js.UndefOr[scala.Double] = js.undefined
  /**
    * # of slides to show
    * Default: 1
    */
  var slidesToShow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Slide/Fade animation speed (ms)
    * Default: 300
    */
  var speed: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable swiping
    * Default: true
    */
  var swipe: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow users to drag or swipe directly to a slide irrespective of slidesToScroll.
    * Default: false
    */
  var swipeToSlide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable slide motion with touch
    * Default: true
    */
  var touchMove: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * To advance slides, the user must swipe a length of (1/touchThreshold) * the width of the slider.
    * Default: 5
    */
  var touchThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Enable/Disable CSS Transitions
    * Default: true
    */
  var useCSS: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable/Disable CSS Transforms
    * Default: true
    */
  var useTransform: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Variable width slides.
    * Default: false
    */
  var variableWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertical slide mode
    * Default: false
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertical swipe mode
    * Default: false
    */
  var verticalSwiping: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Change the slider's direction to become right-to-left
    * Default: false
    */
  var waitForAnimate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the zIndex values for slides, useful for IE9 and lower
    * Default: 1000
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object JQuerySlickOptions {
  @scala.inline
  def apply(
    accessibility: js.UndefOr[scala.Boolean] = js.undefined,
    adaptiveHeight: js.UndefOr[scala.Boolean] = js.undefined,
    appendArrows: stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String | scala.Boolean = null,
    appendDots: stdLib.Element | js.Array[stdLib.Element] | JQuery | java.lang.String = null,
    arrows: js.UndefOr[scala.Boolean] = js.undefined,
    asNavFor: stdLib.Element | JQuery | java.lang.String = null,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplaySpeed: scala.Int | scala.Double = null,
    centerMode: js.UndefOr[scala.Boolean] = js.undefined,
    centerPadding: java.lang.String = null,
    cssEase: java.lang.String = null,
    customPaging: (/* slider */ js.Any, /* i */ scala.Double) => java.lang.String = null,
    dots: js.UndefOr[scala.Boolean] = js.undefined,
    dotsClass: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    easing: java.lang.String = null,
    edgeFriction: scala.Int | scala.Double = null,
    fade: js.UndefOr[scala.Boolean] = js.undefined,
    focusOnSelect: js.UndefOr[scala.Boolean] = js.undefined,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    initialSlide: scala.Int | scala.Double = null,
    lazyLoad: java.lang.String = null,
    mobileFirst: js.UndefOr[scala.Boolean] = js.undefined,
    nextArrow: stdLib.Element | JQuery | java.lang.String = null,
    pauseOnDotsHover: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnFocus: js.UndefOr[scala.Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[scala.Boolean] = js.undefined,
    prevArrow: stdLib.Element | JQuery | java.lang.String = null,
    respondTo: java.lang.String = null,
    responsive: js.Object = null,
    rows: scala.Int | scala.Double = null,
    rtl: js.UndefOr[scala.Boolean] = js.undefined,
    slide: java.lang.String = null,
    slidesPerRow: scala.Int | scala.Double = null,
    slidesToScroll: scala.Int | scala.Double = null,
    slidesToShow: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    swipe: js.UndefOr[scala.Boolean] = js.undefined,
    swipeToSlide: js.UndefOr[scala.Boolean] = js.undefined,
    touchMove: js.UndefOr[scala.Boolean] = js.undefined,
    touchThreshold: scala.Int | scala.Double = null,
    useCSS: js.UndefOr[scala.Boolean] = js.undefined,
    useTransform: js.UndefOr[scala.Boolean] = js.undefined,
    variableWidth: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    verticalSwiping: js.UndefOr[scala.Boolean] = js.undefined,
    waitForAnimate: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): JQuerySlickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility)
    if (!js.isUndefined(adaptiveHeight)) __obj.updateDynamic("adaptiveHeight")(adaptiveHeight)
    if (appendArrows != null) __obj.updateDynamic("appendArrows")(appendArrows.asInstanceOf[js.Any])
    if (appendDots != null) __obj.updateDynamic("appendDots")(appendDots.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows)
    if (asNavFor != null) __obj.updateDynamic("asNavFor")(asNavFor.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(centerMode)) __obj.updateDynamic("centerMode")(centerMode)
    if (centerPadding != null) __obj.updateDynamic("centerPadding")(centerPadding)
    if (cssEase != null) __obj.updateDynamic("cssEase")(cssEase)
    if (customPaging != null) __obj.updateDynamic("customPaging")(js.Any.fromFunction2(customPaging))
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (edgeFriction != null) __obj.updateDynamic("edgeFriction")(edgeFriction.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade)
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (initialSlide != null) __obj.updateDynamic("initialSlide")(initialSlide.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad)
    if (!js.isUndefined(mobileFirst)) __obj.updateDynamic("mobileFirst")(mobileFirst)
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnDotsHover)) __obj.updateDynamic("pauseOnDotsHover")(pauseOnDotsHover)
    if (!js.isUndefined(pauseOnFocus)) __obj.updateDynamic("pauseOnFocus")(pauseOnFocus)
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover)
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow.asInstanceOf[js.Any])
    if (respondTo != null) __obj.updateDynamic("respondTo")(respondTo)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (slide != null) __obj.updateDynamic("slide")(slide)
    if (slidesPerRow != null) __obj.updateDynamic("slidesPerRow")(slidesPerRow.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe)
    if (!js.isUndefined(swipeToSlide)) __obj.updateDynamic("swipeToSlide")(swipeToSlide)
    if (!js.isUndefined(touchMove)) __obj.updateDynamic("touchMove")(touchMove)
    if (touchThreshold != null) __obj.updateDynamic("touchThreshold")(touchThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS)
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform)
    if (!js.isUndefined(variableWidth)) __obj.updateDynamic("variableWidth")(variableWidth)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (!js.isUndefined(verticalSwiping)) __obj.updateDynamic("verticalSwiping")(verticalSwiping)
    if (!js.isUndefined(waitForAnimate)) __obj.updateDynamic("waitForAnimate")(waitForAnimate)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlickOptions]
  }
}

