package typings.reactMotion.mod

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
  var damping: js.UndefOr[Double] = js.undefined
  /**
    * Specifies both the rounding of the interpolated value and the speed (internal).
    * @defaults 0.01
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * Specified stiffness
    * @defaults 170
    */
  var stiffness: js.UndefOr[Double] = js.undefined
}

object SpringHelperConfig {
  @scala.inline
  def apply(damping: Int | Double = null, precision: Int | Double = null, stiffness: Int | Double = null): SpringHelperConfig = {
    val __obj = js.Dynamic.literal()
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringHelperConfig]
  }
}

