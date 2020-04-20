package typings.reapop.mod

import typings.reapop.AnonPayload
import typings.reapop.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action creators
trait Actions_ extends js.Object {
  def addNotification(notification: Notification): Notification
  def removeNotification(notification: Notification): AnonPayload
  def removeNotifications(): AnonType
  def updateNotification(notification: Notification): Notification
}

object Actions_ {
  @scala.inline
  def apply(
    addNotification: Notification => Notification,
    removeNotification: Notification => AnonPayload,
    removeNotifications: () => AnonType,
    updateNotification: Notification => Notification
  ): Actions_ = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), removeNotification = js.Any.fromFunction1(removeNotification), removeNotifications = js.Any.fromFunction0(removeNotifications), updateNotification = js.Any.fromFunction1(updateNotification))
    __obj.asInstanceOf[Actions_]
  }
}

