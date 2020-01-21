package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0 extends js.Object {
  var auth: Auth
  var webAuth: WebAuth
  def users(token: String): Users_
}

object Auth0 {
  @scala.inline
  def apply(auth: Auth, users: String => Users_, webAuth: WebAuth): Auth0 = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], users = js.Any.fromFunction1(users), webAuth = webAuth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Auth0]
  }
}

