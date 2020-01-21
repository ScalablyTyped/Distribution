package typings.reactFacebookLogin.mod

import typings.reactFacebookLogin.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFacebookLoginInfo extends js.Object {
  var accessToken: String
  var email: js.UndefOr[String] = js.undefined
  var id: String
  var name: js.UndefOr[String] = js.undefined
  var picture: js.UndefOr[AnonData] = js.undefined
}

object ReactFacebookLoginInfo {
  @scala.inline
  def apply(
    accessToken: String,
    id: String,
    email: String = null,
    name: String = null,
    picture: AnonData = null
  ): ReactFacebookLoginInfo = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (picture != null) __obj.updateDynamic("picture")(picture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactFacebookLoginInfo]
  }
}

