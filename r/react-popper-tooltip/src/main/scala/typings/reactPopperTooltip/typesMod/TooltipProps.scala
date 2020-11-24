package typings.reactPopperTooltip.typesMod

import typings.popperjsCore.enumsMod.Placement
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactPopper.mod.PopperArrowProps
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipProps extends js.Object {
  
  var arrowProps: PopperArrowProps = js.native
  
  def clearScheduled(): Unit = js.native
  
  var closeOnReferenceHidden: Boolean = js.native
  
  def hideTooltip(): Unit = js.native
  
  var innerRef: Ref = js.native
  
  var isReferenceHidden: js.UndefOr[Boolean] = js.native
  
  var mutationObserverOptions: MutationObserverInit = js.native
  
  var placement: Placement = js.native
  
  var style: CSSProperties = js.native
  
  def tooltip(arg: TooltipArg): ReactNode = js.native
  
  var trigger: Trigger = js.native
  
  def update(): Unit = js.native
}
object TooltipProps {
  
  @scala.inline
  def apply(
    arrowProps: PopperArrowProps,
    clearScheduled: () => Unit,
    closeOnReferenceHidden: Boolean,
    hideTooltip: () => Unit,
    mutationObserverOptions: MutationObserverInit,
    placement: Placement,
    style: CSSProperties,
    tooltip: TooltipArg => ReactNode,
    trigger: Trigger,
    update: () => Unit
  ): TooltipProps = {
    val __obj = js.Dynamic.literal(arrowProps = arrowProps.asInstanceOf[js.Any], clearScheduled = js.Any.fromFunction0(clearScheduled), closeOnReferenceHidden = closeOnReferenceHidden.asInstanceOf[js.Any], hideTooltip = js.Any.fromFunction0(hideTooltip), mutationObserverOptions = mutationObserverOptions.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), trigger = trigger.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[TooltipProps]
  }
  
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
    
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
    def setArrowProps(value: PopperArrowProps): Self = this.set("arrowProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearScheduled(value: () => Unit): Self = this.set("clearScheduled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCloseOnReferenceHidden(value: Boolean): Self = this.set("closeOnReferenceHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTooltip(value: () => Unit): Self = this.set("hideTooltip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMutationObserverOptions(value: MutationObserverInit): Self = this.set("mutationObserverOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: TooltipArg => ReactNode): Self = this.set("tooltip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriggerVarargs(value: TriggerTypes*): Self = this.set("trigger", js.Array(value :_*))
    
    @scala.inline
    def setTrigger(value: Trigger): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInnerRefFunction1(value: /* element */ HTMLElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setIsReferenceHidden(value: Boolean): Self = this.set("isReferenceHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReferenceHidden: Self = this.set("isReferenceHidden", js.undefined)
  }
}
