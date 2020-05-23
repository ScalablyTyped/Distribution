package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationConfig extends js.Object {
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  var useNativeDriver: Boolean
}

object AnimationConfig {
  @scala.inline
  def apply(useNativeDriver: Boolean, isInteraction: js.UndefOr[Boolean] = js.undefined): AnimationConfig = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationConfig]
  }
}

