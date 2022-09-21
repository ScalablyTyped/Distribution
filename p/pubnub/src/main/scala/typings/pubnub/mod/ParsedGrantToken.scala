package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedGrantToken
  extends StObject
     with GrantTokenParameters {
  
  var signature: Any
  
  var timestamp: Double
  
  var version: Double
}
object ParsedGrantToken {
  
  inline def apply(signature: Any, timestamp: Double, ttl: Double, version: Double): ParsedGrantToken = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedGrantToken]
  }
  
  extension [Self <: ParsedGrantToken](x: Self) {
    
    inline def setSignature(value: Any): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
