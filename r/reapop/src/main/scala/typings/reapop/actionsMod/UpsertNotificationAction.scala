package typings.reapop.actionsMod

import typings.reapop.notificationsConstantsMod.NotificationAction.UpsertNotification
import typings.reapop.typesMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpsertNotificationAction extends NotificationActions {
  
  var payload: Notification = js.native
  
  var `type`: UpsertNotification = js.native
}
object UpsertNotificationAction {
  
  @scala.inline
  def apply(payload: Notification, `type`: UpsertNotification): UpsertNotificationAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertNotificationAction]
  }
  
  @scala.inline
  implicit class UpsertNotificationActionOps[Self <: UpsertNotificationAction] (val x: Self) extends AnyVal {
    
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
    def setPayload(value: Notification): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UpsertNotification): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
