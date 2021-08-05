package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0 extends StObject {
  
  var auth: Auth
  
  def users(token: String): Users_
  
  var webAuth: WebAuth
}
object Auth0 {
  
  inline def apply(auth: Auth, users: String => Users_, webAuth: WebAuth): Auth0 = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], users = js.Any.fromFunction1(users), webAuth = webAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0]
  }
  
  extension [Self <: Auth0](x: Self) {
    
    inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: String => Users_): Self = StObject.set(x, "users", js.Any.fromFunction1(value))
    
    inline def setWebAuth(value: WebAuth): Self = StObject.set(x, "webAuth", value.asInstanceOf[js.Any])
  }
}
