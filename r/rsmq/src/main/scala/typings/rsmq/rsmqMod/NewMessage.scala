package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewMessage extends QueueIdentifier {
  var delay: js.UndefOr[Double] = js.undefined
  var message: String
}

object NewMessage {
  @scala.inline
  def apply(message: String, qname: String, delay: Int | Double = null): NewMessage = {
    val __obj = js.Dynamic.literal(message = message, qname = qname)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewMessage]
  }
}

