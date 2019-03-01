package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserResponse extends js.Object {
  var Id: java.lang.String
  var email: java.lang.String
  var emailVerified: scala.Boolean
}

object CreateUserResponse {
  @scala.inline
  def apply(Id: java.lang.String, email: java.lang.String, emailVerified: scala.Boolean): CreateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("emailVerified")(emailVerified)
    __obj.asInstanceOf[CreateUserResponse]
  }
}

