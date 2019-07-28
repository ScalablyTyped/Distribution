package typings.stripeDashV3.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeServerCheckoutOptions extends js.Object {
  var sessionId: String
}

object StripeServerCheckoutOptions {
  @scala.inline
  def apply(sessionId: String): StripeServerCheckoutOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId)
  
    __obj.asInstanceOf[StripeServerCheckoutOptions]
  }
}

