package typings.slickDashCarousel

import org.scalablytyped.runtime.NumberDictionary
import typings.slickDashCarousel.slickDashCarouselBooleans.`false`
import typings.slickDashCarousel.slickDashCarouselStrings.MozTransform
import typings.slickDashCarousel.slickDashCarouselStrings.MozTransition
import typings.slickDashCarousel.slickDashCarouselStrings.OTransform
import typings.slickDashCarousel.slickDashCarouselStrings.OTransition
import typings.slickDashCarousel.slickDashCarouselStrings.`-moz-transform`
import typings.slickDashCarousel.slickDashCarouselStrings.`-ms-transform`
import typings.slickDashCarousel.slickDashCarouselStrings.`-o-transform`
import typings.slickDashCarousel.slickDashCarouselStrings.`-webkit-transform`
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuerySlick extends JQuerySlickInitials {
  /**
    * Default: $(element)
    */
  @JSName("$slider")
  var $slider: JQuery = js.native
  /**
    * Default: null
    */
  @JSName("$slidesCache")
  var $slidesCache: JQuery | Null = js.native
  /**
    * Default: null
    */
  var activeBreakpoint: Double | Null = js.native
  /**
    * Default: null
    */
  var animProp: Null = js.native
  /**
    * Default: null
    */
  var animType: OTransform | MozTransform | webkitTransform | msTransform | transform | `false` | Null = js.native
  /**
    * Default: {}
    */
  var breakpointSettings: NumberDictionary[JQuerySlickOptions] = js.native
  /**
    * Default: []
    */
  var breakpoints: js.Array[Double] = js.native
  /**
    * Default: false
    */
  var cssTransitions: Boolean = js.native
  var defaults: JQuerySlickOptions = js.native
  /**
    * Default: false
    */
  var focussed: Boolean = js.native
  /**
    * Default: 'hidden'
    */
  var hidden: mozHidden | webkitHidden | typings.slickDashCarousel.slickDashCarouselStrings.hidden = js.native
  var initials: JQuerySlickInitials = js.native
  /**
    * Default: false
    */
  var interrupted: Boolean = js.native
  var options: JQuerySlickOptions = js.native
  var originalSettings: JQuerySlickOptions = js.native
  /**
    * Default: true
    */
  var paused: Boolean = js.native
  /**
    * Default: null
    */
  var positionProp: top | left | Null = js.native
  /**
    * Default: null
    */
  var respondTo: window | slider | min | Null = js.native
  /**
    * Default: 1
    */
  var rowCount: Double = js.native
  /**
    * Default: true
    */
  var shouldClick: Boolean = js.native
  /**
    * Default: null
    */
  var transformType: `-o-transform` | `-moz-transform` | `-webkit-transform` | `-ms-transform` | transition | Null = js.native
  /**
    * Default: null
    */
  var transitionType: OTransition | MozTransition | webkitTransition | msTransition | transition | Null = js.native
  /**
    * Default: 'visibilitychange'
    */
  var visibilityChange: visibilitychange | mozvisibilitychange | webkitvisibilitychange = js.native
  /**
    * Default: null
    */
  var windowTimer: Double | Null = js.native
  /**
    * Default: 0
    */
  var windowWidth: Double = js.native
}

