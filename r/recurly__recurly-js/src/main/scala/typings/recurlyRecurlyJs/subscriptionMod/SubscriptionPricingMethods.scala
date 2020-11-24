package typings.recurlyRecurlyJs.subscriptionMod

import typings.recurlyRecurlyJs.addressMod.Address
import typings.recurlyRecurlyJs.pricingMod.Tax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionPricingMethods extends js.Object {
  
  def addon(addonCode: String): SubscriptionPricingPromise = js.native
  def addon(addonCode: String, addonOptions: AddonOptions): SubscriptionPricingPromise = js.native
  
  def address(address: Address): SubscriptionPricingPromise = js.native
  
  def coupon(coupon: String): SubscriptionPricingPromise = js.native
  
  def currency(currency: String): SubscriptionPricingPromise = js.native
  
  def giftcard(giftcard: String): SubscriptionPricingPromise = js.native
  
  def plan(plan: String): SubscriptionPricingPromise = js.native
  def plan(plan: String, planOptions: PlanOptions): SubscriptionPricingPromise = js.native
  
  def shippingAddress(address: Address): SubscriptionPricingPromise = js.native
  
  def tax(tax: Tax): SubscriptionPricingPromise = js.native
}
