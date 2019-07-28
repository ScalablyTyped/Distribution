package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRealmParams extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var password: String
  var realm: String
  var scope: js.UndefOr[String] = js.undefined
  var username: String
}

object PasswordRealmParams {
  @scala.inline
  def apply(password: String, realm: String, username: String, audience: String = null, scope: String = null): PasswordRealmParams = {
    val __obj = js.Dynamic.literal(password = password, realm = realm, username = username)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[PasswordRealmParams]
  }
}

