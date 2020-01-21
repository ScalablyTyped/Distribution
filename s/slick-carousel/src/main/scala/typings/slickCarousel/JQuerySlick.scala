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
  var hidden: mozHidden | webkitHidden | typings.slickCarousel.slickCarouselStrings.hidden = js.native
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

