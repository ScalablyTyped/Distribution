package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserRequest extends js.Object {
  // user email, must be unique
  var email: String
  // List of roles for a given user
  var roles: js.UndefOr[js.Array[String]] = js.undefined
}

object CreateUserRequest {
  @scala.inline
  def apply(email: String, roles: js.Array[String] = null): CreateUserRequest = {
    val __obj = js.Dynamic.literal(email = email)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    __obj.asInstanceOf[CreateUserRequest]
  }
}

