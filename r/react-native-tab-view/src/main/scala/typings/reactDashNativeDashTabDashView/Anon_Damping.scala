package typings.reactDashNativeDashTabDashView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Damping extends js.Object {
  var damping: js.UndefOr[Double] = js.undefined
  var mass: js.UndefOr[Double] = js.undefined
  var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
  var restSpeedThreshold: js.UndefOr[Double] = js.undefined
  var stiffness: js.UndefOr[Double] = js.undefined
}

object Anon_Damping {
  @scala.inline
  def apply(
    damping: Int | Double = null,
    mass: Int | Double = null,
    restDisplacementThreshold: Int | Double = null,
    restSpeedThreshold: Int | Double = null,
    stiffness: Int | Double = null
  ): Anon_Damping = {
    val __obj = js.Dynamic.literal()
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (restDisplacementThreshold != null) __obj.updateDynamic("restDisplacementThreshold")(restDisplacementThreshold.asInstanceOf[js.Any])
    if (restSpeedThreshold != null) __obj.updateDynamic("restSpeedThreshold")(restSpeedThreshold.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Damping]
  }
}

