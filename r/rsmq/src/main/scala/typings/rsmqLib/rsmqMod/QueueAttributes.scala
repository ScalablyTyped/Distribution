package typings
package rsmqLib.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueAttributes extends QueueIdentifier {
  var created: scala.Double
  var delay: scala.Double
  var hiddenmsgs: scala.Double
  var maxsize: scala.Double
  var modified: scala.Double
  var msgs: scala.Double
  var totalrecv: scala.Double
  var totalsent: scala.Double
  var vt: scala.Double
}

object QueueAttributes {
  @scala.inline
  def apply(
    created: scala.Double,
    delay: scala.Double,
    hiddenmsgs: scala.Double,
    maxsize: scala.Double,
    modified: scala.Double,
    msgs: scala.Double,
    qname: java.lang.String,
    totalrecv: scala.Double,
    totalsent: scala.Double,
    vt: scala.Double
  ): QueueAttributes = {
    val __obj = js.Dynamic.literal(created = created, delay = delay, hiddenmsgs = hiddenmsgs, maxsize = maxsize, modified = modified, msgs = msgs, qname = qname, totalrecv = totalrecv, totalsent = totalsent, vt = vt)
  
    __obj.asInstanceOf[QueueAttributes]
  }
}

