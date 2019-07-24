package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeServerCheckoutOptions extends js.Object {
  var sessionId: java.lang.String
}

object StripeServerCheckoutOptions {
  @scala.inline
  def apply(sessionId: java.lang.String): StripeServerCheckoutOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId)
  
    __obj.asInstanceOf[StripeServerCheckoutOptions]
  }
}

