package typings.rrNotifications.anon

import typings.rrNotifications.mod.NotificationPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload extends js.Object {
  var payload: NotificationPayload
  def removeNotification(): Unit
}

object Payload {
  @scala.inline
  def apply(payload: NotificationPayload, removeNotification: () => Unit): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], removeNotification = js.Any.fromFunction0(removeNotification))
    __obj.asInstanceOf[Payload]
  }
}

