package typings.recurlyRecurlyJs.subscriptionMod

import typings.recurlyRecurlyJs.AnonBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPricingState extends js.Object {
  var price: AnonBase
}

object SubscriptionPricingState {
  @scala.inline
  def apply(price: AnonBase): SubscriptionPricingState = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionPricingState]
  }
}

