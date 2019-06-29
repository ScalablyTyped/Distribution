package typings
package stripeDashV3Lib.stripeNs.paymentMethodNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultibancoDetails extends js.Object {
  var entity: java.lang.String
  var reference: java.lang.String
}

object MultibancoDetails {
  @scala.inline
  def apply(entity: java.lang.String, reference: java.lang.String): MultibancoDetails = {
    val __obj = js.Dynamic.literal(entity = entity, reference = reference)
  
    __obj.asInstanceOf[MultibancoDetails]
  }
}

