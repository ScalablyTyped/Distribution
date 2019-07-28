package typings.reactDashFacebookDashLoginDashComponent.reactDashFacebookDashLoginDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacebookLoginInfo extends js.Object {
  var accessToken: String
  var email: js.UndefOr[String] = js.undefined
  var id: String
  var name: js.UndefOr[String] = js.undefined
}

object FacebookLoginInfo {
  @scala.inline
  def apply(accessToken: String, id: String, email: String = null, name: String = null): FacebookLoginInfo = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, id = id)
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[FacebookLoginInfo]
  }
}

