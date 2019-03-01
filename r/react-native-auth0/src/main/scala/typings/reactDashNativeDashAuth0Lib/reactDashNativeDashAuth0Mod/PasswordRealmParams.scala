package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordRealmParams extends js.Object {
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var realm: java.lang.String
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

object PasswordRealmParams {
  @scala.inline
  def apply(
    password: java.lang.String,
    realm: java.lang.String,
    username: java.lang.String,
    audience: java.lang.String = null,
    scope: java.lang.String = null
  ): PasswordRealmParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("realm")(realm)
    __obj.updateDynamic("username")(username)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[PasswordRealmParams]
  }
}

