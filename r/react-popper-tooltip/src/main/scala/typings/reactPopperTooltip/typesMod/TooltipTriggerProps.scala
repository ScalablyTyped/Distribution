package typings.reactPopperTooltip.typesMod

import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipTriggerProps extends js.Object {
  /**
    * Whether to close the tooltip when it's trigger is out of the boundary
    * @default true
    */
  var closeOnOutOfBoundaries: Boolean = js.native
  /**
    * Whether tooltip is shown by default
    * @default false
    */
  var defaultTooltipShown: Boolean = js.native
  /**
    * Delay in hiding the tooltip
    * @default 0
    */
  var delayHide: Double = js.native
  /**
    * Delay in showing the tooltip
    * @default 0
    */
  var delayShow: Double = js.native
  /**
    * Whether to make the tooltip spawn at cursor position
    * @default false
    */
  var followCursor: Boolean = js.native
  /**
    * Function that can be used to obtain a tooltip element reference
    */
  var getTooltipRef: js.UndefOr[Ref] = js.native
  /**
    * Function that can be used to obtain a trigger element reference
    */
  var getTriggerRef: js.UndefOr[Ref] = js.native
  /**
    * Modifiers passed directly to the underlying popper.js instance
    * For more information, refer to Popper.js’ modifier docs:
    * @link https://popper.js.org/popper-documentation.html#modifiers
    */
  var modifiers: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Modifiers */ js.Any
  ] = js.native
  /**
    * Options to MutationObserver, used internally for updating
    * tooltip position based on trigger DOM changes
    * @default  { childList: true, subtree: true }
    */
  var mutationObserverOptions: MutationObserverInit = js.native
  /**
    * Tooltip placement w.r.t. trigger
    *  @default right
    */
  var placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any = js.native
  /**
    * Element to be used as portal container
    * @default document.body
    */
  var portalContainer: HTMLElement = js.native
  /**
    * Used to create controlled tooltip
    */
  var tooltipShown: js.UndefOr[Boolean] = js.native
  /**
    * Event that triggers the tooltip
    * @default hover
    */
  var trigger: Trigger = js.native
  /**
    * Whether to use React.createPortal for creating tooltip
    * @default true // for browser environments
    */
  var usePortal: Boolean = js.native
  /**
    * Trigger
    */
  def children(arg: ChildrenArg): ReactNode = js.native
  /**
    * Called when the visibility of the tooltip changes
    * @default no-op
    */
  def onVisibilityChange(tooltipShown: Boolean): Unit = js.native
  /**
    * Tooltip
    */
  def tooltip(arg: TooltipArg): ReactNode = js.native
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
    placement: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any,
    portalContainer: HTMLElement,
    tooltip: TooltipArg => ReactNode,
    trigger: Trigger,
    usePortal: Boolean
  ): TooltipTriggerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), closeOnOutOfBoundaries = closeOnOutOfBoundaries.asInstanceOf[js.Any], defaultTooltipShown = defaultTooltipShown.asInstanceOf[js.Any], delayHide = delayHide.asInstanceOf[js.Any], delayShow = delayShow.asInstanceOf[js.Any], followCursor = followCursor.asInstanceOf[js.Any], mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], onVisibilityChange = js.Any.fromFunction1(onVisibilityChange), placement = placement.asInstanceOf[js.Any], portalContainer = portalContainer.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], usePortal = usePortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipTriggerProps]
  }
  @scala.inline
  implicit class TooltipTriggerPropsOps[Self <: TooltipTriggerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: ChildrenArg => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setCloseOnOutOfBoundaries(value: Boolean): Self = this.set("closeOnOutOfBoundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultTooltipShown(value: Boolean): Self = this.set("defaultTooltipShown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelayHide(value: Double): Self = this.set("delayHide", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelayShow(value: Double): Self = this.set("delayShow", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowCursor(value: Boolean): Self = this.set("followCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMutationObserverOptions(value: MutationObserverInit): Self = this.set("mutationObserverOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnVisibilityChange(value: Boolean => Unit): Self = this.set("onVisibilityChange", js.Any.fromFunction1(value))
    @scala.inline
    def setPlacement(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Placement */ js.Any
    ): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortalContainer(value: HTMLElement): Self = this.set("portalContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: TooltipArg => ReactNode): Self = this.set("tooltip", js.Any.fromFunction1(value))
    @scala.inline
    def setTriggerVarargs(value: TriggerTypes*): Self = this.set("trigger", js.Array(value :_*))
    @scala.inline
    def setTrigger(value: Trigger): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsePortal(value: Boolean): Self = this.set("usePortal", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTooltipRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = this.set("getTooltipRef", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTooltipRef(value: Ref): Self = this.set("getTooltipRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetTooltipRef: Self = this.set("getTooltipRef", js.undefined)
    @scala.inline
    def setGetTooltipRefNull: Self = this.set("getTooltipRef", null)
    @scala.inline
    def setGetTriggerRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = this.set("getTriggerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTriggerRef(value: Ref): Self = this.set("getTriggerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetTriggerRef: Self = this.set("getTriggerRef", js.undefined)
    @scala.inline
    def setGetTriggerRefNull: Self = this.set("getTriggerRef", null)
    @scala.inline
    def setModifiers(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PopperJS.Modifiers */ js.Any
    ): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setTooltipShown(value: Boolean): Self = this.set("tooltipShown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipShown: Self = this.set("tooltipShown", js.undefined)
  }
  
}

