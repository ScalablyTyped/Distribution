package typings.reapop

import typings.reapop.anon.PartialNotificationConfig
import typings.reapop.distReducersNotificationsTypesMod.NewNotification
import typings.reapop.distReducersNotificationsTypesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesNotificationsMod {
  
  @JSImport("reapop/dist/services/notifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateId")().asInstanceOf[String]
  
  inline def prepareNotification(notification: NewNotification): Notification = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareNotification")(notification.asInstanceOf[js.Any]).asInstanceOf[Notification]
  
  inline def resetNotificationsConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetNotificationsConfig")().asInstanceOf[Unit]
  
  inline def setUpNotifications(props: PartialNotificationConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpNotifications")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
