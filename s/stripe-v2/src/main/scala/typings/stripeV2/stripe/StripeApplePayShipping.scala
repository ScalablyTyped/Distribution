package typings.stripeV2.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV2.stripeV2Strings.shipping
  - typings.stripeV2.stripeV2Strings.delivery
  - typings.stripeV2.stripeV2Strings.storePickup
  - typings.stripeV2.stripeV2Strings.servicePickup
*/
trait StripeApplePayShipping extends js.Object

object StripeApplePayShipping {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delivery: typings.stripeV2.stripeV2Strings.delivery = this.cast("delivery")
  @scala.inline
  def servicePickup: typings.stripeV2.stripeV2Strings.servicePickup = this.cast("servicePickup")
  @scala.inline
  def shipping: typings.stripeV2.stripeV2Strings.shipping = this.cast("shipping")
  @scala.inline
  def storePickup: typings.stripeV2.stripeV2Strings.storePickup = this.cast("storePickup")
}

