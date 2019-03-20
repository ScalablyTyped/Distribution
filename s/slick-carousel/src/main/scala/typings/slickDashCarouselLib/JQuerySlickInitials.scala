package typings
package slickDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySlickInitials extends js.Object {
  /**
    * jQuery instance that contains the "dots".
    * Default: null
    */
  @JSName("$dots")
  var $dots: JQuery | scala.Null
  /**
    * jQuery instance that contains the "list".
    * Default: null
    */
  @JSName("$list")
  var $list: scala.Null
  /**
    * jQuery instance that contains the "next arrow".
    * Default: null
    */
  @JSName("$nextArrow")
  var $nextArrow: JQuery | scala.Null
  /**
    * jQuery instance that contains the "prev arrow".
    * Default: null
    */
  @JSName("$prevArrow")
  var $prevArrow: JQuery | scala.Null
  /**
    * jQuery instance that contains the "slide track".
    * Default: null
    */
  @JSName("$slideTrack")
  var $slideTrack: JQuery | scala.Null
  /**
    * jQuery instance that contains the "slides".
    * Default: null
    */
  @JSName("$slides")
  var $slides: JQuery | scala.Null
  /**
    * When there is an animation running.
    * Default: false
    */
  var animating: scala.Boolean
  /**
    * Internal `setInterval` identifier.
    * Default: null
    */
  var autoPlayTimer: scala.Double | scala.Null
  /**
    * The current direction (`0` for left and down, `1` for right and up).
    * Default: 0
    */
  var currentDirection: scala.Double
  /**
    * Default: null
    */
  var currentLeft: scala.Double | scala.Null
  /**
    * The index of the current slide.
    * Default: 0
    */
  var currentSlide: scala.Double
  /**
    * The direction (`0` for left and down, `1` for right and up).
    * Default: null
    */
  var direction: scala.Double
  /**
    * When they user is dragging a slide.
    * Default: false
    */
  var dragging: scala.Boolean
  /**
    * The list's height in pixels.
    * Default: null
    */
  var listHeight: scala.Double | scala.Null
  /**
    * The list's width in pixels.
    * Default: null
    */
  var listWidth: scala.Double | scala.Null
  /**
    * (actually it's not used in Slick, so I don't know what it is...)
    * Default: 0
    */
  var loadIndex: scala.Double
  /**
    * When they user is scrolling a slide.
    * Default: false
    */
  var scrolling: scala.Boolean
  /**
    * The number of slides.
    * Default: null
    */
  var slideCount: scala.Double | scala.Null
  /**
    * Slide offset in pixels.
    * Default: 0
    */
  var slideOffset: scala.Double
  /**
    * The slide's width in pixels.
    * Default: null
    */
  var slideWidth: stdLib.Number | scala.Null
  /**
    * When the slider is sliding.
    * Default: false
    */
  var sliding: scala.Boolean
  /**
    * Default: null
    */
  var swipeLeft: scala.Double | scala.Null
  /**
    * Default: false
    */
  var swiping: scala.Boolean
  /**
    * Object that contains properties relative to "touch" behavior.
    */
  var touchObject: Anon_CurX
  /**
    * Default: false
    */
  var transformsEnabled: scala.Boolean
  /**
    * Default: false
    */
  var unslicked: scala.Boolean
}

object JQuerySlickInitials {
  @scala.inline
  def apply(
    $list: scala.Null,
    animating: scala.Boolean,
    currentDirection: scala.Double,
    currentSlide: scala.Double,
    direction: scala.Double,
    dragging: scala.Boolean,
    loadIndex: scala.Double,
    scrolling: scala.Boolean,
    slideOffset: scala.Double,
    sliding: scala.Boolean,
    swiping: scala.Boolean,
    touchObject: Anon_CurX,
    transformsEnabled: scala.Boolean,
    unslicked: scala.Boolean,
    $dots: JQuery = null,
    $nextArrow: JQuery = null,
    $prevArrow: JQuery = null,
    $slideTrack: JQuery = null,
    $slides: JQuery = null,
    autoPlayTimer: scala.Int | scala.Double = null,
    currentLeft: scala.Int | scala.Double = null,
    listHeight: scala.Int | scala.Double = null,
    listWidth: scala.Int | scala.Double = null,
    slideCount: scala.Int | scala.Double = null,
    slideWidth: stdLib.Number = null,
    swipeLeft: scala.Int | scala.Double = null
  ): JQuerySlickInitials = {
    val __obj = js.Dynamic.literal($list = $list, animating = animating, currentDirection = currentDirection, currentSlide = currentSlide, direction = direction, dragging = dragging, loadIndex = loadIndex, scrolling = scrolling, slideOffset = slideOffset, sliding = sliding, swiping = swiping, touchObject = touchObject, transformsEnabled = transformsEnabled, unslicked = unslicked)
    if ($dots != null) __obj.updateDynamic("$dots")($dots)
    if ($nextArrow != null) __obj.updateDynamic("$nextArrow")($nextArrow)
    if ($prevArrow != null) __obj.updateDynamic("$prevArrow")($prevArrow)
    if ($slideTrack != null) __obj.updateDynamic("$slideTrack")($slideTrack)
    if ($slides != null) __obj.updateDynamic("$slides")($slides)
    if (autoPlayTimer != null) __obj.updateDynamic("autoPlayTimer")(autoPlayTimer.asInstanceOf[js.Any])
    if (currentLeft != null) __obj.updateDynamic("currentLeft")(currentLeft.asInstanceOf[js.Any])
    if (listHeight != null) __obj.updateDynamic("listHeight")(listHeight.asInstanceOf[js.Any])
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (slideCount != null) __obj.updateDynamic("slideCount")(slideCount.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth)
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(swipeLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlickInitials]
  }
}

