package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeClientCheckoutOptions extends js.Object {
  var billingAddressCollection: js.UndefOr[billingAddressCollectionType] = js.undefined
  var cancelUrl: java.lang.String
  var clientReferenceId: js.UndefOr[java.lang.String] = js.undefined
  var customerEmail: js.UndefOr[java.lang.String] = js.undefined
  var items: js.Array[StripeCheckoutItem]
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var successUrl: java.lang.String
}

object StripeClientCheckoutOptions {
  @scala.inline
  def apply(
    cancelUrl: java.lang.String,
    items: js.Array[StripeCheckoutItem],
    successUrl: java.lang.String,
    billingAddressCollection: billingAddressCollectionType = null,
    clientReferenceId: java.lang.String = null,
    customerEmail: java.lang.String = null,
    locale: java.lang.String = null
  ): StripeClientCheckoutOptions = {
    val __obj = js.Dynamic.literal(cancelUrl = cancelUrl, items = items, successUrl = successUrl)
    if (billingAddressCollection != null) __obj.updateDynamic("billingAddressCollection")(billingAddressCollection)
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId)
    if (customerEmail != null) __obj.updateDynamic("customerEmail")(customerEmail)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[StripeClientCheckoutOptions]
  }
}

