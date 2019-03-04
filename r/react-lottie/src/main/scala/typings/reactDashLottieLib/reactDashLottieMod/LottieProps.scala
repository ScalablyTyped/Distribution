package typings
package reactDashLottieLib.reactDashLottieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LottieProps extends js.Object {
  var ariaLabel: js.UndefOr[java.lang.String | reactDashLottieLib.reactDashLottieLibStrings.animation] = js.undefined
  var ariaRole: js.UndefOr[java.lang.String | reactDashLottieLib.reactDashLottieLibStrings.button] = js.undefined
  var direction: js.UndefOr[scala.Double] = js.undefined
  /**
    * Array of objects containing eventName and a callback function that will be registered as eventListeners on the animation object.
    * Refer to Lottie documentation for a list of available events.
    */
  var eventListeners: js.UndefOr[js.Array[EventListener]] = js.undefined
  /**
    * Height size in pixels
    * @default '100%'
    */
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var isClickToPauseDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Describes if the animation must be in paused mode
    */
  var isPaused: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Describes if the animation must be in stopped mode
    */
  var isStopped: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Object representing animation settings
    */
  var options: Options
  var segments: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Width size in pixels
    * @default '100%'
    */
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object LottieProps {
  @scala.inline
  def apply(
    options: Options,
    ariaLabel: java.lang.String | reactDashLottieLib.reactDashLottieLibStrings.animation = null,
    ariaRole: java.lang.String | reactDashLottieLib.reactDashLottieLibStrings.button = null,
    direction: scala.Int | scala.Double = null,
    eventListeners: js.Array[EventListener] = null,
    height: scala.Double | java.lang.String = null,
    isClickToPauseDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    isPaused: js.UndefOr[scala.Boolean] = js.undefined,
    isStopped: js.UndefOr[scala.Boolean] = js.undefined,
    segments: js.Array[scala.Double] = null,
    speed: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): LottieProps = {
    val __obj = js.Dynamic.literal(options = options)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (eventListeners != null) __obj.updateDynamic("eventListeners")(eventListeners)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickToPauseDisabled)) __obj.updateDynamic("isClickToPauseDisabled")(isClickToPauseDisabled)
    if (!js.isUndefined(isPaused)) __obj.updateDynamic("isPaused")(isPaused)
    if (!js.isUndefined(isStopped)) __obj.updateDynamic("isStopped")(isStopped)
    if (segments != null) __obj.updateDynamic("segments")(segments)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LottieProps]
  }
}

