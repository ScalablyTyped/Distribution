package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeOptions extends js.Object {
  var betas: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var stripeAccount: js.UndefOr[java.lang.String] = js.undefined
}

object StripeOptions {
  @scala.inline
  def apply(betas: js.Array[java.lang.String] = null, stripeAccount: java.lang.String = null): StripeOptions = {
    val __obj = js.Dynamic.literal()
    if (betas != null) __obj.updateDynamic("betas")(betas)
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount)
    __obj.asInstanceOf[StripeOptions]
  }
}

