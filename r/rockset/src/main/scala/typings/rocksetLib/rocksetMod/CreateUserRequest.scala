package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  // user email, must be unique
  var email: java.lang.String
  // List of roles for a given user
  var roles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CreateUserRequest {
  @scala.inline
  def apply(email: java.lang.String, roles: js.Array[java.lang.String] = null): CreateUserRequest = {
    val __obj = js.Dynamic.literal(email = email)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    __obj.asInstanceOf[CreateUserRequest]
  }
}

