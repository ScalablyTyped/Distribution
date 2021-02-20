package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0 extends StObject {
  
  var auth: Auth = js.native
  
  def users(token: String): Users_ = js.native
  
  var webAuth: WebAuth = js.native
}
object Auth0 {
  
  @scala.inline
  def apply(auth: Auth, users: String => Users_, webAuth: WebAuth): Auth0 = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], users = js.Any.fromFunction1(users), webAuth = webAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0]
  }
  
  @scala.inline
  implicit class Auth0MutableBuilder[Self <: Auth0] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: String => Users_): Self = StObject.set(x, "users", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWebAuth(value: WebAuth): Self = StObject.set(x, "webAuth", value.asInstanceOf[js.Any])
  }
}
