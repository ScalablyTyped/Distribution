package typings.reapop

import typings.react.mod.Context
import typings.reapop.typesMod.NewNotification
import typings.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reapopNotificationsContextMod {
  
  @JSImport("reapop/dist/contexts/reapopNotificationsContext", "ReapopNotificationsContext")
  @js.native
  val ReapopNotificationsContext: Context[NotificationsContext] = js.native
  
  @js.native
  trait NotificationsContext extends StObject {
    
    def dismissNotification(id: String): Unit = js.native
    
    def dismissNotifications(): Unit = js.native
    
    var notifications: js.Array[Notification] = js.native
    
    def notify(notification: NewNotification): Unit = js.native
  }
  object NotificationsContext {
    
    @scala.inline
    def apply(
      dismissNotification: String => Unit,
      dismissNotifications: () => Unit,
      notifications: js.Array[Notification],
      notify_ : NewNotification => Unit
    ): NotificationsContext = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), dismissNotifications = js.Any.fromFunction0(dismissNotifications), notifications = notifications.asInstanceOf[js.Any])
      __obj.updateDynamic("notify")(js.Any.fromFunction1(notify_))
      __obj.asInstanceOf[NotificationsContext]
    }
    
    @scala.inline
    implicit class NotificationsContextMutableBuilder[Self <: NotificationsContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDismissNotification(value: String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDismissNotifications(value: () => Unit): Self = StObject.set(x, "dismissNotifications", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setNotify_(value: NewNotification => Unit): Self = StObject.set(x, "notify", js.Any.fromFunction1(value))
    }
  }
}
