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
    addNotification: js.Function1[Notification, Notification],
    removeNotification: js.Function1[Notification, reapopLib.Anon_Payload],
    removeNotifications: js.Function0[reapopLib.Anon_Type],
    updateNotification: js.Function1[Notification, Notification]
  ): Actions = {
    val __obj = js.Dynamic.literal(addNotification = addNotification, removeNotification = removeNotification, removeNotifications = removeNotifications, updateNotification = updateNotification)
  
    __obj.asInstanceOf[Actions]
  }
}

