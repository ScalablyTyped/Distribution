package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshTokenResponse extends StObject {
  
  var accessToken: String
  
  var expiresIn: Double
  
  var idToken: String
  
  var scope: js.UndefOr[String] = js.undefined
  
  var tokenType: String
}
object RefreshTokenResponse {
  
  @scala.inline
  def apply(accessToken: String, expiresIn: Double, idToken: String, tokenType: String): RefreshTokenResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTokenResponse]
  }
  
  @scala.inline
  implicit class RefreshTokenResponseMutableBuilder[Self <: RefreshTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
  }
}
