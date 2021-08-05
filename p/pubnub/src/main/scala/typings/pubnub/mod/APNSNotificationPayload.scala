package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APNSNotificationPayload
  extends StObject
     with BaseNotificationPayload {
  
  var apnsPushType: js.UndefOr[String] = js.undefined
  
  var configurations: js.Array[APNS2Configuration]
  
  var isSilent: Boolean
}
object APNSNotificationPayload {
  
  inline def apply(configurations: js.Array[APNS2Configuration], isSilent: Boolean, payload: js.Object): APNSNotificationPayload = {
    val __obj = js.Dynamic.literal(configurations = configurations.asInstanceOf[js.Any], isSilent = isSilent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[APNSNotificationPayload]
  }
  
  extension [Self <: APNSNotificationPayload](x: Self) {
    
    inline def setApnsPushType(value: String): Self = StObject.set(x, "apnsPushType", value.asInstanceOf[js.Any])
    
    inline def setApnsPushTypeUndefined: Self = StObject.set(x, "apnsPushType", js.undefined)
    
    inline def setConfigurations(value: js.Array[APNS2Configuration]): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsVarargs(value: APNS2Configuration*): Self = StObject.set(x, "configurations", js.Array(value :_*))
    
    inline def setIsSilent(value: Boolean): Self = StObject.set(x, "isSilent", value.asInstanceOf[js.Any])
  }
}
