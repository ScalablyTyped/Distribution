package typings.reactDashNative.reactDashNativeMod.Animated

import typings.reactDashNative.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingAnimationConfig extends AnimationConfig {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  var toValue: Double | AnimatedValue | Anon_X | AnimatedValueXY
}

object TimingAnimationConfig {
  @scala.inline
  def apply(
    toValue: Double | AnimatedValue | Anon_X | AnimatedValueXY,
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: /* value */ Double => Double = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): TimingAnimationConfig = {
    val __obj = js.Dynamic.literal(toValue = toValue.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[TimingAnimationConfig]
  }
}

