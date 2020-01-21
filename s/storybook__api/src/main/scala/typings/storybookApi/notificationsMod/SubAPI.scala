package typings.storybookApi.notificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def addNotification(notification: Notification): Unit
  def clearNotification(id: String): Unit
}

object SubAPI {
  @scala.inline
  def apply(addNotification: Notification => Unit, clearNotification: String => Unit): SubAPI = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), clearNotification = js.Any.fromFunction1(clearNotification))
  
    __obj.asInstanceOf[SubAPI]
  }
}

