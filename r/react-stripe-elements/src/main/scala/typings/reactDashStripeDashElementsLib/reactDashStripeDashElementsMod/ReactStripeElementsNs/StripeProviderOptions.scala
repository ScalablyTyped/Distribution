package typings
package reactDashStripeDashElementsLib.reactDashStripeDashElementsMod.ReactStripeElementsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeProviderOptions extends js.Object {
  var stripeAccount: js.UndefOr[java.lang.String] = js.undefined
}

object StripeProviderOptions {
  @scala.inline
  def apply(stripeAccount: java.lang.String = null): StripeProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount)
    __obj.asInstanceOf[StripeProviderOptions]
  }
}

