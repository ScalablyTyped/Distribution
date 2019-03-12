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

object Props {
  @scala.inline
  def apply(
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    autoPlayActionDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    autoPlayDirection: java.lang.String = null,
    autoPlayInterval: scala.Int | scala.Double = null,
    buttonsDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    dotsDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    fadeOutAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    infinite: js.UndefOr[scala.Boolean] = js.undefined,
    keysControlDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    mouseDragEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    onSlideChange: /* e */ EventObject => scala.Unit = null,
    onSlideChanged: /* e */ EventObject => scala.Unit = null,
    playButtonEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: js.Object = null,
    slideToIndex: scala.Int | scala.Double = null,
    startIndex: scala.Int | scala.Double = null,
    swipeDisabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (!js.isUndefined(autoPlayActionDisabled)) __obj.updateDynamic("autoPlayActionDisabled")(autoPlayActionDisabled)
    if (autoPlayDirection != null) __obj.updateDynamic("autoPlayDirection")(autoPlayDirection)
    if (autoPlayInterval != null) __obj.updateDynamic("autoPlayInterval")(autoPlayInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonsDisabled)) __obj.updateDynamic("buttonsDisabled")(buttonsDisabled)
    if (!js.isUndefined(dotsDisabled)) __obj.updateDynamic("dotsDisabled")(dotsDisabled)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(fadeOutAnimation)) __obj.updateDynamic("fadeOutAnimation")(fadeOutAnimation)
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite)
    if (!js.isUndefined(keysControlDisabled)) __obj.updateDynamic("keysControlDisabled")(keysControlDisabled)
    if (!js.isUndefined(mouseDragEnabled)) __obj.updateDynamic("mouseDragEnabled")(mouseDragEnabled)
    if (onSlideChange != null) __obj.updateDynamic("onSlideChange")(js.Any.fromFunction1(onSlideChange))
    if (onSlideChanged != null) __obj.updateDynamic("onSlideChanged")(js.Any.fromFunction1(onSlideChanged))
    if (!js.isUndefined(playButtonEnabled)) __obj.updateDynamic("playButtonEnabled")(playButtonEnabled)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (slideToIndex != null) __obj.updateDynamic("slideToIndex")(slideToIndex.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeDisabled)) __obj.updateDynamic("swipeDisabled")(swipeDisabled)
    __obj.asInstanceOf[Props]
  }
}

