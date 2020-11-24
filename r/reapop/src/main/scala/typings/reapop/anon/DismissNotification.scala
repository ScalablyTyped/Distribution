package typings.reapop.anon

import typings.reapop.typesMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DismissNotification extends js.Object {
  
  def dismissNotification(id: String): Unit = js.native
  
  def dismissNotifications(): Unit = js.native
  
  var notifications: js.Array[Notification] = js.native
  
  def notify(notification: PartialNotification): Unit = js.native
}
object DismissNotification {
  
  @scala.inline
  def apply(
    dismissNotification: String => Unit,
    dismissNotifications: () => Unit,
    notifications: js.Array[Notification],
    notify: PartialNotification => Unit
  ): DismissNotification = {
    val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), dismissNotifications = js.Any.fromFunction0(dismissNotifications), notifications = notifications.asInstanceOf[js.Any], notify = js.Any.fromFunction1(notify))
    __obj.asInstanceOf[DismissNotification]
  }
  
  @scala.inline
  implicit class DismissNotificationOps[Self <: DismissNotification] (val x: Self) extends AnyVal {
    
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
    def setDismissNotification(value: String => Unit): Self = this.set("dismissNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDismissNotifications(value: () => Unit): Self = this.set("dismissNotifications", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: js.Array[Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotify(value: PartialNotification => Unit): Self = this.set("notify", js.Any.fromFunction1(value))
  }
}
