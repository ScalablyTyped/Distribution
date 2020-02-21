package typings.socketclusterServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRejectOnFailedDelivery extends js.Object {
  var rejectOnFailedDelivery: Boolean
}

object AnonRejectOnFailedDelivery {
  @scala.inline
  def apply(rejectOnFailedDelivery: Boolean): AnonRejectOnFailedDelivery = {
    val __obj = js.Dynamic.literal(rejectOnFailedDelivery = rejectOnFailedDelivery.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRejectOnFailedDelivery]
  }
}

