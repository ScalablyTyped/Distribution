package typings
package slickDashCarouselLib

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
  var $slidesCache: JQuery | scala.Null
  /**
    * Default: null
    */
  var activeBreakpoint: scala.Double | scala.Null
  /**
    * Default: null
    */
  var animProp: scala.Null
  /**
    * Default: null
    */
  var animType: slickDashCarouselLib.slickDashCarouselLibStrings.OTransform | slickDashCarouselLib.slickDashCarouselLibStrings.MozTransform | slickDashCarouselLib.slickDashCarouselLibStrings.webkitTransform | slickDashCarouselLib.slickDashCarouselLibStrings.msTransform | slickDashCarouselLib.slickDashCarouselLibStrings.transform | slickDashCarouselLib.slickDashCarouselLibNumbers.`false` | scala.Null
  /**
    * Default: {}
    */
  var breakpointSettings: org.scalablytyped.runtime.NumberDictionary[JQuerySlickOptions]
  /**
    * Default: []
    */
  var breakpoints: js.Array[scala.Double]
  /**
    * Default: false
    */
  var cssTransitions: scala.Boolean
  var defaults: JQuerySlickOptions
  /**
    * Default: false
    */
  var focussed: scala.Boolean
  /**
    * Default: 'hidden'
    */
  var hidden: slickDashCarouselLib.slickDashCarouselLibStrings.mozHidden | slickDashCarouselLib.slickDashCarouselLibStrings.webkitHidden | slickDashCarouselLib.slickDashCarouselLibStrings.hidden
  var initials: JQuerySlickInitials
  /**
    * Default: false
    */
  var interrupted: scala.Boolean
  var options: JQuerySlickOptions
  var originalSettings: JQuerySlickOptions
  /**
    * Default: true
    */
  var paused: scala.Boolean
  /**
    * Default: null
    */
  var positionProp: slickDashCarouselLib.slickDashCarouselLibStrings.top | slickDashCarouselLib.slickDashCarouselLibStrings.left | scala.Null
  /**
    * Default: null
    */
  var respondTo: slickDashCarouselLib.slickDashCarouselLibStrings.window | slickDashCarouselLib.slickDashCarouselLibStrings.slider | slickDashCarouselLib.slickDashCarouselLibStrings.min | scala.Null
  /**
    * Default: 1
    */
  var rowCount: scala.Double
  /**
    * Default: true
    */
  var shouldClick: scala.Boolean
  /**
    * Default: null
    */
  var transformType: slickDashCarouselLib.slickDashCarouselLibStrings.`-o-transform` | slickDashCarouselLib.slickDashCarouselLibStrings.`-moz-transform` | slickDashCarouselLib.slickDashCarouselLibStrings.`-webkit-transform` | slickDashCarouselLib.slickDashCarouselLibStrings.`-ms-transform` | slickDashCarouselLib.slickDashCarouselLibStrings.transition | scala.Null
  /**
    * Default: null
    */
  var transitionType: slickDashCarouselLib.slickDashCarouselLibStrings.OTransition | slickDashCarouselLib.slickDashCarouselLibStrings.MozTransition | slickDashCarouselLib.slickDashCarouselLibStrings.webkitTransition | slickDashCarouselLib.slickDashCarouselLibStrings.msTransition | slickDashCarouselLib.slickDashCarouselLibStrings.transition | scala.Null
  /**
    * Default: 'visibilitychange'
    */
  var visibilityChange: slickDashCarouselLib.slickDashCarouselLibStrings.visibilitychange | slickDashCarouselLib.slickDashCarouselLibStrings.mozvisibilitychange | slickDashCarouselLib.slickDashCarouselLibStrings.webkitvisibilitychange
  /**
    * Default: null
    */
  var windowTimer: scala.Double | scala.Null
  /**
    * Default: 0
    */
  var windowWidth: scala.Double
}

object JQuerySlick {
  @scala.inline
  def apply(
    $list: scala.Null,
    $slider: JQuery,
    animProp: scala.Null,
    animating: scala.Boolean,
    breakpointSettings: org.scalablytyped.runtime.NumberDictionary[JQuerySlickOptions],
    breakpoints: js.Array[scala.Double],
    cssTransitions: scala.Boolean,
    currentDirection: scala.Double,
    currentSlide: scala.Double,
    defaults: JQuerySlickOptions,
    direction: scala.Double,
    dragging: scala.Boolean,
    focussed: scala.Boolean,
    hidden: slickDashCarouselLib.slickDashCarouselLibStrings.mozHidden | slickDashCarouselLib.slickDashCarouselLibStrings.webkitHidden | slickDashCarouselLib.slickDashCarouselLibStrings.hidden,
    initials: JQuerySlickInitials,
    interrupted: scala.Boolean,
    loadIndex: scala.Double,
    options: JQuerySlickOptions,
    originalSettings: JQuerySlickOptions,
    paused: scala.Boolean,
    rowCount: scala.Double,
    scrolling: scala.Boolean,
    shouldClick: scala.Boolean,
    slideOffset: scala.Double,
    sliding: scala.Boolean,
    swiping: scala.Boolean,
    touchObject: Anon_CurX,
    transformsEnabled: scala.Boolean,
    unslicked: scala.Boolean,
    visibilityChange: slickDashCarouselLib.slickDashCarouselLibStrings.visibilitychange | slickDashCarouselLib.slickDashCarouselLibStrings.mozvisibilitychange | slickDashCarouselLib.slickDashCarouselLibStrings.webkitvisibilitychange,
    windowWidth: scala.Double,
    $dots: JQuery = null,
    $nextArrow: JQuery = null,
    $prevArrow: JQuery = null,
    $slideTrack: JQuery = null,
    $slides: JQuery = null,
    $slidesCache: JQuery = null,
    activeBreakpoint: scala.Int | scala.Double = null,
    animType: slickDashCarouselLib.slickDashCarouselLibStrings.OTransform | slickDashCarouselLib.slickDashCarouselLibStrings.MozTransform | slickDashCarouselLib.slickDashCarouselLibStrings.webkitTransform | slickDashCarouselLib.slickDashCarouselLibStrings.msTransform | slickDashCarouselLib.slickDashCarouselLibStrings.transform | slickDashCarouselLib.slickDashCarouselLibNumbers.`false` = null,
    autoPlayTimer: scala.Int | scala.Double = null,
    currentLeft: scala.Int | scala.Double = null,
    listHeight: scala.Int | scala.Double = null,
    listWidth: scala.Int | scala.Double = null,
    positionProp: slickDashCarouselLib.slickDashCarouselLibStrings.top | slickDashCarouselLib.slickDashCarouselLibStrings.left = null,
    respondTo: slickDashCarouselLib.slickDashCarouselLibStrings.window | slickDashCarouselLib.slickDashCarouselLibStrings.slider | slickDashCarouselLib.slickDashCarouselLibStrings.min = null,
    slideCount: scala.Int | scala.Double = null,
    slideWidth: stdLib.Number = null,
    swipeLeft: scala.Int | scala.Double = null,
    transformType: slickDashCarouselLib.slickDashCarouselLibStrings.`-o-transform` | slickDashCarouselLib.slickDashCarouselLibStrings.`-moz-transform` | slickDashCarouselLib.slickDashCarouselLibStrings.`-webkit-transform` | slickDashCarouselLib.slickDashCarouselLibStrings.`-ms-transform` | slickDashCarouselLib.slickDashCarouselLibStrings.transition = null,
    transitionType: slickDashCarouselLib.slickDashCarouselLibStrings.OTransition | slickDashCarouselLib.slickDashCarouselLibStrings.MozTransition | slickDashCarouselLib.slickDashCarouselLibStrings.webkitTransition | slickDashCarouselLib.slickDashCarouselLibStrings.msTransition | slickDashCarouselLib.slickDashCarouselLibStrings.transition = null,
    windowTimer: scala.Int | scala.Double = null
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

