package typings
package stripeDashV3Lib.stripeNs.setupIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupIntentNextActionUseStripeSdk extends js.Object {
  /**
    * Type of the next action to perform
    */
  var `type`: stripeDashV3Lib.stripeDashV3LibStrings.use_stripe_sdk
  /**
    * When confirming a SetupIntent with Stripe.js, Stripe.js depends on
    * the contents of this dictionary to invoke authentication flows. The
    * shape of the contents is subject to change and is only intended to
    * be used by Stripe.js.
    */
  var use_stripe_sdk: js.Any
}

object SetupIntentNextActionUseStripeSdk {
  @scala.inline
  def apply(`type`: stripeDashV3Lib.stripeDashV3LibStrings.use_stripe_sdk, use_stripe_sdk: js.Any): SetupIntentNextActionUseStripeSdk = {
    val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetupIntentNextActionUseStripeSdk]
  }
}

