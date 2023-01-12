package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushSubscriptionJSON extends StObject {
  
  /* standard dom */
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var expirationTime: js.UndefOr[EpochTimeStamp | Null] = js.undefined
  
  /* standard dom */
  var keys: js.UndefOr[Record[java.lang.String, java.lang.String]] = js.undefined
}
object PushSubscriptionJSON {
  
  inline def apply(): PushSubscriptionJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushSubscriptionJSON] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: java.lang.String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setExpirationTime(value: EpochTimeStamp): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeNull: Self = StObject.set(x, "expirationTime", null)
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setKeys(value: Record[java.lang.String, java.lang.String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
  }
}
