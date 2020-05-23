package typings.reactNative.mod.Animated

import typings.reactNative.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecayAnimationConfig extends AnimationConfig {
  var deceleration: js.UndefOr[Double] = js.undefined
  var velocity: Double | X
}

object DecayAnimationConfig {
  @scala.inline
  def apply(
    useNativeDriver: Boolean,
    velocity: Double | X,
    deceleration: js.UndefOr[Double] = js.undefined,
    isInteraction: js.UndefOr[Boolean] = js.undefined
  ): DecayAnimationConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    if (!js.isUndefined(deceleration)) __obj.updateDynamic("deceleration")(deceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecayAnimationConfig]
  }
}

