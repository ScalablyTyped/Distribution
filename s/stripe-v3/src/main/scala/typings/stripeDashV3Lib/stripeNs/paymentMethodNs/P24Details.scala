package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait P24Details extends js.Object {
  var reference: java.lang.String
  var verified_name: java.lang.String
}

object P24Details {
  @scala.inline
  def apply(reference: java.lang.String, verified_name: java.lang.String): P24Details = {
    val __obj = js.Dynamic.literal(reference = reference, verified_name = verified_name)
  
    __obj.asInstanceOf[P24Details]
  }
}

