package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Damping extends js.Object {
  var damping: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
  var restSpeedThreshold: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
}

object Damping {
  @scala.inline
  def apply(
    damping: js.UndefOr[Double] = js.undefined,
    mass: js.UndefOr[Double] = js.undefined,
    restDisplacementThreshold: js.UndefOr[Double] = js.undefined,
    restSpeedThreshold: js.UndefOr[Double] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined
  ): Damping = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mass)) __obj.updateDynamic("mass")(mass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restDisplacementThreshold)) __obj.updateDynamic("restDisplacementThreshold")(restDisplacementThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restSpeedThreshold)) __obj.updateDynamic("restSpeedThreshold")(restSpeedThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Damping]
  }
}

