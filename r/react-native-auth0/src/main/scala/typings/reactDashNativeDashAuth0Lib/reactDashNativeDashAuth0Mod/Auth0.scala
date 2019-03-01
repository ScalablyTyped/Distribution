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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(auth)
    __obj.updateDynamic("users")(users)
    __obj.updateDynamic("webAuth")(webAuth)
    __obj.asInstanceOf[Auth0]
  }
}

