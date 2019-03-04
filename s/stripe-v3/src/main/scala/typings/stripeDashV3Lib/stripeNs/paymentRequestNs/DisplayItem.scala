package typings
package stripeDashV3Lib.stripeNs.paymentRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayItem extends js.Object {
  var amount: scala.Double
  var label: java.lang.String
  var pending: js.UndefOr[scala.Boolean] = js.undefined
}

object DisplayItem {
  @scala.inline
  def apply(amount: scala.Double, label: java.lang.String, pending: js.UndefOr[scala.Boolean] = js.undefined): DisplayItem = {
    val __obj = js.Dynamic.literal(amount = amount, label = label)
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[DisplayItem]
  }
}

