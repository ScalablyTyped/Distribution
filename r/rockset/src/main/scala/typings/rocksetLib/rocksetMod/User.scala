package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  // ISO-8601 date
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  // user email
  var email: java.lang.String
  // user first name
  var first_name: js.UndefOr[java.lang.String] = js.undefined
  // user last name
  var last_name: js.UndefOr[java.lang.String] = js.undefined
  // List of roles for a given user
  var roles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // state of user - NEW / ACTIVE
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object User {
  @scala.inline
  def apply(
    email: java.lang.String,
    created_at: java.lang.String = null,
    first_name: java.lang.String = null,
    last_name: java.lang.String = null,
    roles: js.Array[java.lang.String] = null,
    state: java.lang.String = null
  ): User = {
    val __obj = js.Dynamic.literal(email = email)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    if (first_name != null) __obj.updateDynamic("first_name")(first_name)
    if (last_name != null) __obj.updateDynamic("last_name")(last_name)
    if (roles != null) __obj.updateDynamic("roles")(roles)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[User]
  }
}

