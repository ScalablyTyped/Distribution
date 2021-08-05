package typings.storybookUi.anon

import typings.emotionSerialize.mod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearNotification extends StObject {
  
  def clearNotification(id: String): Unit
  
  var notifications: js.Array[typings.storybookApi.notificationsMod.Notification]
  
  var placement: CSSObject
}
object ClearNotification {
  
  inline def apply(
    clearNotification: String => Unit,
    notifications: js.Array[typings.storybookApi.notificationsMod.Notification],
    placement: CSSObject
  ): ClearNotification = {
    val __obj = js.Dynamic.literal(clearNotification = js.Any.fromFunction1(clearNotification), notifications = notifications.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearNotification]
  }
  
  extension [Self <: ClearNotification](x: Self) {
    
    inline def setClearNotification(value: String => Unit): Self = StObject.set(x, "clearNotification", js.Any.fromFunction1(value))
    
    inline def setNotifications(value: js.Array[typings.storybookApi.notificationsMod.Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsVarargs(value: typings.storybookApi.notificationsMod.Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
    
    inline def setPlacement(value: CSSObject): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
