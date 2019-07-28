package typings.reactDashPopperDashTooltip.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipTriggerState extends js.Object {
  var pageX: js.UndefOr[Double] = js.undefined
  var pageY: js.UndefOr[Double] = js.undefined
  var tooltipShown: Boolean
}

object TooltipTriggerState {
  @scala.inline
  def apply(tooltipShown: Boolean, pageX: Int | Double = null, pageY: Int | Double = null): TooltipTriggerState = {
    val __obj = js.Dynamic.literal(tooltipShown = tooltipShown)
    if (pageX != null) __obj.updateDynamic("pageX")(pageX.asInstanceOf[js.Any])
    if (pageY != null) __obj.updateDynamic("pageY")(pageY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTriggerState]
  }
}

