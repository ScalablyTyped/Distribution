package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleCardPaymentWithoutElementsOptions extends HandleCardPaymentOptions {
  /**
    * Only one of payment_method_data and payment_method is required.
    * Use payment_method to specify an existing PaymentMethod to use
    * for this payment.
    */
  var payment_method: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details
    */
  @JSName("payment_method_data")
  var payment_method_data_HandleCardPaymentWithoutElementsOptions: js.UndefOr[stripeDashV3Lib.Anon_BillingdetailsCard] = js.undefined
}

object HandleCardPaymentWithoutElementsOptions {
  @scala.inline
  def apply(
    payment_method: java.lang.String = null,
    payment_method_data: stripeDashV3Lib.Anon_BillingdetailsCard = null,
    receipt_email: java.lang.String = null,
    save_payment_method: js.UndefOr[scala.Boolean] = js.undefined,
    shipping: ShippingDetails = null
  ): HandleCardPaymentWithoutElementsOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    __obj.asInstanceOf[HandleCardPaymentWithoutElementsOptions]
  }
}

