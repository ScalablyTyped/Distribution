package typings.recurlyRecurlyJs.pricingMod

import typings.recurlyRecurlyJs.checkoutMod.CheckoutPricingInstance
import typings.recurlyRecurlyJs.subscriptionMod.SubscriptionPricingInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pricing extends js.Object {
  def Checkout(): CheckoutPricingInstance = js.native
  def Subscription(): SubscriptionPricingInstance = js.native
}

object Pricing {
  @scala.inline
  def apply(Checkout: () => CheckoutPricingInstance, Subscription: () => SubscriptionPricingInstance): Pricing = {
    val __obj = js.Dynamic.literal(Checkout = js.Any.fromFunction0(Checkout), Subscription = js.Any.fromFunction0(Subscription))
    __obj.asInstanceOf[Pricing]
  }
  @scala.inline
  implicit class PricingOps[Self <: Pricing] (val x: Self) extends AnyVal {
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
    def setCheckout(value: () => CheckoutPricingInstance): Self = this.set("Checkout", js.Any.fromFunction0(value))
    @scala.inline
    def setSubscription(value: () => SubscriptionPricingInstance): Self = this.set("Subscription", js.Any.fromFunction0(value))
  }
  
}

