package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserCredential extends js.Object {
  var additionalUserInfo: js.UndefOr[AdditionalUserInfo] = js.undefined
  var user: User
}

object UserCredential {
  @scala.inline
  def apply(user: User, additionalUserInfo: AdditionalUserInfo = null): UserCredential = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    if (additionalUserInfo != null) __obj.updateDynamic("additionalUserInfo")(additionalUserInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCredential]
  }
}

