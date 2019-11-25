package typings.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeProviderOptions extends js.Object {
  var stripeAccount: js.UndefOr[String] = js.undefined
}

object StripeProviderOptions {
  @scala.inline
  def apply(stripeAccount: String = null): StripeProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeProviderOptions]
  }
}

