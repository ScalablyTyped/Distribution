package typings
package stripeDashV3Lib.stripeNs.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentIntentNextActionUseStripeSdk extends js.Object {
  /**
    * Type of the next action to perform
    */
  var `type`: stripeDashV3Lib.stripeDashV3LibStrings.use_stripe_sdk
  /**
    * When confirming a PaymentIntent with Stripe.js,
    * Stripe.js depends on the contents of this dictionary
    * to invoke authentication flows. The shape of the contents
    * is subject to change and is only intended to be used by Stripe.js.
    */
  var use_stripe_sdk: js.Any
}

object PaymentIntentNextActionUseStripeSdk {
  @scala.inline
  def apply(`type`: stripeDashV3Lib.stripeDashV3LibStrings.use_stripe_sdk, use_stripe_sdk: js.Any): PaymentIntentNextActionUseStripeSdk = {
    val __obj = js.Dynamic.literal(use_stripe_sdk = use_stripe_sdk)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PaymentIntentNextActionUseStripeSdk]
  }
}

