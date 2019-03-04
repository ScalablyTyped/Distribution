package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0 extends js.Object {
  var auth: Auth
  var webAuth: WebAuth
  def users(token: java.lang.String): Users
}

object Auth0 {
  @scala.inline
  def apply(auth: Auth, users: js.Function1[java.lang.String, Users], webAuth: WebAuth): Auth0 = {
    val __obj = js.Dynamic.literal(auth = auth, users = users, webAuth = webAuth)
  
    __obj.asInstanceOf[Auth0]
  }
}

