package typings.slickDashCarousel

import org.scalablytyped.runtime.NumberDictionary
import typings.slickDashCarousel.slickDashCarouselNumbers.`false`
import typings.slickDashCarousel.slickDashCarouselStrings.MozTransform
import typings.slickDashCarousel.slickDashCarouselStrings.MozTransition
import typings.slickDashCarousel.slickDashCarouselStrings.OTransform
import typings.slickDashCarousel.slickDashCarouselStrings.OTransition
import typings.slickDashCarousel.slickDashCarouselStrings.`-moz-transform`
import typings.slickDashCarousel.slickDashCarouselStrings.`-ms-transform`
import typings.slickDashCarousel.slickDashCarouselStrings.`-o-transform`
import typings.slickDashCarousel.slickDashCarouselStrings.`-webkit-transform`
import typings.slickDashCarousel.slickDashCarouselStrings.hidden
import typings.slickDashCarousel.slickDashCarouselStrings.left
import typings.slickDashCarousel.slickDashCarouselStrings.min
import typings.slickDashCarousel.slickDashCarouselStrings.mozHidden
import typings.slickDashCarousel.slickDashCarouselStrings.mozvisibilitychange
import typings.slickDashCarousel.slickDashCarouselStrings.msTransform
import typings.slickDashCarousel.slickDashCarouselStrings.msTransition
import typings.slickDashCarousel.slickDashCarouselStrings.slider
import typings.slickDashCarousel.slickDashCarouselStrings.top
import typings.slickDashCarousel.slickDashCarouselStrings.transform
import typings.slickDashCarousel.slickDashCarouselStrings.transition
import typings.slickDashCarousel.slickDashCarouselStrings.visibilitychange
import typings.slickDashCarousel.slickDashCarouselStrings.webkitHidden
import typings.slickDashCarousel.slickDashCarouselStrings.webkitTransform
import typings.slickDashCarousel.slickDashCarouselStrings.webkitTransition
import typings.slickDashCarousel.slickDashCarouselStrings.webkitvisibilitychange
import typings.slickDashCarousel.slickDashCarouselStrings.window
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySlick extends JQuerySlickInitials {
  /**
    * Default: $(element)
    */
  @JSName("$slider")
  var $slider: JQuery
  /**
    * Default: null
    */
  @JSName("$slidesCache")
  var $slidesCache: JQuery | Null
  /**
    * Default: null
    */
  var activeBreakpoint: Double | Null
  /**
    * Default: null
    */
  var animProp: Null
  /**
    * Default: null
    */
  var animType: OTransform | MozTransform | webkitTransform | msTransform | transform | `false` | Null
  /**
    * Default: {}
    */
  var breakpointSettings: NumberDictionary[JQuerySlickOptions]
  /**
    * Default: []
    */
  var breakpoints: js.Array[Double]
  /**
    * Default: false
    */
  var cssTransitions: Boolean
  var defaults: JQuerySlickOptions
  /**
    * Default: false
    */
  var focussed: Boolean
  /**
    * Default: 'hidden'
    */
  var hidden: mozHidden | webkitHidden | typings.slickDashCarousel.slickDashCarouselStrings.hidden
  var initials: JQuerySlickInitials
  /**
    * Default: false
    */
  var interrupted: Boolean
  var options: JQuerySlickOptions
  var originalSettings: JQuerySlickOptions
  /**
    * Default: true
    */
  var paused: Boolean
  /**
    * Default: null
    */
  var positionProp: top | left | Null
  /**
    * Default: null
    */
  var respondTo: window | slider | min | Null
  /**
    * Default: 1
    */
  var rowCount: Double
  /**
    * Default: true
    */
  var shouldClick: Boolean
  /**
    * Default: null
    */
  var transformType: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition | Null
  /**
    * Default: null
    */
  var transitionType: OTransition | MozTransition | webkitTransition | msTransition | transition | Null
  /**
    * Default: 'visibilitychange'
    */
  var visibilityChange: visibilitychange | mozvisibilitychange | webkitvisibilitychange
  /**
    * Default: null
    */
  var windowTimer: Double | Null
  /**
    * Default: 0
    */
  var windowWidth: Double
}

object JQuerySlick {
  @scala.inline
  def apply(
    $list: Null,
    $slider: JQuery,
    animProp: Null,
    animating: Boolean,
    breakpointSettings: NumberDictionary[JQuerySlickOptions],
    breakpoints: js.Array[Double],
    cssTransitions: Boolean,
    currentDirection: Double,
    currentSlide: Double,
    defaults: JQuerySlickOptions,
    direction: Double,
    dragging: Boolean,
    focussed: Boolean,
    hidden: mozHidden | webkitHidden | hidden,
    initials: JQuerySlickInitials,
    interrupted: Boolean,
    loadIndex: Double,
    options: JQuerySlickOptions,
    originalSettings: JQuerySlickOptions,
    paused: Boolean,
    rowCount: Double,
    scrolling: Boolean,
    shouldClick: Boolean,
    slideOffset: Double,
    sliding: Boolean,
    swiping: Boolean,
    touchObject: Anon_CurX,
    transformsEnabled: Boolean,
    unslicked: Boolean,
    visibilityChange: visibilitychange | mozvisibilitychange | webkitvisibilitychange,
    windowWidth: Double,
    $dots: JQuery = null,
    $nextArrow: JQuery = null,
    $prevArrow: JQuery = null,
    $slideTrack: JQuery = null,
    $slides: JQuery = null,
    $slidesCache: JQuery = null,
    activeBreakpoint: Int | Double = null,
    animType: OTransform | MozTransform | webkitTransform | msTransform | transform | `false` = null,
    autoPlayTimer: Int | Double = null,
    currentLeft: Int | Double = null,
    listHeight: Int | Double = null,
    listWidth: Int | Double = null,
    positionProp: top | left = null,
    respondTo: window | slider | min = null,
    slideCount: Int | Double = null,
    slideWidth: Number = null,
    swipeLeft: Int | Double = null,
    transformType: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition = null,
    transitionType: OTransition | MozTransition | webkitTransition | msTransition | transition = null,
    windowTimer: Int | Double = null
  ): JQuerySlick = {
    val __obj = js.Dynamic.literal($list = $list, $slider = $slider, animProp = animProp, animating = animating, breakpointSettings = breakpointSettings, breakpoints = breakpoints, cssTransitions = cssTransitions, currentDirection = currentDirection, currentSlide = currentSlide, defaults = defaults, direction = direction, dragging = dragging, focussed = focussed, hidden = hidden.asInstanceOf[js.Any], initials = initials, interrupted = interrupted, loadIndex = loadIndex, options = options, originalSettings = originalSettings, paused = paused, rowCount = rowCount, scrolling = scrolling, shouldClick = shouldClick, slideOffset = slideOffset, sliding = sliding, swiping = swiping, touchObject = touchObject, transformsEnabled = transformsEnabled, unslicked = unslicked, visibilityChange = visibilityChange.asInstanceOf[js.Any], windowWidth = windowWidth)
    if ($dots != null) __obj.updateDynamic("$dots")($dots)
    if ($nextArrow != null) __obj.updateDynamic("$nextArrow")($nextArrow)
    if ($prevArrow != null) __obj.updateDynamic("$prevArrow")($prevArrow)
    if ($slideTrack != null) __obj.updateDynamic("$slideTrack")($slideTrack)
    if ($slides != null) __obj.updateDynamic("$slides")($slides)
    if ($slidesCache != null) __obj.updateDynamic("$slidesCache")($slidesCache)
    if (activeBreakpoint != null) __obj.updateDynamic("activeBreakpoint")(activeBreakpoint.asInstanceOf[js.Any])
    if (animType != null) __obj.updateDynamic("animType")(animType.asInstanceOf[js.Any])
    if (autoPlayTimer != null) __obj.updateDynamic("autoPlayTimer")(autoPlayTimer.asInstanceOf[js.Any])
    if (currentLeft != null) __obj.updateDynamic("currentLeft")(currentLeft.asInstanceOf[js.Any])
    if (listHeight != null) __obj.updateDynamic("listHeight")(listHeight.asInstanceOf[js.Any])
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (positionProp != null) __obj.updateDynamic("positionProp")(positionProp.asInstanceOf[js.Any])
    if (respondTo != null) __obj.updateDynamic("respondTo")(respondTo.asInstanceOf[js.Any])
    if (slideCount != null) __obj.updateDynamic("slideCount")(slideCount.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth)
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(swipeLeft.asInstanceOf[js.Any])
    if (transformType != null) __obj.updateDynamic("transformType")(transformType.asInstanceOf[js.Any])
    if (transitionType != null) __obj.updateDynamic("transitionType")(transitionType.asInstanceOf[js.Any])
    if (windowTimer != null) __obj.updateDynamic("windowTimer")(windowTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlick]
  }
}

