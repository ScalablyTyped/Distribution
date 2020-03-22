package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginWithEmailParams extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var code: String
  var email: String
  var scope: js.UndefOr[String] = js.undefined
}

object LoginWithEmailParams {
  @scala.inline
  def apply(code: String, email: String, audience: String = null, scope: String = null): LoginWithEmailParams = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithEmailParams]
  }
}

