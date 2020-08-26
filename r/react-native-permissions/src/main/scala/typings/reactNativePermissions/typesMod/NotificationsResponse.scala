package typings.reactNativePermissions.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsResponse extends js.Object {
  var settings: NotificationSettings = js.native
  var status: PermissionStatus = js.native
}

object NotificationsResponse {
  @scala.inline
  def apply(settings: NotificationSettings, status: PermissionStatus): NotificationsResponse = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsResponse]
  }
  @scala.inline
  implicit class NotificationsResponseOps[Self <: NotificationsResponse] (val x: Self) extends AnyVal {
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
    def setSettings(value: NotificationSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: PermissionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

