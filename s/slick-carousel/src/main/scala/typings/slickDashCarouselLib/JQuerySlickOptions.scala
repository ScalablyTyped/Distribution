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

