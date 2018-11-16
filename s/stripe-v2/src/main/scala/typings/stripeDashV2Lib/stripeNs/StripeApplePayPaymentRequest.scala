package typings
package stripeDashV2Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StripeApplePayPaymentRequest extends js.Object {
  var billingContact: StripeApplePayPaymentContact
  var countryCode: java.lang.String
  var currencyCode: java.lang.String
  var lineItems: js.UndefOr[js.Array[StripeApplePayLineItem]] = js.undefined
  var requiredBillingContactFields: js.UndefOr[js.Array[StripeApplePayBillingContactField]] = js.undefined
  var requiredShippingContactFields: js.UndefOr[js.Array[StripeApplePayShippingContactField]] = js.undefined
  var shippingContact: js.UndefOr[StripeApplePayPaymentContact] = js.undefined
  var shippingMethods: js.UndefOr[js.Array[StripeApplePayShippingMethod]] = js.undefined
  var shippingType: js.UndefOr[js.Array[StripeApplePayShipping]] = js.undefined
  var total: StripeApplePayLineItem
}

