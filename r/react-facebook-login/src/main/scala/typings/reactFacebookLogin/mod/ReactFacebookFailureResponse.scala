package typings.reactFacebookLogin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFacebookFailureResponse extends js.Object {
  var status: js.UndefOr[String] = js.undefined
}

object ReactFacebookFailureResponse {
  @scala.inline
  def apply(status: String = null): ReactFacebookFailureResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactFacebookFailureResponse]
  }
}

