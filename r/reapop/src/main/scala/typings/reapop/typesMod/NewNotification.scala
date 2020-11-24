package typings.reapop.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<reapop.reapop/dist/reducers/notifications/types.Notification> */
@js.native
trait NewNotification extends js.Object {
  
  var allowHTML: js.UndefOr[Boolean] = js.native
  
  var buttons: js.UndefOr[js.Array[NotificationButton]] = js.native
  
  var dismissAfter: js.UndefOr[Double] = js.native
  
  var dismissible: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var onAdd: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var onDismiss: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var position: js.UndefOr[Position] = js.native
  
  var showDismissButton: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[Status] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object NewNotification {
  
  @scala.inline
  def apply(): NewNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewNotification]
  }
  
  @scala.inline
  implicit class NewNotificationOps[Self <: NewNotification] (val x: Self) extends AnyVal {
    
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
    def setAllowHTML(value: Boolean): Self = this.set("allowHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHTML: Self = this.set("allowHTML", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: NotificationButton*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[NotificationButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setDismissAfter(value: Double): Self = this.set("dismissAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissAfter: Self = this.set("dismissAfter", js.undefined)
    
    @scala.inline
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnAdd(value: /* repeated */ js.Any => Unit): Self = this.set("onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* repeated */ js.Any => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowDismissButton(value: Boolean): Self = this.set("showDismissButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDismissButton: Self = this.set("showDismissButton", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
