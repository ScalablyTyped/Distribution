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
  def apply(
    damping: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    stiffness: js.UndefOr[Double] = js.undefined
  ): SpringHelperConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stiffness)) __obj.updateDynamic("stiffness")(stiffness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringHelperConfig]
  }
}

