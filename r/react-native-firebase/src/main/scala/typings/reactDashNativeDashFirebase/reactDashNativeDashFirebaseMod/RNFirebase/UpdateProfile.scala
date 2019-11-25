package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProfile extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var photoURL: js.UndefOr[String] = js.undefined
}

object UpdateProfile {
  @scala.inline
  def apply(displayName: String = null, photoURL: String = null): UpdateProfile = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfile]
  }
}

