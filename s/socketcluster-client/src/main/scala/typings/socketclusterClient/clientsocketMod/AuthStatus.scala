package typings.socketclusterClient.clientsocketMod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthStatus extends StObject {
  
  var authError: Error = js.native
  
  var isAuthenticated: AuthStates = js.native
}
object AuthStatus {
  
  @scala.inline
  def apply(authError: Error, isAuthenticated: AuthStates): AuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStatus]
  }
  
  @scala.inline
  implicit class AuthStatusMutableBuilder[Self <: AuthStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthError(value: Error): Self = StObject.set(x, "authError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAuthenticated(value: AuthStates): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
  }
}
