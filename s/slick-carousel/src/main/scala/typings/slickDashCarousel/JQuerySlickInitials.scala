package typings.slickDashCarousel

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuerySlickInitials extends js.Object {
  /**
    * jQuery instance that contains the "dots".
    * Default: null
    */
  @JSName("$dots")
  var $dots: JQuery | Null
  /**
    * jQuery instance that contains the "list".
    * Default: null
    */
  @JSName("$list")
  var $list: Null
  /**
    * jQuery instance that contains the "next arrow".
    * Default: null
    */
  @JSName("$nextArrow")
  var $nextArrow: JQuery | Null
  /**
    * jQuery instance that contains the "prev arrow".
    * Default: null
    */
  @JSName("$prevArrow")
  var $prevArrow: JQuery | Null
  /**
    * jQuery instance that contains the "slide track".
    * Default: null
    */
  @JSName("$slideTrack")
  var $slideTrack: JQuery | Null
  /**
    * jQuery instance that contains the "slides".
    * Default: null
    */
  @JSName("$slides")
  var $slides: JQuery | Null
  /**
    * When there is an animation running.
    * Default: false
    */
  var animating: Boolean
  /**
    * Internal `setInterval` identifier.
    * Default: null
    */
  var autoPlayTimer: Double | Null
  /**
    * The current direction (`0` for left and down, `1` for right and up).
    * Default: 0
    */
  var currentDirection: Double
  /**
    * Default: null
    */
  var currentLeft: Double | Null
  /**
    * The index of the current slide.
    * Default: 0
    */
  var currentSlide: Double
  /**
    * The direction (`0` for left and down, `1` for right and up).
    * Default: null
    */
  var direction: Double
  /**
    * When they user is dragging a slide.
    * Default: false
    */
  var dragging: Boolean
  /**
    * The list's height in pixels.
    * Default: null
    */
  var listHeight: Double | Null
  /**
    * The list's width in pixels.
    * Default: null
    */
  var listWidth: Double | Null
  /**
    * (actually it's not used in Slick, so I don't know what it is...)
    * Default: 0
    */
  var loadIndex: Double
  /**
    * When they user is scrolling a slide.
    * Default: false
    */
  var scrolling: Boolean
  /**
    * The number of slides.
    * Default: null
    */
  var slideCount: Double | Null
  /**
    * Slide offset in pixels.
    * Default: 0
    */
  var slideOffset: Double
  /**
    * The slide's width in pixels.
    * Default: null
    */
  var slideWidth: Number | Null
  /**
    * When the slider is sliding.
    * Default: false
    */
  var sliding: Boolean
  /**
    * Default: null
    */
  var swipeLeft: Double | Null
  /**
    * Default: false
    */
  var swiping: Boolean
  /**
    * Object that contains properties relative to "touch" behavior.
    */
  var touchObject: Anon_CurX
  /**
    * Default: false
    */
  var transformsEnabled: Boolean
  /**
    * Default: false
    */
  var unslicked: Boolean
}

object JQuerySlickInitials {
  @scala.inline
  def apply(
    $list: Null,
    animating: Boolean,
    currentDirection: Double,
    currentSlide: Double,
    direction: Double,
    dragging: Boolean,
    loadIndex: Double,
    scrolling: Boolean,
    slideOffset: Double,
    sliding: Boolean,
    swiping: Boolean,
    touchObject: Anon_CurX,
    transformsEnabled: Boolean,
    unslicked: Boolean,
    $dots: JQuery = null,
    $nextArrow: JQuery = null,
    $prevArrow: JQuery = null,
    $slideTrack: JQuery = null,
    $slides: JQuery = null,
    autoPlayTimer: Int | Double = null,
    currentLeft: Int | Double = null,
    listHeight: Int | Double = null,
    listWidth: Int | Double = null,
    slideCount: Int | Double = null,
    slideWidth: Number = null,
    swipeLeft: Int | Double = null
  ): JQuerySlickInitials = {
    val __obj = js.Dynamic.literal($list = $list.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], currentDirection = currentDirection.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], loadIndex = loadIndex.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], slideOffset = slideOffset.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], touchObject = touchObject.asInstanceOf[js.Any], transformsEnabled = transformsEnabled.asInstanceOf[js.Any], unslicked = unslicked.asInstanceOf[js.Any])
    if ($dots != null) __obj.updateDynamic("$dots")($dots.asInstanceOf[js.Any])
    if ($nextArrow != null) __obj.updateDynamic("$nextArrow")($nextArrow.asInstanceOf[js.Any])
    if ($prevArrow != null) __obj.updateDynamic("$prevArrow")($prevArrow.asInstanceOf[js.Any])
    if ($slideTrack != null) __obj.updateDynamic("$slideTrack")($slideTrack.asInstanceOf[js.Any])
    if ($slides != null) __obj.updateDynamic("$slides")($slides.asInstanceOf[js.Any])
    if (autoPlayTimer != null) __obj.updateDynamic("autoPlayTimer")(autoPlayTimer.asInstanceOf[js.Any])
    if (currentLeft != null) __obj.updateDynamic("currentLeft")(currentLeft.asInstanceOf[js.Any])
    if (listHeight != null) __obj.updateDynamic("listHeight")(listHeight.asInstanceOf[js.Any])
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (slideCount != null) __obj.updateDynamic("slideCount")(slideCount.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(swipeLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlickInitials]
  }
}

