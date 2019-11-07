package typings.reactDashPopperDashTooltip.distTypesMod

import typings.popperDotJs.popperDotJsMod.Popper.Placement
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashPopper.reactDashPopperMod.PopperArrowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  var arrowProps: PopperArrowProps
  var closeOnOutOfBoundaries: Boolean
  var innerRef: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactPopper.RefHandler */ js.Any
  var outOfBoundaries: Boolean | Null
  var placement: Placement
  var style: CSSProperties
  var trigger: TriggerTypes
  def clearScheduled(): Unit
  def hideTooltip(): Unit
  def scheduleUpdate(): Unit
  def tooltip(arg: TooltipArg): ReactNode
}

object TooltipProps {
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    clearScheduled: () => Unit,
    closeOnOutOfBoundaries: Boolean,
    hideTooltip: () => Unit,
    innerRef: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ReactPopper.RefHandler */ js.Any,
    placement: Placement,
    scheduleUpdate: () => Unit,
    style: CSSProperties,
    tooltip: TooltipArg => ReactNode,
    trigger: TriggerTypes,
    outOfBoundaries: js.UndefOr[Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps, clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnOutOfBoundaries = closeOnOutOfBoundaries, hideTooltip = js.Any.fromFunction0(hideTooltip), innerRef = innerRef, placement = placement, scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), style = style, tooltip = js.Any.fromFunction1(tooltip), trigger = trigger)
    if (!js.isUndefined(outOfBoundaries)) __obj.updateDynamic("outOfBoundaries")(outOfBoundaries)
    __obj.asInstanceOf[TooltipProps]
  }
}

