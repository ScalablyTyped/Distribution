package typings.recurlyRecurlyJs.checkoutMod

import typings.recurlyRecurlyJs.mod.Address
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
  def subscription(): CheckoutPricingPromise = js.native
  def subscription(subscriptionPricing: SubscriptionPricingState): CheckoutPricingPromise = js.native
  def tax(tax: Tax): CheckoutPricingPromise = js.native
}

