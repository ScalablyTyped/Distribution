package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentRequestEventMap extends js.Object {
  var shippingaddresschange: Event_
  var shippingoptionchange: Event_
}

object PaymentRequestEventMap {
  @scala.inline
  def apply(shippingaddresschange: Event_, shippingoptionchange: Event_): PaymentRequestEventMap = {
    val __obj = js.Dynamic.literal(shippingaddresschange = shippingaddresschange.asInstanceOf[js.Any], shippingoptionchange = shippingoptionchange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaymentRequestEventMap]
  }
}

