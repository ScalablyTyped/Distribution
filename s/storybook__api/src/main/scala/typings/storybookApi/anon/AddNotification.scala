package typings.storybookApi.anon

import typings.storybookApi.notificationsMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddNotification extends js.Object {
  def addNotification(notification: Notification): Unit
  def clearNotification(id: String): Unit
}

object AddNotification {
  @scala.inline
  def apply(addNotification: Notification => Unit, clearNotification: String => Unit): AddNotification = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), clearNotification = js.Any.fromFunction1(clearNotification))
    __obj.asInstanceOf[AddNotification]
  }
}

