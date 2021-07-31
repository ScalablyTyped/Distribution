package typings.reactNativeFirebase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthCredential extends StObject {
  
  var providerId: String
  
  var secret: String
  
  var token: String
}
object AuthCredential {
  
  @scala.inline
  def apply(providerId: String, secret: String, token: String): AuthCredential = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCredential]
  }
  
  @scala.inline
  implicit class AuthCredentialMutableBuilder[Self <: AuthCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
