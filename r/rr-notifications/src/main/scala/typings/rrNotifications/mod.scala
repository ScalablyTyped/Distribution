package typings.rrNotifications

import typings.react.mod.Context
import typings.react.mod.FC
import typings.rrNotifications.anon.AnimationDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rr-notifications", "NotificationsContext")
  @js.native
  val NotificationsContext: Context[NotificationsContextType] = js.native
  
  @JSImport("rr-notifications", "NotificationsProvider")
  @js.native
  val NotificationsProvider: FC[AnimationDuration] = js.native
  
  @JSImport("rr-notifications", "useNotification")
  @js.native
  def useNotification(): NotificationsContextType = js.native
  
  @js.native
  trait NotificationPayload extends StObject
  
  @js.native
  trait NotificationsContextType extends StObject {
    
    def removeNotification(id: String): js.Function0[Unit] = js.native
    
    def showNotification(): Unit = js.native
    def showNotification(payload: NotificationPayload): Unit = js.native
  }
}
