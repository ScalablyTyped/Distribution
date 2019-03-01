package typings
package reactDashFacebookDashLoginLib.reactDashFacebookDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFacebookLoginInfo extends js.Object {
  var accessToken: java.lang.String
  var email: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ReactFacebookLoginInfo {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    id: java.lang.String,
    email: java.lang.String = null,
    name: java.lang.String = null
  ): ReactFacebookLoginInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("id")(id)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ReactFacebookLoginInfo]
  }
}

