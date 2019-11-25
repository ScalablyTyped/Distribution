package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.undefined
  // user email
  var email: String
  // user first name
  var first_name: js.UndefOr[String] = js.undefined
  // user last name
  var last_name: js.UndefOr[String] = js.undefined
  // List of roles for a given user
  var roles: js.UndefOr[js.Array[String]] = js.undefined
  // state of user - NEW / ACTIVE
  var state: js.UndefOr[String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    email: String,
    created_at: String = null,
    first_name: String = null,
    last_name: String = null,
    roles: js.Array[String] = null,
    state: String = null
  ): User = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

