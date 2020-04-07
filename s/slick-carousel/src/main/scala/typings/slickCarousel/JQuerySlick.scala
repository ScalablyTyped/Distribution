package typings.slickCarousel

import org.scalablytyped.runtime.NumberDictionary
import typings.slickCarousel.slickCarouselBooleans.`false`
import typings.slickCarousel.slickCarouselStrings.MozTransform
import typings.slickCarousel.slickCarouselStrings.MozTransition
import typings.slickCarousel.slickCarouselStrings.OTransform
import typings.slickCarousel.slickCarouselStrings.OTransition
import typings.slickCarousel.slickCarouselStrings.`-moz-transform`
import typings.slickCarousel.slickCarouselStrings.`-ms-transform`
import typings.slickCarousel.slickCarouselStrings.`-o-transform`
import typings.slickCarousel.slickCarouselStrings.`-webkit-transform`
import typings.slickCarousel.slickCarouselStrings.hidden
import typings.slickCarousel.slickCarouselStrings.left
import typings.slickCarousel.slickCarouselStrings.min
import typings.slickCarousel.slickCarouselStrings.mozHidden
import typings.slickCarousel.slickCarouselStrings.mozvisibilitychange
import typings.slickCarousel.slickCarouselStrings.msTransform
import typings.slickCarousel.slickCarouselStrings.msTransition
import typings.slickCarousel.slickCarouselStrings.slider
import typings.slickCarousel.slickCarouselStrings.top
import typings.slickCarousel.slickCarouselStrings.transform
import typings.slickCarousel.slickCarouselStrings.transition
import typings.slickCarousel.slickCarouselStrings.visibilitychange
import typings.slickCarousel.slickCarouselStrings.webkitHidden
import typings.slickCarousel.slickCarouselStrings.webkitTransform
import typings.slickCarousel.slickCarouselStrings.webkitTransition
import typings.slickCarousel.slickCarouselStrings.webkitvisibilitychange
import typings.slickCarousel.slickCarouselStrings.window
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
  var hidden: mozHidden | webkitHidden | typings.slickCarousel.slickCarouselStrings.hidden
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
    touchObject: AnonCurX,
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
    val __obj = js.Dynamic.literal($list = $list.asInstanceOf[js.Any], $slider = $slider.asInstanceOf[js.Any], animProp = animProp.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any], breakpointSettings = breakpointSettings.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], cssTransitions = cssTransitions.asInstanceOf[js.Any], currentDirection = currentDirection.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], focussed = focussed.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], initials = initials.asInstanceOf[js.Any], interrupted = interrupted.asInstanceOf[js.Any], loadIndex = loadIndex.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], originalSettings = originalSettings.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], shouldClick = shouldClick.asInstanceOf[js.Any], slideOffset = slideOffset.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], touchObject = touchObject.asInstanceOf[js.Any], transformsEnabled = transformsEnabled.asInstanceOf[js.Any], unslicked = unslicked.asInstanceOf[js.Any], visibilityChange = visibilityChange.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    if ($dots != null) __obj.updateDynamic("$dots")($dots.asInstanceOf[js.Any])
    if ($nextArrow != null) __obj.updateDynamic("$nextArrow")($nextArrow.asInstanceOf[js.Any])
    if ($prevArrow != null) __obj.updateDynamic("$prevArrow")($prevArrow.asInstanceOf[js.Any])
    if ($slideTrack != null) __obj.updateDynamic("$slideTrack")($slideTrack.asInstanceOf[js.Any])
    if ($slides != null) __obj.updateDynamic("$slides")($slides.asInstanceOf[js.Any])
    if ($slidesCache != null) __obj.updateDynamic("$slidesCache")($slidesCache.asInstanceOf[js.Any])
    if (activeBreakpoint != null) __obj.updateDynamic("activeBreakpoint")(activeBreakpoint.asInstanceOf[js.Any])
    if (animType != null) __obj.updateDynamic("animType")(animType.asInstanceOf[js.Any])
    if (autoPlayTimer != null) __obj.updateDynamic("autoPlayTimer")(autoPlayTimer.asInstanceOf[js.Any])
    if (currentLeft != null) __obj.updateDynamic("currentLeft")(currentLeft.asInstanceOf[js.Any])
    if (listHeight != null) __obj.updateDynamic("listHeight")(listHeight.asInstanceOf[js.Any])
    if (listWidth != null) __obj.updateDynamic("listWidth")(listWidth.asInstanceOf[js.Any])
    if (positionProp != null) __obj.updateDynamic("positionProp")(positionProp.asInstanceOf[js.Any])
    if (respondTo != null) __obj.updateDynamic("respondTo")(respondTo.asInstanceOf[js.Any])
    if (slideCount != null) __obj.updateDynamic("slideCount")(slideCount.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (swipeLeft != null) __obj.updateDynamic("swipeLeft")(swipeLeft.asInstanceOf[js.Any])
    if (transformType != null) __obj.updateDynamic("transformType")(transformType.asInstanceOf[js.Any])
    if (transitionType != null) __obj.updateDynamic("transitionType")(transitionType.asInstanceOf[js.Any])
    if (windowTimer != null) __obj.updateDynamic("windowTimer")(windowTimer.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuerySlick]
  }
}

