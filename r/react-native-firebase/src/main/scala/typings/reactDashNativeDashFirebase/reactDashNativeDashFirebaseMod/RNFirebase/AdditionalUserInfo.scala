package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalUserInfo extends js.Object {
  var isNewUser: Boolean
  var profile: js.UndefOr[js.Object] = js.undefined
  var providerId: String
  var username: js.UndefOr[String] = js.undefined
}

object AdditionalUserInfo {
  @scala.inline
  def apply(isNewUser: Boolean, providerId: String, profile: js.Object = null, username: String = null): AdditionalUserInfo = {
    val __obj = js.Dynamic.literal(isNewUser = isNewUser, providerId = providerId)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[AdditionalUserInfo]
  }
}

