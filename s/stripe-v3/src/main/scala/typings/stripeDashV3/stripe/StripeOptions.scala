package typings.stripeDashV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeOptions extends js.Object {
  var betas: js.UndefOr[js.Array[String]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var stripeAccount: js.UndefOr[String] = js.undefined
}

object StripeOptions {
  @scala.inline
  def apply(betas: js.Array[String] = null, locale: String = null, stripeAccount: String = null): StripeOptions = {
    val __obj = js.Dynamic.literal()
    if (betas != null) __obj.updateDynamic("betas")(betas)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount)
    __obj.asInstanceOf[StripeOptions]
  }
}

