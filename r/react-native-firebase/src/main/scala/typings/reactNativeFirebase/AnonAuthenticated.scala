package typings.reactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthenticated extends js.Object {
  var authenticated: Boolean
  var user: js.Object | Null
}

object AnonAuthenticated {
  @scala.inline
  def apply(authenticated: Boolean, user: js.Object = null): AnonAuthenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthenticated]
  }
}

