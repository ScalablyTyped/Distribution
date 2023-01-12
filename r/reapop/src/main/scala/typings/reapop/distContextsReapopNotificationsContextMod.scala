package typings.reapop

import typings.react.mod.Context
import typings.reapop.anon.FnCall
import typings.reapop.distReducersNotificationsTypesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distContextsReapopNotificationsContextMod {
  
  @JSImport("reapop/dist/contexts/reapopNotificationsContext", "ReapopNotificationsContext")
  @js.native
  val ReapopNotificationsContext: Context[NotificationsContext] = js.native
  
  trait NotificationsContext extends StObject {
    
    def dismissNotification(id: String): Unit
    
    def dismissNotifications(): Unit
    
    var notifications: js.Array[Notification]
    
    @JSName("notify")
    var notify_FNotificationsContext: FnCall
  }
  object NotificationsContext {
    
    inline def apply(
      dismissNotification: String => Unit,
      dismissNotifications: () => Unit,
      notifications: js.Array[Notification],
      notify_ : FnCall
    ): NotificationsContext = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), dismissNotifications = js.Any.fromFunction0(dismissNotifications), notifications = notifications.asInstanceOf[js.Any])
      __obj.updateDynamic("notify")(notify_.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationsContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationsContext] (val x: Self) extends AnyVal {
      
      inline def setDismissNotification(value: String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      inline def setDismissNotifications(value: () => Unit): Self = StObject.set(x, "dismissNotifications", js.Any.fromFunction0(value))
      
      inline def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value*))
      
      inline def setNotify_(value: FnCall): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    }
  }
}
