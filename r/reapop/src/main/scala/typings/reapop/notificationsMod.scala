package typings.reapop

import typings.reapop.anon.PartialNotificationConfig
import typings.reapop.typesMod.NewNotification
import typings.reapop.typesMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reapop/dist/services/notifications", JSImport.Namespace)
@js.native
object notificationsMod extends js.Object {
  
  def generateId(): String = js.native
  
  def prepareNotification(notification: NewNotification): Notification = js.native
  
  def resetNotificationsConfig(): Unit = js.native
  
  def setUpNotifications(props: PartialNotificationConfig): Unit = js.native
}
