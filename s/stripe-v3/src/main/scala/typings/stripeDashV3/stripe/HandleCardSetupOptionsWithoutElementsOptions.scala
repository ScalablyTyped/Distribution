package typings.stripeDashV3.stripe

import typings.stripeDashV3.Anon_Billingdetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleCardSetupOptionsWithoutElementsOptions extends HandleCardPaymentOptions {
  /**
    * Only one of payment_method_data and payment_method is required.
    * Use payment_method to specify an existing PaymentMethod to use
    * for this payment.
    */
  var payment_method: js.UndefOr[String] = js.undefined
}

object HandleCardSetupOptionsWithoutElementsOptions {
  @scala.inline
  def apply(
    payment_method: String = null,
    payment_method_data: Anon_Billingdetails = null,
    receipt_email: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    shipping: ShippingDetails = null
  ): HandleCardSetupOptionsWithoutElementsOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data.asInstanceOf[js.Any])
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email.asInstanceOf[js.Any])
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleCardSetupOptionsWithoutElementsOptions]
  }
}

