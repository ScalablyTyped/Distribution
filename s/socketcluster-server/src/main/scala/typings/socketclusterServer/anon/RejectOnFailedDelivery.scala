package typings.socketclusterServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectOnFailedDelivery extends js.Object {
  var rejectOnFailedDelivery: Boolean
}

object RejectOnFailedDelivery {
  @scala.inline
  def apply(rejectOnFailedDelivery: Boolean): RejectOnFailedDelivery = {
    val __obj = js.Dynamic.literal(rejectOnFailedDelivery = rejectOnFailedDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectOnFailedDelivery]
  }
}

