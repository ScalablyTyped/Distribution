package typings.stripeDashV3.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultibancoDetails extends js.Object {
  var entity: String
  var reference: String
}

object MultibancoDetails {
  @scala.inline
  def apply(entity: String, reference: String): MultibancoDetails = {
    val __obj = js.Dynamic.literal(entity = entity, reference = reference)
  
    __obj.asInstanceOf[MultibancoDetails]
  }
}

