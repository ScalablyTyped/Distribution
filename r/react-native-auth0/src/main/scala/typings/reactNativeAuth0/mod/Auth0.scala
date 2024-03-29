package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0 extends StObject {
  
  var auth: Auth
  
  var credentialsManager: CredentialsManager
  
  def users(token: String): Users_
  
  var webAuth: WebAuth
}
object Auth0 {
  
  inline def apply(auth: Auth, credentialsManager: CredentialsManager, users: String => Users_, webAuth: WebAuth): Auth0 = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], credentialsManager = credentialsManager.asInstanceOf[js.Any], users = js.Any.fromFunction1(users), webAuth = webAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Auth0] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setCredentialsManager(value: CredentialsManager): Self = StObject.set(x, "credentialsManager", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: String => Users_): Self = StObject.set(x, "users", js.Any.fromFunction1(value))
    
    inline def setWebAuth(value: WebAuth): Self = StObject.set(x, "webAuth", value.asInstanceOf[js.Any])
  }
}
