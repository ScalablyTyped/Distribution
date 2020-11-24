package typings.reactNotificationSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends js.Object {
  
  var Action: js.UndefOr[ItemStyle] = js.native
  
  var ActionWrapper: js.UndefOr[WrapperStyle] = js.native
  
  var Containers: js.UndefOr[ContainersStyle] = js.native
  
  var Dismiss: js.UndefOr[ItemStyle] = js.native
  
  var MessageWrapper: js.UndefOr[WrapperStyle] = js.native
  
  var NotificationItem: js.UndefOr[ItemStyle] = js.native
  
  var Title: js.UndefOr[ItemStyle] = js.native
  
  var Wrapper: js.UndefOr[js.Any] = js.native
}
object Style {
  
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ItemStyle): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setActionWrapper(value: WrapperStyle): Self = this.set("ActionWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionWrapper: Self = this.set("ActionWrapper", js.undefined)
    
    @scala.inline
    def setContainers(value: ContainersStyle): Self = this.set("Containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainers: Self = this.set("Containers", js.undefined)
    
    @scala.inline
    def setDismiss(value: ItemStyle): Self = this.set("Dismiss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismiss: Self = this.set("Dismiss", js.undefined)
    
    @scala.inline
    def setMessageWrapper(value: WrapperStyle): Self = this.set("MessageWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageWrapper: Self = this.set("MessageWrapper", js.undefined)
    
    @scala.inline
    def setNotificationItem(value: ItemStyle): Self = this.set("NotificationItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationItem: Self = this.set("NotificationItem", js.undefined)
    
    @scala.inline
    def setTitle(value: ItemStyle): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
    
    @scala.inline
    def setWrapper(value: js.Any): Self = this.set("Wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("Wrapper", js.undefined)
  }
}
