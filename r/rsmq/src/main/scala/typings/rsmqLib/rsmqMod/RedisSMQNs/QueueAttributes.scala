package typings
package rsmqLib.rsmqMod.RedisSMQNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("hiddenmsgs")(hiddenmsgs)
    __obj.updateDynamic("maxsize")(maxsize)
    __obj.updateDynamic("modified")(modified)
    __obj.updateDynamic("msgs")(msgs)
    __obj.updateDynamic("qname")(qname)
    __obj.updateDynamic("totalrecv")(totalrecv)
    __obj.updateDynamic("totalsent")(totalsent)
    __obj.updateDynamic("vt")(vt)
    __obj.asInstanceOf[QueueAttributes]
  }
}

