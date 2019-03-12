package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action creators
trait Actions extends js.Object {
  def addNotification(notification: Notification): Notification
  def removeNotification(notification: Notification): reapopLib.Anon_Payload
  def removeNotifications(): reapopLib.Anon_Type
  def updateNotification(notification: Notification): Notification
}

object Actions {
  @scala.inline
  def apply(
    addNotification: Notification => Notification,
    removeNotification: Notification => reapopLib.Anon_Payload,
    removeNotifications: () => reapopLib.Anon_Type,
    updateNotification: Notification => Notification
  ): Actions = {
    val __obj = js.Dynamic.literal(addNotification = js.Any.fromFunction1(addNotification), removeNotification = js.Any.fromFunction1(removeNotification), removeNotifications = js.Any.fromFunction0(removeNotifications), updateNotification = js.Any.fromFunction1(updateNotification))
  
    __obj.asInstanceOf[Actions]
  }
}

