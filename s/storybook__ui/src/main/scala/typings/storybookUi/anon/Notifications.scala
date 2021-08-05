package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notifications extends StObject {
  
  def clearNotification(id: String): Unit
  
  var notifications: js.Array[typings.storybookApi.notificationsMod.Notification]
}
object Notifications {
  
  inline def apply(
    clearNotification: String => Unit,
    notifications: js.Array[typings.storybookApi.notificationsMod.Notification]
  ): Notifications = {
    val __obj = js.Dynamic.literal(clearNotification = js.Any.fromFunction1(clearNotification), notifications = notifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
  
  extension [Self <: Notifications](x: Self) {
    
    inline def setClearNotification(value: String => Unit): Self = StObject.set(x, "clearNotification", js.Any.fromFunction1(value))
    
    inline def setNotifications(value: js.Array[typings.storybookApi.notificationsMod.Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsVarargs(value: typings.storybookApi.notificationsMod.Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
  }
}
