package typings.socketclusterClient.clientsocketMod

import typings.socketclusterClient.authMod.AuthToken
import typings.socketclusterClient.authMod.SignedAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthStateChangeData extends StObject {
  
  var authToken: js.UndefOr[AuthToken] = js.native
  
  var newAuthState: AuthStates = js.native
  
  var oldAuthState: AuthStates = js.native
  
  var signedAuthToken: js.UndefOr[SignedAuthToken] = js.native
}
object AuthStateChangeData {
  
  @scala.inline
  def apply(newAuthState: AuthStates, oldAuthState: AuthStates): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newAuthState = newAuthState.asInstanceOf[js.Any], oldAuthState = oldAuthState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
  
  @scala.inline
  implicit class AuthStateChangeDataMutableBuilder[Self <: AuthStateChangeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    @scala.inline
    def setNewAuthState(value: AuthStates): Self = StObject.set(x, "newAuthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldAuthState(value: AuthStates): Self = StObject.set(x, "oldAuthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedAuthToken(value: SignedAuthToken): Self = StObject.set(x, "signedAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedAuthTokenUndefined: Self = StObject.set(x, "signedAuthToken", js.undefined)
  }
}
