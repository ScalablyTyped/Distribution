package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var charge: java.lang.String
  var code: js.UndefOr[java.lang.String] = js.undefined
  var decline_code: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var param: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Error {
  @scala.inline
  def apply(
    charge: java.lang.String,
    `type`: java.lang.String,
    code: java.lang.String = null,
    decline_code: java.lang.String = null,
    message: java.lang.String = null,
    param: java.lang.String = null
  ): Error = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("charge")(charge)
    if (code != null) __obj.updateDynamic("code")(code)
    if (decline_code != null) __obj.updateDynamic("decline_code")(decline_code)
    if (message != null) __obj.updateDynamic("message")(message)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[Error]
  }
}

