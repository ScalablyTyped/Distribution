package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeClientCheckoutOptions extends js.Object {
  var billingAddressCollection: js.UndefOr[billingAddressCollectionType] = js.undefined
  var cancelUrl: String
  var clientReferenceId: js.UndefOr[String] = js.undefined
  var customerEmail: js.UndefOr[String] = js.undefined
  var items: js.Array[StripeCheckoutItem]
  var locale: js.UndefOr[String] = js.undefined
  var successUrl: String
}

object StripeClientCheckoutOptions {
  @scala.inline
  def apply(
    cancelUrl: String,
    items: js.Array[StripeCheckoutItem],
    successUrl: String,
    billingAddressCollection: billingAddressCollectionType = null,
    clientReferenceId: String = null,
    customerEmail: String = null,
    locale: String = null
  ): StripeClientCheckoutOptions = {
    val __obj = js.Dynamic.literal(cancelUrl = cancelUrl, items = items, successUrl = successUrl)
    if (billingAddressCollection != null) __obj.updateDynamic("billingAddressCollection")(billingAddressCollection)
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId)
    if (customerEmail != null) __obj.updateDynamic("customerEmail")(customerEmail)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[StripeClientCheckoutOptions]
  }
}

