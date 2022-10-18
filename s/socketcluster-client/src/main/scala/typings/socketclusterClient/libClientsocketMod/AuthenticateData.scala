package typings.socketclusterClient.libClientsocketMod

import typings.socketclusterClient.libAuthMod.AuthToken
import typings.socketclusterClient.libAuthMod.SignedAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticateData extends StObject {
  
  var authToken: AuthToken
  
  var signedAuthToken: SignedAuthToken
}
object AuthenticateData {
  
  inline def apply(authToken: AuthToken, signedAuthToken: SignedAuthToken): AuthenticateData = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateData]
  }
  
  extension [Self <: AuthenticateData](x: Self) {
    
    inline def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    inline def setSignedAuthToken(value: SignedAuthToken): Self = StObject.set(x, "signedAuthToken", value.asInstanceOf[js.Any])
  }
}
