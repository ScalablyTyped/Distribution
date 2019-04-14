package typings
package reactDashPopperDashTooltipLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipTriggerState extends js.Object {
  var pageX: js.UndefOr[scala.Double] = js.undefined
  var pageY: js.UndefOr[scala.Double] = js.undefined
  var tooltipShown: scala.Boolean
}

object TooltipTriggerState {
  @scala.inline
  def apply(
    tooltipShown: scala.Boolean,
    pageX: scala.Int | scala.Double = null,
    pageY: scala.Int | scala.Double = null
  ): TooltipTriggerState = {
    val __obj = js.Dynamic.literal(tooltipShown = tooltipShown)
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTriggerState]
  }
}

