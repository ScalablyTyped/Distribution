package typings.stripeDashV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait P24Details extends js.Object {
  var reference: String
  var verified_name: String
}

object P24Details {
  @scala.inline
  def apply(reference: String, verified_name: String): P24Details = {
    val __obj = js.Dynamic.literal(reference = reference, verified_name = verified_name)
  
    __obj.asInstanceOf[P24Details]
  }
}

