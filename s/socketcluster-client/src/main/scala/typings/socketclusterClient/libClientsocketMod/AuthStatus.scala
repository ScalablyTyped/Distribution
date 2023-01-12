package typings.socketclusterClient.libClientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthStatus extends StObject {
  
  var authError: js.Error
  
  var isAuthenticated: AuthStates
}
object AuthStatus {
  
  inline def apply(authError: js.Error, isAuthenticated: AuthStates): AuthStatus = {
    val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthStatus] (val x: Self) extends AnyVal {
    
    inline def setAuthError(value: js.Error): Self = StObject.set(x, "authError", value.asInstanceOf[js.Any])
    
    inline def setIsAuthenticated(value: AuthStates): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
  }
}
