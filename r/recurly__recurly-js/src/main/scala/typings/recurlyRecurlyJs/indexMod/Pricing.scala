package typings.recurlyRecurlyJs.indexMod

import typings.recurlyRecurlyJs.checkoutMod.CheckoutPricingInstance
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pricing extends js.Object {
  def Checkout(): CheckoutPricingInstance
  def Subscription(): SubscriptionPricingInstance
}

object Pricing {
  @scala.inline
  def apply(Checkout: () => CheckoutPricingInstance, Subscription: () => SubscriptionPricingInstance): Pricing = {
    val __obj = js.Dynamic.literal(Checkout = js.Any.fromFunction0(Checkout), Subscription = js.Any.fromFunction0(Subscription))
  
    __obj.asInstanceOf[Pricing]
  }
}

