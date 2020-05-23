package typings.reactLottie.mod

import typings.react.mod.CSSProperties
import typings.reactLottie.reactLottieStrings.animation
import typings.reactLottie.reactLottieStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LottieProps extends js.Object {
  var ariaLabel: js.UndefOr[String | animation] = js.undefined
  var ariaRole: js.UndefOr[String | button] = js.undefined
  var direction: js.UndefOr[Double] = js.undefined
  /**
    * Array of objects containing eventName and a callback function that will be registered as eventListeners on the animation object.
    * Refer to Lottie documentation for a list of available events.
    */
  var eventListeners: js.UndefOr[js.Array[EventListener]] = js.undefined
  /**
    * Height size in pixels
    * @default '100%'
    */
  var height: js.UndefOr[Double | String] = js.undefined
  var isClickToPauseDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Describes if the animation must be in paused mode
    */
  var isPaused: js.UndefOr[Boolean] = js.undefined
  /**
    * Describes if the animation must be in stopped mode
    */
  var isStopped: js.UndefOr[Boolean] = js.undefined
  /**
    * Object representing animation settings
    */
  var options: Options
  var segments: js.UndefOr[js.Array[Double]] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  /**
    * Width size in pixels
    * @default '100%'
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object LottieProps {
  @scala.inline
  def apply(
    options: Options,
    ariaLabel: String | animation = null,
    ariaRole: String | button = null,
    direction: js.UndefOr[Double] = js.undefined,
    eventListeners: js.Array[EventListener] = null,
    height: Double | String = null,
    isClickToPauseDisabled: js.UndefOr[Boolean] = js.undefined,
    isPaused: js.UndefOr[Boolean] = js.undefined,
    isStopped: js.UndefOr[Boolean] = js.undefined,
    segments: js.Array[Double] = null,
    speed: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    title: String = null,
    width: Double | String = null
  ): LottieProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    if (eventListeners != null) __obj.updateDynamic("eventListeners")(eventListeners.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickToPauseDisabled)) __obj.updateDynamic("isClickToPauseDisabled")(isClickToPauseDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPaused)) __obj.updateDynamic("isPaused")(isPaused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isStopped)) __obj.updateDynamic("isStopped")(isStopped.get.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LottieProps]
  }
}

