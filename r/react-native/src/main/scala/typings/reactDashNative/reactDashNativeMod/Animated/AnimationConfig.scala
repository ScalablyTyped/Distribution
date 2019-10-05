package typings.reactDashNative.reactDashNativeMod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationConfig extends js.Object {
  var isInteraction: js.UndefOr[Boolean] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object AnimationConfig {
  @scala.inline
  def apply(
    isInteraction: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): AnimationConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isInteraction)) __obj.updateDynamic("isInteraction")(isInteraction)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[AnimationConfig]
  }
}

