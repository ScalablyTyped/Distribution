package typings.reapop.reapopMod

import typings.reapop.Anon_Payload
import typings.reapop.Anon_Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action creators
trait Actions extends js.Object {
  def addNotification(notification: Notification): Notification
  def removeNotification(notification: Notification): Anon_Payload
  def removeNotifications(): Anon_Type
  def updateNotification(notification: Notification): Notification
}

object Actions {
  @scala.inline
  def apply(
    addNotification: Notification => Notification,
    removeNotification: Notification => Anon_Payload,
    removeNotifications: () => Anon_Type,
    updateNotification: Notification => Notification
  ): Actions = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), removeNotification = js.Any.fromFunction1(removeNotification), removeNotifications = js.Any.fromFunction0(removeNotifications), updateNotification = js.Any.fromFunction1(updateNotification))
  
    __obj.asInstanceOf[Actions]
  }
}

