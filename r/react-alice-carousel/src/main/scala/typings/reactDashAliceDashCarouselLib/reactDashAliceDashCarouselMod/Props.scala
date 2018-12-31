package typings
package reactDashAliceDashCarouselLib.reactDashAliceDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
  	 *  Set auto play mode
  	 *
  	 * Default: false.
  	 */
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If this property is identified as true auto play animation will be stopped after clicking user on any gallery button
  	 *
  	 * Default: false.
  	 */
  var autoPlayActionDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * To run auto play in the left direction specify rtl value
  	 *
  	 * Default: 'ltr'.
  	 */
  var autoPlayDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Interval of auto play animation (milliseconds). If specified, a larger value will be taken from comparing this property and the duration one
  	 *
  	 * Default: 250.
  	 */
  var autoPlayInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Disable buttons control
  	 *
  	 * Default: false.
  	 */
  var buttonsDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Disable dots navigation
  	 *
  	 * Default: false.
  	 */
  var dotsDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Duration of slides transition (milliseconds)
  	 *
  	 * Default: 250.
  	 */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Enable fadeout animation. Fired when 1 item is in the slide
  	 *
  	 * Default: false.
  	 */
  var fadeOutAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Disable infinite mode
  	 *
  	 * Default: true.
  	 */
  var infinite: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Disable keys controls (left, right, space)
  	 *
  	 * Default: false.
  	 */
  var keysControlDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The offset of the alert from the page border, can be any number.
  	 *
  	 * Default: 14.
  	 */
  var mouseDragEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Fired when the event object is changing / returns event object
  	 */
  var onSlideChange: js.UndefOr[js.Function1[/* e */ EventObject, scala.Unit]] = js.undefined
  /**
  	 * Fired when the event object was changed / returns event object
  	 */
  var onSlideChanged: js.UndefOr[js.Function1[/* e */ EventObject, scala.Unit]] = js.undefined
  /**
  	 * Disable play/pause button
  	 *
  	 * Default: false.
  	 */
  var playButtonEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Number of items in the slide.
  	 *
  	 * Default: {}.
  	 */
  var responsive: js.UndefOr[js.Object] = js.undefined
  /**
  	 * Sets the carousel at the specified position
  	 *
  	 * Default: 0.
  	 */
  var slideToIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The starting index of the carousel
  	 *
  	 * Default: 0.
  	 */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Disable swipe handlers
  	 *
  	 * Default: false.
  	 */
  var swipeDisabled: js.UndefOr[scala.Boolean] = js.undefined
}

