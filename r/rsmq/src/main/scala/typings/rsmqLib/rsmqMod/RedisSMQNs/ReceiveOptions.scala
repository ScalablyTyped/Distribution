package typings
package rsmqLib.rsmqMod.RedisSMQNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveOptions extends QueueIdentifier {
  var vt: js.UndefOr[scala.Double] = js.undefined
}

object ReceiveOptions {
  @scala.inline
  def apply(qname: java.lang.String, vt: scala.Int | scala.Double = null): ReceiveOptions = {
    val __obj = js.Dynamic.literal(qname = qname)
    if (vt != null) __obj.updateDynamic("vt")(vt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveOptions]
  }
}

