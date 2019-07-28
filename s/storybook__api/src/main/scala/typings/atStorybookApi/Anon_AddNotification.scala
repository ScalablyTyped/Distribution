package typings.atStorybookApi

import typings.atStorybookApi.distModulesNotificationsMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddNotification extends js.Object {
  def addNotification(notification: Notification): Unit
  def clearNotification(id: String): Unit
}

object Anon_AddNotification {
  @scala.inline
  def apply(addNotification: Notification => Unit, clearNotification: String => Unit): Anon_AddNotification = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), clearNotification = js.Any.fromFunction1(clearNotification))
  
    __obj.asInstanceOf[Anon_AddNotification]
  }
}

