package typings.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeApplePayPaymentRequest extends js.Object {
  var billingContact: StripeApplePayPaymentContact
  var countryCode: String
  var currencyCode: String
  var lineItems: js.UndefOr[js.Array[StripeApplePayLineItem]] = js.undefined
  var requiredBillingContactFields: js.UndefOr[js.Array[StripeApplePayBillingContactField]] = js.undefined
  var requiredShippingContactFields: js.UndefOr[js.Array[StripeApplePayShippingContactField]] = js.undefined
  var shippingContact: js.UndefOr[StripeApplePayPaymentContact] = js.undefined
  var shippingMethods: js.UndefOr[js.Array[StripeApplePayShippingMethod]] = js.undefined
  var shippingType: js.UndefOr[js.Array[StripeApplePayShipping]] = js.undefined
  var total: StripeApplePayLineItem
}

object StripeApplePayPaymentRequest {
  @scala.inline
  def apply(
    billingContact: StripeApplePayPaymentContact,
    countryCode: String,
    currencyCode: String,
    total: StripeApplePayLineItem,
    lineItems: js.Array[StripeApplePayLineItem] = null,
    requiredBillingContactFields: js.Array[StripeApplePayBillingContactField] = null,
    requiredShippingContactFields: js.Array[StripeApplePayShippingContactField] = null,
    shippingContact: StripeApplePayPaymentContact = null,
    shippingMethods: js.Array[StripeApplePayShippingMethod] = null,
    shippingType: js.Array[StripeApplePayShipping] = null
  ): StripeApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(billingContact = billingContact.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (requiredBillingContactFields != null) __obj.updateDynamic("requiredBillingContactFields")(requiredBillingContactFields.asInstanceOf[js.Any])
    if (requiredShippingContactFields != null) __obj.updateDynamic("requiredShippingContactFields")(requiredShippingContactFields.asInstanceOf[js.Any])
    if (shippingContact != null) __obj.updateDynamic("shippingContact")(shippingContact.asInstanceOf[js.Any])
    if (shippingMethods != null) __obj.updateDynamic("shippingMethods")(shippingMethods.asInstanceOf[js.Any])
    if (shippingType != null) __obj.updateDynamic("shippingType")(shippingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeApplePayPaymentRequest]
  }
}

