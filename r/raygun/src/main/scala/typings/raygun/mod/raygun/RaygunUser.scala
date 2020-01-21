package typings.raygun.mod.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunUser extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var firstName: js.UndefOr[String] = js.undefined
  var fullName: js.UndefOr[String] = js.undefined
  var identifier: String
  var uuid: js.UndefOr[String] = js.undefined
}

object RaygunUser {
  @scala.inline
  def apply(
    identifier: String,
    email: String = null,
    firstName: String = null,
    fullName: String = null,
    uuid: String = null
  ): RaygunUser = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaygunUser]
  }
}

