package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOAuthCredential extends StObject {
  
  var accessToken: java.lang.String
  
  var macKey: java.lang.String
}
object RTCOAuthCredential {
  
  inline def apply(accessToken: java.lang.String, macKey: java.lang.String): RTCOAuthCredential = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], macKey = macKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOAuthCredential]
  }
  
  extension [Self <: RTCOAuthCredential](x: Self) {
    
    inline def setAccessToken(value: java.lang.String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setMacKey(value: java.lang.String): Self = StObject.set(x, "macKey", value.asInstanceOf[js.Any])
  }
}
