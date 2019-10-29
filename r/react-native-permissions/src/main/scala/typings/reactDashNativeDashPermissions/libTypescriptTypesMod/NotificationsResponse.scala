package typings.reactDashNativeDashPermissions.libTypescriptTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsResponse extends js.Object {
  var settings: NotificationSettings
  var status: PermissionStatus
}

object NotificationsResponse {
  @scala.inline
  def apply(settings: NotificationSettings, status: PermissionStatus): NotificationsResponse = {
    val __obj = js.Dynamic.literal(settings = settings, status = status)
  
    __obj.asInstanceOf[NotificationsResponse]
  }
}

