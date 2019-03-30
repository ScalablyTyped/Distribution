package typings
package reactDashPopperDashTooltipLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipTriggerProps extends js.Object {
  /**
    * Whether to close the tooltip when it's trigger is out of the boundary
    * @default true
    */
  var closeOnOutOfBoundaries: scala.Boolean
  /**
    * Whether tooltip is shown by default
    * @default false
    */
  var defaultTooltipShown: scala.Boolean
  /**
    * Delay in hiding the tooltip
    * @default 0
    */
  var delayHide: scala.Double
  /**
    * Delay in showing the tooltip
    * @default 0
    */
  var delayShow: scala.Double
  /**
    * Whether to make the tooltip spawn at cursor position
    * @default false
    */
  var followCursor: scala.Boolean
  /**
    * Function that can be used to obtain a tooltip element reference
    */
  var getTooltipRef: js.UndefOr[reactDashPopperLib.RefHandler] = js.undefined
  /**
    * Function that can be used to obtain a trigger element reference
    */
  var getTriggerRef: js.UndefOr[reactDashPopperLib.RefHandler] = js.undefined
  /**
    * Modifiers passed directly to the underlying popper.js instance
    * For more information, refer to Popper.js’ modifier docs:
    * @link https://popper.js.org/popper-documentation.html#modifiers
    */
  var modifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.PopperNs.Modifiers] = js.undefined
  /**
    * Tooltip placement w.r.t. trigger
    *  @default right
    */
  var placement: popperDotJsLib.popperDotJsMod.PopperNs.Placement
  /**
    * Element to be used as portal container
    * @default document.body
    */
  var portalContainer: stdLib.HTMLElement
  /**
    * Used to create controlled tooltip
    */
  var tooltipShown: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Event that triggers the tooltip
    * @default hover
    */
  var trigger: reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.none | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.click | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.`right-click` | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.hover
  /**
    * Whether to use React.createPortal for creating tooltip
    * @default true // for browser environments
    */
  var usePortal: scala.Boolean
  /**
    * Trigger
    */
  def children(arg: IChildrenArg): reactLib.reactMod.ReactNs.ReactNode
  /**
    * Called when the visibility of the tooltip changes
    * @default no-op
    */
  def onVisibilityChange(tooltipShown: scala.Boolean): scala.Unit
  /**
    * Tooltip
    */
  def tooltip(arg: ITooltipArg): reactLib.reactMod.ReactNs.ReactNode
}

object ITooltipTriggerProps {
  @scala.inline
  def apply(
    children: IChildrenArg => reactLib.reactMod.ReactNs.ReactNode,
    closeOnOutOfBoundaries: scala.Boolean,
    defaultTooltipShown: scala.Boolean,
    delayHide: scala.Double,
    delayShow: scala.Double,
    followCursor: scala.Boolean,
    onVisibilityChange: scala.Boolean => scala.Unit,
    placement: popperDotJsLib.popperDotJsMod.PopperNs.Placement,
    portalContainer: stdLib.HTMLElement,
    tooltip: ITooltipArg => reactLib.reactMod.ReactNs.ReactNode,
    trigger: reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.none | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.click | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.`right-click` | reactDashPopperDashTooltipLib.reactDashPopperDashTooltipLibStrings.hover,
    usePortal: scala.Boolean,
    getTooltipRef: reactDashPopperLib.RefHandler = null,
    getTriggerRef: reactDashPopperLib.RefHandler = null,
    modifiers: popperDotJsLib.popperDotJsMod.PopperNs.Modifiers = null,
    tooltipShown: js.UndefOr[scala.Boolean] = js.undefined
  ): ITooltipTriggerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), closeOnOutOfBoundaries = closeOnOutOfBoundaries, defaultTooltipShown = defaultTooltipShown, delayHide = delayHide, delayShow = delayShow, followCursor = followCursor, onVisibilityChange = js.Any.fromFunction1(onVisibilityChange), placement = placement, portalContainer = portalContainer, tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal)
    if (getTooltipRef != null) __obj.updateDynamic("getTooltipRef")(getTooltipRef)
    if (getTriggerRef != null) __obj.updateDynamic("getTriggerRef")(getTriggerRef)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown)
    __obj.asInstanceOf[ITooltipTriggerProps]
  }
}

