package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0 extends js.Object {
  
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
  implicit class Auth0Ops[Self <: Auth0] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: Auth): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: String => Users_): Self = this.set("users", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWebAuth(value: WebAuth): Self = this.set("webAuth", value.asInstanceOf[js.Any])
  }
}
