package typings.slickDashCarousel

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySlickInitials extends js.Object {
  /**
    * jQuery instance that contains the "dots".
    * Default: null
    */
  @JSName("$dots")
  var $dots: JQuery | Null = js.native
  /**
    * jQuery instance that contains the "list".
    * Default: null
    */
  @JSName("$list")
  var $list: Null = js.native
  /**
    * jQuery instance that contains the "next arrow".
    * Default: null
    */
  @JSName("$nextArrow")
  var $nextArrow: JQuery | Null = js.native
  /**
    * jQuery instance that contains the "prev arrow".
    * Default: null
    */
  @JSName("$prevArrow")
  var $prevArrow: JQuery | Null = js.native
  /**
    * jQuery instance that contains the "slide track".
    * Default: null
    */
  @JSName("$slideTrack")
  var $slideTrack: JQuery | Null = js.native
  /**
    * jQuery instance that contains the "slides".
    * Default: null
    */
  @JSName("$slides")
  var $slides: JQuery | Null = js.native
  /**
    * When there is an animation running.
    * Default: false
    */
  var animating: Boolean = js.native
  /**
    * Internal `setInterval` identifier.
    * Default: null
    */
  var autoPlayTimer: Double | Null = js.native
  /**
    * The current direction (`0` for left and down, `1` for right and up).
    * Default: 0
    */
  var currentDirection: Double = js.native
  /**
    * Default: null
    */
  var currentLeft: Double | Null = js.native
  /**
    * The index of the current slide.
    * Default: 0
    */
  var currentSlide: Double = js.native
  /**
    * The direction (`0` for left and down, `1` for right and up).
    * Default: null
    */
  var direction: Double = js.native
  /**
    * When they user is dragging a slide.
    * Default: false
    */
  var dragging: Boolean = js.native
  /**
    * The list's height in pixels.
    * Default: null
    */
  var listHeight: Double | Null = js.native
  /**
    * The list's width in pixels.
    * Default: null
    */
  var listWidth: Double | Null = js.native
  /**
    * (actually it's not used in Slick, so I don't know what it is...)
    * Default: 0
    */
  var loadIndex: Double = js.native
  /**
    * When they user is scrolling a slide.
    * Default: false
    */
  var scrolling: Boolean = js.native
  /**
    * The number of slides.
    * Default: null
    */
  var slideCount: Double | Null = js.native
  /**
    * Slide offset in pixels.
    * Default: 0
    */
  var slideOffset: Double = js.native
  /**
    * The slide's width in pixels.
    * Default: null
    */
  var slideWidth: Number | Null = js.native
  /**
    * When the slider is sliding.
    * Default: false
    */
  var sliding: Boolean = js.native
  /**
    * Default: null
    */
  var swipeLeft: Double | Null = js.native
  /**
    * Default: false
    */
  var swiping: Boolean = js.native
  /**
    * Object that contains properties relative to "touch" behavior.
    */
  var touchObject: Anon_CurX = js.native
  /**
    * Default: false
    */
  var transformsEnabled: Boolean = js.native
  /**
    * Default: false
    */
  var unslicked: Boolean = js.native
}

