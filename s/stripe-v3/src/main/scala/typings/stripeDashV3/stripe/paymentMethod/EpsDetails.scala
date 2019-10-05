package typings.stripeDashV3.stripe.paymentMethod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EpsDetails extends js.Object {
  var verified_name: String
}

object EpsDetails {
  @scala.inline
  def apply(verified_name: String): EpsDetails = {
    val __obj = js.Dynamic.literal(verified_name = verified_name)
  
    __obj.asInstanceOf[EpsDetails]
  }
}

