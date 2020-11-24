package typings.reactToastNotifications.anon

import typings.react.mod.ComponentType
import typings.reactToastNotifications.mod.ToastContainerProps
import typings.reactToastNotifications.mod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toast extends js.Object {
  
  var Toast: js.UndefOr[ComponentType[ToastProps]] = js.native
  
  var ToastContainer: js.UndefOr[ComponentType[ToastContainerProps]] = js.native
}
object Toast {
  
  @scala.inline
  def apply(): Toast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Toast]
  }
  
  @scala.inline
  implicit class ToastOps[Self <: Toast] (val x: Self) extends AnyVal {
    
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
    def setToast(value: ComponentType[ToastProps]): Self = this.set("Toast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToast: Self = this.set("Toast", js.undefined)
    
    @scala.inline
    def setToastContainer(value: ComponentType[ToastContainerProps]): Self = this.set("ToastContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToastContainer: Self = this.set("ToastContainer", js.undefined)
  }
}
