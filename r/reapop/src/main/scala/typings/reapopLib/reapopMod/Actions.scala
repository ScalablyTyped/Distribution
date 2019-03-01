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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNotification")(addNotification)
    __obj.updateDynamic("removeNotification")(removeNotification)
    __obj.updateDynamic("removeNotifications")(removeNotifications)
    __obj.updateDynamic("updateNotification")(updateNotification)
    __obj.asInstanceOf[Actions]
  }
}

