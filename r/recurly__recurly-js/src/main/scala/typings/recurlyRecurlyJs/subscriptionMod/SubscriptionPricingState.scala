package typings.recurlyRecurlyJs.subscriptionMod

import typings.recurlyRecurlyJs.anon.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionPricingState extends js.Object {
  var price: Base
}

object SubscriptionPricingState {
  @scala.inline
  def apply(price: Base): SubscriptionPricingState = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionPricingState]
  }
}

