package typings.reactNotificationSystem.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait System
  extends Component[Attributes, State, js.Any] {
  def addNotification(notification: Notification): Notification = js.native
  def clearNotifications(): Unit = js.native
  def editNotification(uidOrNotification: String, newNotification: Notification): Unit = js.native
  def editNotification(uidOrNotification: Double, newNotification: Notification): Unit = js.native
  def editNotification(uidOrNotification: Notification, newNotification: Notification): Unit = js.native
  def removeNotification(uidOrNotification: String): Unit = js.native
  def removeNotification(uidOrNotification: Double): Unit = js.native
  def removeNotification(uidOrNotification: Notification): Unit = js.native
}

