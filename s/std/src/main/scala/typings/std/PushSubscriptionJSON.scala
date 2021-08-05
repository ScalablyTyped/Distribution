package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushSubscriptionJSON extends StObject {
  
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  
  var expirationTime: js.UndefOr[Double | Null] = js.undefined
  
  var keys: js.UndefOr[Record[java.lang.String, java.lang.String]] = js.undefined
}
object PushSubscriptionJSON {
  
  inline def apply(): PushSubscriptionJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionJSON]
  }
  
  extension [Self <: PushSubscriptionJSON](x: Self) {
    
    inline def setEndpoint(value: java.lang.String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setExpirationTime(value: Double): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setKeys(value: Record[java.lang.String, java.lang.String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
  }
}
