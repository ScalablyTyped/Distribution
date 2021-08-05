package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientData extends StObject {
  
  var challenge: java.lang.String
  
  var extensions: js.UndefOr[WebAuthnExtensions] = js.undefined
  
  var hashAlg: java.lang.String | Algorithm
  
  var origin: java.lang.String
  
  var rpId: java.lang.String
  
  var tokenBinding: js.UndefOr[java.lang.String] = js.undefined
}
object ClientData {
  
  inline def apply(
    challenge: java.lang.String,
    hashAlg: java.lang.String | Algorithm,
    origin: java.lang.String,
    rpId: java.lang.String
  ): ClientData = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rpId = rpId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientData]
  }
  
  extension [Self <: ClientData](x: Self) {
    
    inline def setChallenge(value: java.lang.String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: WebAuthnExtensions): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHashAlg(value: java.lang.String | Algorithm): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setRpId(value: java.lang.String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    inline def setTokenBinding(value: java.lang.String): Self = StObject.set(x, "tokenBinding", value.asInstanceOf[js.Any])
    
    inline def setTokenBindingUndefined: Self = StObject.set(x, "tokenBinding", js.undefined)
  }
}
