package typings.stripeDashV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeError extends js.Object {
  var code: String
  var message: String
  var param: js.UndefOr[String] = js.undefined
  var `type`: String
}

object StripeError {
  @scala.inline
  def apply(code: String, message: String, `type`: String, param: String = null): StripeError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeError]
  }
}

