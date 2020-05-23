package typings.rrNotifications.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsContextType extends js.Object {
  def removeNotification(id: String): js.Function0[Unit] = js.native
  def showNotification(): Unit = js.native
  def showNotification(payload: NotificationPayload): Unit = js.native
}

