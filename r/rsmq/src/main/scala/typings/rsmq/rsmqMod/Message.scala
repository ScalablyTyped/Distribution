package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends MessageIdentifier {
  var fr: Double
  var message: String
  var rc: Double
  var sent: Double
}

object Message {
  @scala.inline
  def apply(fr: Double, id: String, message: String, qname: String, rc: Double, sent: Double): Message = {
    val __obj = js.Dynamic.literal(fr = fr, id = id, message = message, qname = qname, rc = rc, sent = sent)
  
    __obj.asInstanceOf[Message]
  }
}

