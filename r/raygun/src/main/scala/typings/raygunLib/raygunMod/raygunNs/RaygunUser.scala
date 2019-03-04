package typings
package raygunLib.raygunMod.raygunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaygunUser extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  var identifier: java.lang.String
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object RaygunUser {
  @scala.inline
  def apply(
    identifier: java.lang.String,
    email: java.lang.String = null,
    firstName: java.lang.String = null,
    fullName: java.lang.String = null,
    uuid: java.lang.String = null
  ): RaygunUser = {
    val __obj = js.Dynamic.literal(identifier = identifier)
    if (email != null) __obj.updateDynamic("email")(email)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[RaygunUser]
  }
}

