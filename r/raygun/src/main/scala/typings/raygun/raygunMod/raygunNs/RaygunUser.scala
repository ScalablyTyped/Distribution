package typings.raygun.raygunMod.raygunNs

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
    val __obj = js.Dynamic.literal(identifier = identifier)
    if (email != null) __obj.updateDynamic("email")(email)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[RaygunUser]
  }
}

