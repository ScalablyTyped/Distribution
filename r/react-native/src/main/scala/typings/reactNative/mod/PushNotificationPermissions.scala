package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNotificationPermissions extends StObject {
  
  var alert: js.UndefOr[Boolean] = js.undefined
  
  var badge: js.UndefOr[Boolean] = js.undefined
  
  var sound: js.UndefOr[Boolean] = js.undefined
}
object PushNotificationPermissions {
  
  inline def apply(): PushNotificationPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushNotificationPermissions]
  }
  
  extension [Self <: PushNotificationPermissions](x: Self) {
    
    inline def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
    
    inline def setBadge(value: Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
  }
}
