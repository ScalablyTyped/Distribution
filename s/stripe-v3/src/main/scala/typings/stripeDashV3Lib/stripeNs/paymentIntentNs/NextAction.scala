package typings
package stripeDashV3Lib.stripeNs.paymentIntentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextAction extends js.Object {
  var redirect_to_url: RedirectOptions
  var `type`: nextActionType
}

object NextAction {
  @scala.inline
  def apply(redirect_to_url: RedirectOptions, `type`: nextActionType): NextAction = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NextAction]
  }
}

