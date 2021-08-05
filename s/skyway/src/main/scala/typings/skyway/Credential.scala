package typings.skyway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credential extends StObject {
  
  var authToken: js.UndefOr[String] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
}
object Credential {
  
  inline def apply(): Credential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credential]
  }
  
  extension [Self <: Credential](x: Self) {
    
    inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
