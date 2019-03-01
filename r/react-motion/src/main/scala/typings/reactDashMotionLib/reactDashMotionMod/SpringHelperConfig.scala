package typings
package reactDashMotionLib.reactDashMotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Spring additional configuration
  */
trait SpringHelperConfig extends js.Object {
  /**
    * Specifies damping
    * @defaults 26
    */
  var damping: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies both the rounding of the interpolated value and the speed (internal).
    * @defaults 0.01
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specified stiffness
    * @defaults 170
    */
  var stiffness: js.UndefOr[scala.Double] = js.undefined
}

object SpringHelperConfig {
  @scala.inline
  def apply(
    damping: scala.Int | scala.Double = null,
    precision: scala.Int | scala.Double = null,
    stiffness: scala.Int | scala.Double = null
  ): SpringHelperConfig = {
    val __obj = js.Dynamic.literal()
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringHelperConfig]
  }
}

