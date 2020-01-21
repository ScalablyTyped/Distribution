package typings.reactNative.mod.Animated

import typings.reactNative.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecayAnimationConfig extends AnimationConfig {
  var deceleration: js.UndefOr[Double] = js.undefined
  var velocity: Double | AnonX
}

object DecayAnimationConfig {
  @scala.inline
  def apply(
    velocity: Double | AnonX,
    deceleration: Int | Double = null,
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): DecayAnimationConfig = {
    val __obj = js.Dynamic.literal(velocity = velocity.asInstanceOf[js.Any])
    if (deceleration != null) __obj.updateDynamic("deceleration")(deceleration.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayAnimationConfig]
  }
}

