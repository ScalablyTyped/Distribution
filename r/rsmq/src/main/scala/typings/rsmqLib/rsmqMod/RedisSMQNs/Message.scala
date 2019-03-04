package typings
package rsmqLib.rsmqMod.RedisSMQNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends MessageIdentifier {
  var fr: scala.Double
  var message: java.lang.String
  var rc: scala.Double
  var sent: scala.Double
}

object Message {
  @scala.inline
  def apply(
    fr: scala.Double,
    id: java.lang.String,
    message: java.lang.String,
    qname: java.lang.String,
    rc: scala.Double,
    sent: scala.Double
  ): Message = {
    val __obj = js.Dynamic.literal(fr = fr, id = id, message = message, qname = qname, rc = rc, sent = sent)
  
    __obj.asInstanceOf[Message]
  }
}

