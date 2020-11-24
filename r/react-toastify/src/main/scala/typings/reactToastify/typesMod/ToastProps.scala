package typings.reactToastify.typesMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastProps extends ToastOptions {
  
  var children: js.UndefOr[ToastContent] = js.native
  
  def closeToast(): Unit = js.native
  
  def deleteToast(): Unit = js.native
  
  @JSName("draggablePercent")
  var draggablePercent_ToastProps: Double = js.native
  
  var in: js.UndefOr[Boolean] = js.native
  
  var key: Id = js.native
  
  @JSName("position")
  var position_ToastProps: ToastPosition = js.native
  
  var staleId: js.UndefOr[Id] = js.native
  
  @JSName("toastId")
  var toastId_ToastProps: Id = js.native
  
  @JSName("transition")
  var transition_ToastProps: ToastTransition = js.native
}
object ToastProps {
  
  @scala.inline
  def apply(
    closeToast: () => Unit,
    deleteToast: () => Unit,
    draggablePercent: Double,
    key: Id,
    position: ToastPosition,
    toastId: Id,
    transition: ToastTransition
  ): ToastProps = {
    val __obj = js.Dynamic.literal(closeToast = js.Any.fromFunction0(closeToast), deleteToast = js.Any.fromFunction0(deleteToast), draggablePercent = draggablePercent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProps]
  }
  
  @scala.inline
  implicit class ToastPropsOps[Self <: ToastProps] (val x: Self) extends AnyVal {
    
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
    def setCloseToast(value: () => Unit): Self = this.set("closeToast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeleteToast(value: () => Unit): Self = this.set("deleteToast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDraggablePercent(value: Double): Self = this.set("draggablePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Id): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: ToastPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToastId(value: Id): Self = this.set("toastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransition(value: ToastTransition): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenFunction1(value: /* props */ ToastContentProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ToastContent): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    
    @scala.inline
    def setStaleId(value: Id): Self = this.set("staleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaleId: Self = this.set("staleId", js.undefined)
  }
}
