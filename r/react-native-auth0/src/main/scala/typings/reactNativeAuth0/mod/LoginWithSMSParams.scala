package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginWithSMSParams extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var code: String
  var phoneNumber: String
  var scope: js.UndefOr[String] = js.undefined
}

object LoginWithSMSParams {
  @scala.inline
  def apply(code: String, phoneNumber: String, audience: String = null, scope: String = null): LoginWithSMSParams = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginWithSMSParams]
  }
}

