package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdTokenResult extends StObject {
  
  var authTime: String
  
  var claims: StringDictionary[Any]
  
  var expirationTime: String
  
  var issuedAtTime: String
  
  var signInProvider: Null | String
  
  var token: String
}
object IdTokenResult {
  
  inline def apply(
    authTime: String,
    claims: StringDictionary[Any],
    expirationTime: String,
    issuedAtTime: String,
    token: String
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime.asInstanceOf[js.Any], claims = claims.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], issuedAtTime = issuedAtTime.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], signInProvider = null)
    __obj.asInstanceOf[IdTokenResult]
  }
  
  extension [Self <: IdTokenResult](x: Self) {
    
    inline def setAuthTime(value: String): Self = StObject.set(x, "authTime", value.asInstanceOf[js.Any])
    
    inline def setClaims(value: StringDictionary[Any]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setIssuedAtTime(value: String): Self = StObject.set(x, "issuedAtTime", value.asInstanceOf[js.Any])
    
    inline def setSignInProvider(value: String): Self = StObject.set(x, "signInProvider", value.asInstanceOf[js.Any])
    
    inline def setSignInProviderNull: Self = StObject.set(x, "signInProvider", null)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
