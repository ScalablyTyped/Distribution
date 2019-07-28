package typings.stripeDashV3.stripeNs

import typings.stripeDashV3.Anon_Billingdetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmPaymentIntentOptions extends js.Object {
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details
    */
  var payment_method_data: js.UndefOr[Anon_Billingdetails] = js.undefined
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  /**
    * A return_url may be supplied if you are not planning to use
    * stripe.handleCardPayment to complete the payment. If you are
    * handling next actions yourself, pass in a return_url. If the
    * subsequent action is redirect_to_url, this URL will be used
    * on the return path for the redirect.
    */
  var return_url: js.UndefOr[String] = js.undefined
  /**
    * If the PaymentIntent is associated with a customer and this parameter
    * is set to true, the provided payment method will be attached to the
    * customer. Default is false.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.undefined
  /**
    * The shipping details for the payment, if collected. [Recommended]
    */
  var shipping: js.UndefOr[ShippingDetails] = js.undefined
}

object ConfirmPaymentIntentOptions {
  @scala.inline
  def apply(
    payment_method_data: Anon_Billingdetails = null,
    receipt_email: String = null,
    return_url: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    shipping: ShippingDetails = null
  ): ConfirmPaymentIntentOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (return_url != null) __obj.updateDynamic("return_url")(return_url)
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    __obj.asInstanceOf[ConfirmPaymentIntentOptions]
  }
}

