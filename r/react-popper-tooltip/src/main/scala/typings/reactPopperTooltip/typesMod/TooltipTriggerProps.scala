package typings.reactPopperTooltip.typesMod

import typings.popperJs.mod.Popper.Modifiers
import typings.popperJs.mod.Popper.Placement
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipTriggerProps extends js.Object {
  /**
    * Whether to close the tooltip when it's trigger is out of the boundary
    * @default true
    */
  var closeOnOutOfBoundaries: Boolean
  /**
    * Whether tooltip is shown by default
    * @default false
    */
  var defaultTooltipShown: Boolean
  /**
    * Delay in hiding the tooltip
    * @default 0
    */
  var delayHide: Double
  /**
    * Delay in showing the tooltip
    * @default 0
    */
  var delayShow: Double
  /**
    * Whether to make the tooltip spawn at cursor position
    * @default false
    */
  var followCursor: Boolean
  /**
    * Function that can be used to obtain a tooltip element reference
    */
  var getTooltipRef: js.UndefOr[Ref] = js.undefined
  /**
    * Function that can be used to obtain a trigger element reference
    */
  var getTriggerRef: js.UndefOr[Ref] = js.undefined
  /**
    * Modifiers passed directly to the underlying popper.js instance
    * For more information, refer to Popper.js’ modifier docs:
    * @link https://popper.js.org/popper-documentation.html#modifiers
    */
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  /**
    * Options to MutationObserver, used internally for updating
    * tooltip position based on trigger DOM changes
    * @default  { childList: true, subtree: true }
    */
  var mutationObserverOptions: MutationObserverInit
  /**
    * Tooltip placement w.r.t. trigger
    *  @default right
    */
  var placement: Placement
  /**
    * Element to be used as portal container
    * @default document.body
    */
  var portalContainer: HTMLElement
  /**
    * Used to create controlled tooltip
    */
  var tooltipShown: js.UndefOr[Boolean] = js.undefined
  /**
    * Event that triggers the tooltip
    * @default hover
    */
  var trigger: Trigger
  /**
    * Whether to use React.createPortal for creating tooltip
    * @default true // for browser environments
    */
  var usePortal: Boolean
  /**
    * Trigger
    */
  def children(arg: ChildrenArg): ReactNode
  /**
    * Called when the visibility of the tooltip changes
    * @default no-op
    */
  def onVisibilityChange(tooltipShown: Boolean): Unit
  /**
    * Tooltip
    */
  def tooltip(arg: TooltipArg): ReactNode
}

object TooltipTriggerProps {
  @scala.inline
  def apply(
    children: ChildrenArg => ReactNode,
    closeOnOutOfBoundaries: Boolean,
    defaultTooltipShown: Boolean,
    delayHide: Double,
    delayShow: Double,
    followCursor: Boolean,
    mutationObserverOptions: MutationObserverInit,
    onVisibilityChange: Boolean => Unit,
    placement: Placement,
    portalContainer: HTMLElement,
    tooltip: TooltipArg => ReactNode,
    trigger: Trigger,
    usePortal: Boolean,
    getTooltipRef: js.UndefOr[Null | Ref] = js.undefined,
    getTriggerRef: js.UndefOr[Null | Ref] = js.undefined,
    modifiers: Modifiers = null,
    tooltipShown: js.UndefOr[Boolean] = js.undefined
  ): TooltipTriggerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction1(onVisibilityChange), placement = placement.asInstanceOf[js.Any], portalContainer = portalContainer.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
    if (!js.isUndefined(getTooltipRef)) __obj.updateDynamic("getTooltipRef")(getTooltipRef.asInstanceOf[js.Any])
    if (!js.isUndefined(getTriggerRef)) __obj.updateDynamic("getTriggerRef")(getTriggerRef.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipShown)) __obj.updateDynamic("tooltipShown")(tooltipShown.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTriggerProps]
  }
}

