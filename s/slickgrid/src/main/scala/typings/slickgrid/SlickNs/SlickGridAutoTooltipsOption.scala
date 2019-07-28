package typings.slickgrid.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlickGridAutoTooltipsOption extends PluginOptions {
  /**
    * Enable tooltip for grid cells
    * @default true
    */
  var enableForCells: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable tooltip for header cells
    * @default false
    */
  var enableForHeaderCells: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum length for a tooltip
    * @default null
    */
  var maxToolTipLength: js.UndefOr[Double] = js.undefined
}

object SlickGridAutoTooltipsOption {
  @scala.inline
  def apply(
    enableForCells: js.UndefOr[Boolean] = js.undefined,
    enableForHeaderCells: js.UndefOr[Boolean] = js.undefined,
    maxToolTipLength: Int | Double = null
  ): SlickGridAutoTooltipsOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableForCells)) __obj.updateDynamic("enableForCells")(enableForCells)
    if (!js.isUndefined(enableForHeaderCells)) __obj.updateDynamic("enableForHeaderCells")(enableForHeaderCells)
    if (maxToolTipLength != null) __obj.updateDynamic("maxToolTipLength")(maxToolTipLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlickGridAutoTooltipsOption]
  }
}

