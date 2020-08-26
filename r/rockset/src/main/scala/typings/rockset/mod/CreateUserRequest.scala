package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUserRequest extends js.Object {
  // user email, must be unique
  var email: String = js.native
  // List of roles for a given user
  var roles: js.UndefOr[js.Array[String]] = js.native
}

object CreateUserRequest {
  @scala.inline
  def apply(email: String): CreateUserRequest = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  @scala.inline
  implicit class CreateUserRequestOps[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    @scala.inline
    def setRoles(value: js.Array[String]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
  }
  
}

