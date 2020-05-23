package typings.rsmq.mod

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
  def apply(qname: String, vt: js.UndefOr[Double] = js.undefined): ReceiveMessageOptions = {
    val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
    if (!js.isUndefined(vt)) __obj.updateDynamic("vt")(vt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveMessageOptions]
  }
}

