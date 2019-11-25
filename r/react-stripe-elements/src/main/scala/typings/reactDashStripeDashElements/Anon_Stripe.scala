package typings.reactDashStripeDashElements

import typings.stripeDashV3.stripe.Stripe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Stripe extends js.Object {
  var stripe: Stripe | Null
}

object Anon_Stripe {
  @scala.inline
  def apply(stripe: Stripe = null): Anon_Stripe = {
    val __obj = js.Dynamic.literal()
    if (stripe != null) __obj.updateDynamic("stripe")(stripe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Stripe]
  }
}

