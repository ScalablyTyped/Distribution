package typings.reactDashToolbox.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipTheme extends js.Object {
  /**
    * Added to the tooltip element.
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /**
    * Added to the root when the tooltip is active.
    */
  var tooltipActive: js.UndefOr[String] = js.undefined
  /**
    * Wrapper for the root element used to position the tooltip.
    */
  var tooltipWrapper: js.UndefOr[String] = js.undefined
}

object TooltipTheme {
  @scala.inline
  def apply(tooltip: String = null, tooltipActive: String = null, tooltipWrapper: String = null): TooltipTheme = {
    val __obj = js.Dynamic.literal()
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipActive != null) __obj.updateDynamic("tooltipActive")(tooltipActive)
    if (tooltipWrapper != null) __obj.updateDynamic("tooltipWrapper")(tooltipWrapper)
    __obj.asInstanceOf[TooltipTheme]
  }
}

