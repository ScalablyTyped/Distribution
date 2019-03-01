package typings
package reactDashStripeDashElementsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKeyStripe extends js.Object {
  var apiKey: js.UndefOr[scala.Nothing] = js.undefined
  var stripe: stripeDashV3Lib.stripeNs.Stripe | scala.Null
}

object Anon_ApiKeyStripe {
  @scala.inline
  def apply(apiKey: js.UndefOr[scala.Nothing] = js.undefined, stripe: stripeDashV3Lib.stripeNs.Stripe = null): Anon_ApiKeyStripe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apiKey)) __obj.updateDynamic("apiKey")(apiKey)
    if (stripe != null) __obj.updateDynamic("stripe")(stripe)
    __obj.asInstanceOf[Anon_ApiKeyStripe]
  }
}

