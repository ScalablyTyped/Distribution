package typings
package rsmqLib.rsmqMod.RedisSMQNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewMessage extends QueueIdentifier {
  var delay: js.UndefOr[scala.Double] = js.undefined
  var message: java.lang.String
}

object NewMessage {
  @scala.inline
  def apply(message: java.lang.String, qname: java.lang.String, delay: scala.Int | scala.Double = null): NewMessage = {
    val __obj = js.Dynamic.literal(message = message, qname = qname)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewMessage]
  }
}

