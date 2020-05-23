package typings.slickgrid.Slick

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
    maxToolTipLength: js.UndefOr[Double] = js.undefined
  ): SlickGridAutoTooltipsOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableForCells)) __obj.updateDynamic("enableForCells")(enableForCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableForHeaderCells)) __obj.updateDynamic("enableForHeaderCells")(enableForHeaderCells.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxToolTipLength)) __obj.updateDynamic("maxToolTipLength")(maxToolTipLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlickGridAutoTooltipsOption]
  }
}

