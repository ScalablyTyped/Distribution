package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Action creators

trait Actions extends js.Object {
  def addNotification(notification: Notification): Notification
  def removeNotification(notification: Notification): reapopLib.Anon_Type
  def removeNotifications(): reapopLib.Anon_TypeString
  def updateNotification(notification: Notification): Notification
}

