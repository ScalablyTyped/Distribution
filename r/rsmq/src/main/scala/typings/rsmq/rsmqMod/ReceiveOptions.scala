package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveOptions extends QueueIdentifier {
  var vt: js.UndefOr[Double] = js.undefined
}

object ReceiveOptions {
  @scala.inline
  def apply(qname: String, vt: Int | Double = null): ReceiveOptions = {
    val __obj = js.Dynamic.literal(qname = qname)
    if (vt != null) __obj.updateDynamic("vt")(vt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveOptions]
  }
}

