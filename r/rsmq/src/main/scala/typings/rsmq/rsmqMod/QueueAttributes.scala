package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueAttributes extends QueueIdentifier {
  var created: Double
  var delay: Double
  var hiddenmsgs: Double
  var maxsize: Double
  var modified: Double
  var msgs: Double
  var totalrecv: Double
  var totalsent: Double
  var vt: Double
}

object QueueAttributes {
  @scala.inline
  def apply(
    created: Double,
    delay: Double,
    hiddenmsgs: Double,
    maxsize: Double,
    modified: Double,
    msgs: Double,
    qname: String,
    totalrecv: Double,
    totalsent: Double,
    vt: Double
  ): QueueAttributes = {
    val __obj = js.Dynamic.literal(created = created, delay = delay, hiddenmsgs = hiddenmsgs, maxsize = maxsize, modified = modified, msgs = msgs, qname = qname, totalrecv = totalrecv, totalsent = totalsent, vt = vt)
  
    __obj.asInstanceOf[QueueAttributes]
  }
}

