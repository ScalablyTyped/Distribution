package typings.recurlyRecurlyJs.checkoutMod

import typings.recurlyRecurlyJs.addressMod.Address
import typings.recurlyRecurlyJs.pricingMod.Tax
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckoutPricingMethods extends js.Object {
  def address(address: Address): CheckoutPricingPromise
  def adjustment(adjustment: Adjustment): CheckoutPricingPromise
  def coupon(coupon: String): CheckoutPricingPromise
  def currency(currency: String): CheckoutPricingPromise
  def giftCard(giftcard: String): CheckoutPricingPromise
  def shippingAddress(address: Address): CheckoutPricingPromise
  def subscription(subscriptionPricing: SubscriptionPricingState): CheckoutPricingPromise
  def tax(tax: Tax): CheckoutPricingPromise
}

object CheckoutPricingMethods {
  @scala.inline
  def apply(
    address: Address => CheckoutPricingPromise,
    adjustment: Adjustment => CheckoutPricingPromise,
    coupon: String => CheckoutPricingPromise,
    currency: String => CheckoutPricingPromise,
    giftCard: String => CheckoutPricingPromise,
    shippingAddress: Address => CheckoutPricingPromise,
    subscription: SubscriptionPricingState => CheckoutPricingPromise,
    tax: Tax => CheckoutPricingPromise
  ): CheckoutPricingMethods = {
    val __obj = js.Dynamic.literal(address = js.Any.fromFunction1(address), adjustment = js.Any.fromFunction1(adjustment), coupon = js.Any.fromFunction1(coupon), currency = js.Any.fromFunction1(currency), giftCard = js.Any.fromFunction1(giftCard), shippingAddress = js.Any.fromFunction1(shippingAddress), subscription = js.Any.fromFunction1(subscription), tax = js.Any.fromFunction1(tax))
    __obj.asInstanceOf[CheckoutPricingMethods]
  }
}

