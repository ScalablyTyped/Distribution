package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeResponse extends StObject {
  
  var accessToken: String = js.native
  
  var expiresIn: Double = js.native
  
  var idToken: String = js.native
  
  var refreshToken: String = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var tokenType: String = js.native
}
object ExchangeResponse {
  
  @scala.inline
  def apply(accessToken: String, expiresIn: Double, idToken: String, refreshToken: String, tokenType: String): ExchangeResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeResponse]
  }
  
  @scala.inline
  implicit class ExchangeResponseMutableBuilder[Self <: ExchangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
  }
}
