package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var notifications: js.Array[Notification]
}

object State {
  @scala.inline
  def apply(notifications: js.Array[Notification]): State = {
    val __obj = js.Dynamic.literal(notifications = notifications)
  
    __obj.asInstanceOf[State]
  }
}

