package typings.reapop.mod

import typings.reapop.anon.Payload
import typings.reapop.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action creators
trait Actions_ extends js.Object {
  def addNotification(notification: Notification): Notification
  def removeNotification(notification: Notification): Payload
  def removeNotifications(): Type
  def updateNotification(notification: Notification): Notification
}

object Actions_ {
  @scala.inline
  def apply(
    addNotification: Notification => Notification,
    removeNotification: Notification => Payload,
    removeNotifications: () => Type,
    updateNotification: Notification => Notification
  ): Actions_ = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), removeNotification = js.Any.fromFunction1(removeNotification), removeNotifications = js.Any.fromFunction0(removeNotifications), updateNotification = js.Any.fromFunction1(updateNotification))
    __obj.asInstanceOf[Actions_]
  }
}

