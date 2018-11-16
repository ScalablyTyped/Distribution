package typings
package reactDashNotificationDashSystemLib.reactDashNotificationDashSystemMod.NotificationSystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait System
  extends reactLib.reactMod.Component[Attributes, State, js.Any] {
  def addNotification(notification: Notification): Notification = js.native
  def clearNotifications(): scala.Unit = js.native
  def editNotification(uidOrNotification: java.lang.String, newNotification: Notification): scala.Unit = js.native
  def editNotification(uidOrNotification: Notification, newNotification: Notification): scala.Unit = js.native
  def editNotification(uidOrNotification: scala.Double, newNotification: Notification): scala.Unit = js.native
  def removeNotification(uidOrNotification: java.lang.String): scala.Unit = js.native
  def removeNotification(uidOrNotification: Notification): scala.Unit = js.native
  def removeNotification(uidOrNotification: scala.Double): scala.Unit = js.native
}

