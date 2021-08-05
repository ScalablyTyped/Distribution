package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeParams extends StObject {
  
  var code: String
  
  var redirectUri: String
  
  var verifier: String
}
object ExchangeParams {
  
  inline def apply(code: String, redirectUri: String, verifier: String): ExchangeParams = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], verifier = verifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeParams]
  }
  
  extension [Self <: ExchangeParams](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setVerifier(value: String): Self = StObject.set(x, "verifier", value.asInstanceOf[js.Any])
  }
}
