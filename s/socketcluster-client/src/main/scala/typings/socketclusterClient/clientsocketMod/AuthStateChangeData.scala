package typings.socketclusterClient.clientsocketMod

import typings.socketclusterClient.authMod.AuthToken
import typings.socketclusterClient.authMod.SignedAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthStateChangeData extends StObject {
  
  var authToken: js.UndefOr[AuthToken] = js.undefined
  
  var newAuthState: AuthStates
  
  var oldAuthState: AuthStates
  
  var signedAuthToken: js.UndefOr[SignedAuthToken] = js.undefined
}
object AuthStateChangeData {
  
  inline def apply(newAuthState: AuthStates, oldAuthState: AuthStates): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newAuthState = newAuthState.asInstanceOf[js.Any], oldAuthState = oldAuthState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
  
  extension [Self <: AuthStateChangeData](x: Self) {
    
    inline def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    inline def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    inline def setNewAuthState(value: AuthStates): Self = StObject.set(x, "newAuthState", value.asInstanceOf[js.Any])
    
    inline def setOldAuthState(value: AuthStates): Self = StObject.set(x, "oldAuthState", value.asInstanceOf[js.Any])
    
    inline def setSignedAuthToken(value: SignedAuthToken): Self = StObject.set(x, "signedAuthToken", value.asInstanceOf[js.Any])
    
    inline def setSignedAuthTokenUndefined: Self = StObject.set(x, "signedAuthToken", js.undefined)
  }
}
