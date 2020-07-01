package typings.reactVis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationParam extends js.Object {
  var damping: js.UndefOr[Double] = js.undefined
  var nonAnimatedProps: js.UndefOr[js.Array[String]] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
}

object AnimationParam {
  @scala.inline
  def apply(
    damping: js.UndefOr[Double] = js.undefined,
    nonAnimatedProps: js.Array[String] = null,
    stiffness: js.UndefOr[Double] = js.undefined
  ): AnimationParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (nonAnimatedProps != null) __obj.updateDynamic("nonAnimatedProps")(nonAnimatedProps.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationParam]
  }
}

