package typings.skywayJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerCredential extends StObject {
  
  var authToken: String
  
  var timestamp: Double
  
  var ttl: Double
}
object PeerCredential {
  
  inline def apply(authToken: String, timestamp: Double, ttl: Double): PeerCredential = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerCredential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerCredential] (val x: Self) extends AnyVal {
    
    inline def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
