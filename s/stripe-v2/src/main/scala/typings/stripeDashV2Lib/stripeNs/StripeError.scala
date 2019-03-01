package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeError extends js.Object {
  var code: java.lang.String
  var message: java.lang.String
  var param: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object StripeError {
  @scala.inline
  def apply(
    code: java.lang.String,
    message: java.lang.String,
    `type`: java.lang.String,
    param: java.lang.String = null
  ): StripeError = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("message")(message)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[StripeError]
  }
}

