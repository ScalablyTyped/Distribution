package typings.reactToastNotifications.mod

import typings.react.mod.ReactNode
import typings.reactToastNotifications.anon.Toast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastProviderProps extends js.Object {
  
  var autoDismiss: js.UndefOr[Boolean | Double] = js.native
  
  var autoDismissTimeout: js.UndefOr[Double] = js.native
  
  var children: ReactNode = js.native
  
  var components: js.UndefOr[Toast] = js.native
  
  var placement: js.UndefOr[Placement] = js.native
  
  var transitionDuration: js.UndefOr[Double] = js.native
}
object ToastProviderProps {
  
  @scala.inline
  def apply(): ToastProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProviderProps]
  }
  
  @scala.inline
  implicit class ToastProviderPropsOps[Self <: ToastProviderProps] (val x: Self) extends AnyVal {
    
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
    def setAutoDismiss(value: Boolean | Double): Self = this.set("autoDismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDismiss: Self = this.set("autoDismiss", js.undefined)
    
    @scala.inline
    def setAutoDismissTimeout(value: Double): Self = this.set("autoDismissTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDismissTimeout: Self = this.set("autoDismissTimeout", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setComponents(value: Toast): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
  }
}
