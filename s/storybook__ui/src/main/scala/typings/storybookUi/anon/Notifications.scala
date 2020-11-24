package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notifications extends js.Object {
  
  def clearNotification(id: String): Unit = js.native
  
  var notifications: js.Array[typings.storybookApi.notificationsMod.Notification] = js.native
}
object Notifications {
  
  @scala.inline
  def apply(
    clearNotification: String => Unit,
    notifications: js.Array[typings.storybookApi.notificationsMod.Notification]
  ): Notifications = {
    val __obj = js.Dynamic.literal(clearNotification = js.Any.fromFunction1(clearNotification), notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
  
  @scala.inline
  implicit class NotificationsOps[Self <: Notifications] (val x: Self) extends AnyVal {
    
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
    def setClearNotification(value: String => Unit): Self = this.set("clearNotification", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotificationsVarargs(value: typings.storybookApi.notificationsMod.Notification*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: js.Array[typings.storybookApi.notificationsMod.Notification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
  }
}
