package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeOptions extends js.Object {
  var stripeAccount: js.UndefOr[java.lang.String] = js.undefined
}

object StripeOptions {
  @scala.inline
  def apply(stripeAccount: java.lang.String = null): StripeOptions = {
    val __obj = js.Dynamic.literal()
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount)
    __obj.asInstanceOf[StripeOptions]
  }
}

