package typings.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.Instantiable0
import typings.reactNativeFirebase.anon.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationsStatics extends StObject {
  
  var Android: Action
  
  var Notification: Instantiable0[typings.reactNativeFirebase.mod.RNFirebase.notifications.Notification]
}
object NotificationsStatics {
  
  inline def apply(Android: Action, Notification: Instantiable0[Notification]): NotificationsStatics = {
    val __obj = js.Dynamic.literal(Android = Android.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsStatics]
  }
  
  extension [Self <: NotificationsStatics](x: Self) {
    
    inline def setAndroid(value: Action): Self = StObject.set(x, "Android", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: Instantiable0[Notification]): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
  }
}
