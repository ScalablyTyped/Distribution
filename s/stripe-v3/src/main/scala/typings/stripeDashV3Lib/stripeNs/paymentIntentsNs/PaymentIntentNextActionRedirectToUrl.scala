package typings
package stripeDashV3Lib.stripeNs.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentIntentNextActionRedirectToUrl extends js.Object {
  /**
    * Contains instructions for authenticating a payment by
    * redirecting your customer to another page or application.
    */
  var redirect_to_url: stripeDashV3Lib.Anon_ReturnurlUrl
  /**
    * Type of the next action to perform
    */
  var `type`: stripeDashV3Lib.stripeDashV3LibStrings.redirect_to_url
}

object PaymentIntentNextActionRedirectToUrl {
  @scala.inline
  def apply(
    redirect_to_url: stripeDashV3Lib.Anon_ReturnurlUrl,
    `type`: stripeDashV3Lib.stripeDashV3LibStrings.redirect_to_url
  ): PaymentIntentNextActionRedirectToUrl = {
    val __obj = js.Dynamic.literal(redirect_to_url = redirect_to_url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PaymentIntentNextActionRedirectToUrl]
  }
}

