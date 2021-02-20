package typings.reactNativeAuth0.mod

import typings.reactNativeAuth0.reactNativeAuth0Strings.Bearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordRealmResponse extends StObject {
  
  var accessToken: String = js.native
  
  var expiresIn: Double = js.native
  
  var idToken: String = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var scope: String = js.native
  
  var tokenType: Bearer = js.native
}
object PasswordRealmResponse {
  
  @scala.inline
  def apply(accessToken: String, expiresIn: Double, idToken: String, scope: String, tokenType: Bearer): PasswordRealmResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordRealmResponse]
  }
  
  @scala.inline
  implicit class PasswordRealmResponseMutableBuilder[Self <: PasswordRealmResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: Bearer): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
  }
}
