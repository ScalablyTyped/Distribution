package typings
package stripeDashV3Lib.stripeNs.paymentIntentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentIntentConfirmationData extends CardPaymentData {
  var return_url: js.UndefOr[java.lang.String] = js.undefined
}

object PaymentIntentConfirmationData {
  @scala.inline
  def apply(
    payment_method: java.lang.String = null,
    payment_method_data: PaymentMethodData = null,
    receipt_email: java.lang.String = null,
    return_url: java.lang.String = null,
    save_payment_method: js.UndefOr[scala.Boolean] = js.undefined,
    shipping: ShippingInformation = null
  ): PaymentIntentConfirmationData = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (return_url != null) __obj.updateDynamic("return_url")(return_url)
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    __obj.asInstanceOf[PaymentIntentConfirmationData]
  }
}

