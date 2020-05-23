package typings.reactPopperTooltip.typesMod

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
  def apply(
    tooltipShown: Boolean,
    pageX: js.UndefOr[Double] = js.undefined,
    pageY: js.UndefOr[Double] = js.undefined
  ): TooltipTriggerState = {
    val __obj = js.Dynamic.literal(tooltipShown = tooltipShown.asInstanceOf[js.Any])
    if (!js.isUndefined(pageX)) __obj.updateDynamic("pageX")(pageX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageY)) __obj.updateDynamic("pageY")(pageY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTriggerState]
  }
}

