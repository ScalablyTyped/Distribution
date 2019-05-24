package typings
package reactDashPopperDashTooltipLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var arrowProps: reactDashPopperLib.reactDashPopperMod.PopperArrowProps
  var closeOnOutOfBoundaries: scala.Boolean
  var innerRef: reactDashPopperLib.reactDashPopperMod.RefHandler
  var outOfBoundaries: scala.Boolean | scala.Null
  var placement: popperDotJsLib.popperDotJsMod.PopperNs.Placement
  var style: reactLib.reactMod.CSSProperties
  var trigger: reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.none | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.click | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.`right-click` | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.hover
  def clearScheduled(): scala.Unit
  def hideTooltip(): scala.Unit
  def scheduleUpdate(): scala.Unit
  def tooltip(arg: TooltipArg): reactLib.reactMod.ReactNode
}

object TooltipProps {
  @scala.inline
  def apply(
    arrowProps: reactDashPopperLib.reactDashPopperMod.PopperArrowProps,
    clearScheduled: () => scala.Unit,
    closeOnOutOfBoundaries: scala.Boolean,
    hideTooltip: () => scala.Unit,
    innerRef: reactDashPopperLib.reactDashPopperMod.RefHandler,
    placement: popperDotJsLib.popperDotJsMod.PopperNs.Placement,
    scheduleUpdate: () => scala.Unit,
    style: reactLib.reactMod.CSSProperties,
    tooltip: TooltipArg => reactLib.reactMod.ReactNode,
    trigger: reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.none | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.click | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.`right-click` | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.hover,
    outOfBoundaries: js.UndefOr[scala.Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps, clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnOutOfBoundaries = closeOnOutOfBoundaries, hideTooltip = js.Any.fromFunction0(hideTooltip), innerRef = innerRef, placement = placement, scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style, tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries)
    __obj.asInstanceOf[TooltipProps]
  }
}

