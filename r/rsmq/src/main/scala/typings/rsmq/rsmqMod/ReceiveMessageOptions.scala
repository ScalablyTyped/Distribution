package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiveMessageOptions extends BaseOptions {
  /**
  		 * *(Default: queue settings)*
  		 * The length of time, in seconds, that the received message will be invisible to others.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof ReceiveMessageOptions
  		 */
  var vt: js.UndefOr[Double] = js.undefined
}

object ReceiveMessageOptions {
  @scala.inline
  def apply(qname: String, vt: Int | Double = null): ReceiveMessageOptions = {
    val __obj = js.Dynamic.literal(qname = qname)
    if (vt != null) __obj.updateDynamic("vt")(vt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveMessageOptions]
  }
}

