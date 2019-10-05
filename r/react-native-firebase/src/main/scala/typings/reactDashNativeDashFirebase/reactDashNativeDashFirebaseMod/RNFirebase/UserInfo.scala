package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var photoURL: js.UndefOr[String] = js.undefined
  var providerId: String
  var uid: String
}

object UserInfo {
  @scala.inline
  def apply(
    providerId: String,
    uid: String,
    displayName: String = null,
    email: String = null,
    phoneNumber: String = null,
    photoURL: String = null
  ): UserInfo = {
    val __obj = js.Dynamic.literal(providerId = providerId, uid = uid)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL)
    __obj.asInstanceOf[UserInfo]
  }
}

