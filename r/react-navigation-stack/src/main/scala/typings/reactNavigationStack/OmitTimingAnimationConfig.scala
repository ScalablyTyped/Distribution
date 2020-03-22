package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<react-native.react-native.Animated.TimingAnimationConfig, 'toValue' | keyof react-native.react-native.Animated.AnimationConfig> */
trait OmitTimingAnimationConfig extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.undefined
}

object OmitTimingAnimationConfig {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    easing: /* value */ Double => Double = null
  ): OmitTimingAnimationConfig = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    __obj.asInstanceOf[OmitTimingAnimationConfig]
  }
}

