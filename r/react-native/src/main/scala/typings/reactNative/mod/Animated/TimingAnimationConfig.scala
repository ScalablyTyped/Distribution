package typings.reactNative.mod.Animated

import typings.reactNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingAnimationConfig extends AnimationConfig {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
  var toValue: Double | AnimatedValue | X | AnimatedValueXY | AnimatedInterpolation
}

object TimingAnimationConfig {
  @scala.inline
  def apply(
    toValue: Double | AnimatedValue | X | AnimatedValueXY | AnimatedInterpolation,
    useNativeDriver: Boolean,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* value */ Double => Double = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined
  ): TimingAnimationConfig = {
    val __obj = js.Dynamic.literal(toValue = toValue.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingAnimationConfig]
  }
}

