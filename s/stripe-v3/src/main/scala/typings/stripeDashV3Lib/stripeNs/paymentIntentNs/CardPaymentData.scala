package typings
package stripeDashV3Lib.stripeNs.paymentIntentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardPaymentData extends js.Object {
  var payment_method: js.UndefOr[java.lang.String] = js.undefined
  var payment_method_data: js.UndefOr[PaymentMethodData] = js.undefined
  var receipt_email: js.UndefOr[java.lang.String] = js.undefined
  var save_payment_method: js.UndefOr[scala.Boolean] = js.undefined
  var shipping: js.UndefOr[ShippingInformation] = js.undefined
}

object CardPaymentData {
  @scala.inline
  def apply(
    payment_method: java.lang.String = null,
    payment_method_data: PaymentMethodData = null,
    receipt_email: java.lang.String = null,
    save_payment_method: js.UndefOr[scala.Boolean] = js.undefined,
    shipping: ShippingInformation = null
  ): CardPaymentData = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    __obj.asInstanceOf[CardPaymentData]
  }
}

