package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCheckoutOptions extends js.Object {
  var billingAddressCollection: js.UndefOr[billingAddressCollectionType] = js.undefined
  var cancelUrl: java.lang.String
  var clientReferenceId: js.UndefOr[java.lang.String] = js.undefined
  var customerEmail: js.UndefOr[java.lang.String] = js.undefined
  var items: js.Array[StripeCheckoutItem]
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
  var successUrl: java.lang.String
}

object StripeCheckoutOptions {
  @scala.inline
  def apply(
    cancelUrl: java.lang.String,
    items: js.Array[StripeCheckoutItem],
    successUrl: java.lang.String,
    billingAddressCollection: billingAddressCollectionType = null,
    clientReferenceId: java.lang.String = null,
    customerEmail: java.lang.String = null,
    locale: java.lang.String = null,
    sessionId: java.lang.String = null
  ): StripeCheckoutOptions = {
    val __obj = js.Dynamic.literal(cancelUrl = cancelUrl, items = items, successUrl = successUrl)
    if (billingAddressCollection != null) __obj.updateDynamic("billingAddressCollection")(billingAddressCollection)
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId)
    if (customerEmail != null) __obj.updateDynamic("customerEmail")(customerEmail)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    __obj.asInstanceOf[StripeCheckoutOptions]
  }
}

