package typings.reapop

import typings.reapop.reapopNotificationsContextMod.NotificationsContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useNotificationsMod {
  
  @JSImport("reapop/dist/hooks/useNotifications", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useNotifications(): NotificationsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useNotifications")().asInstanceOf[NotificationsContext]
}
