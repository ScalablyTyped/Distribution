package typings.recurlyRecurlyJs.checkoutMod

import typings.recurlyRecurlyJs.addressMod.Address
import typings.recurlyRecurlyJs.pricingMod.Tax
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckoutPricingMethods extends js.Object {
  def address(address: Address): CheckoutPricingPromise = js.native
  def adjustment(adjustment: Adjustment): CheckoutPricingPromise = js.native
  def coupon(coupon: String): CheckoutPricingPromise = js.native
  def currency(currency: String): CheckoutPricingPromise = js.native
  def giftCard(giftcard: String): CheckoutPricingPromise = js.native
  def shippingAddress(address: Address): CheckoutPricingPromise = js.native
  def subscription(subscriptionPricing: SubscriptionPricingState): CheckoutPricingPromise = js.native
  def tax(tax: Tax): CheckoutPricingPromise = js.native
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
  @scala.inline
  implicit class CheckoutPricingMethodsOps[Self <: CheckoutPricingMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: Address => CheckoutPricingPromise): Self = this.set("address", js.Any.fromFunction1(value))
    @scala.inline
    def setAdjustment(value: Adjustment => CheckoutPricingPromise): Self = this.set("adjustment", js.Any.fromFunction1(value))
    @scala.inline
    def setCoupon(value: String => CheckoutPricingPromise): Self = this.set("coupon", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrency(value: String => CheckoutPricingPromise): Self = this.set("currency", js.Any.fromFunction1(value))
    @scala.inline
    def setGiftCard(value: String => CheckoutPricingPromise): Self = this.set("giftCard", js.Any.fromFunction1(value))
    @scala.inline
    def setShippingAddress(value: Address => CheckoutPricingPromise): Self = this.set("shippingAddress", js.Any.fromFunction1(value))
    @scala.inline
    def setSubscription(value: SubscriptionPricingState => CheckoutPricingPromise): Self = this.set("subscription", js.Any.fromFunction1(value))
    @scala.inline
    def setTax(value: Tax => CheckoutPricingPromise): Self = this.set("tax", js.Any.fromFunction1(value))
  }
  
}

