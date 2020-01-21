package typings.reactStripeElements

import typings.stripeV3.stripe.Stripe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStripe extends js.Object {
  var stripe: Stripe | Null
}

object AnonStripe {
  @scala.inline
  def apply(stripe: Stripe = null): AnonStripe = {
    val __obj = js.Dynamic.literal()
    if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStripe]
  }
}

