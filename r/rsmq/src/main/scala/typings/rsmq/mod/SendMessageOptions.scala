package typings.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMessageOptions extends BaseOptions {
  /**
  		 * *(Default: queue settings)*
  		 * The time in seconds that the delivery of the message will be delayed.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof SendMessageOptions
  		 */
  var delay: js.UndefOr[Double] = js.undefined
  /**
  		 * Message for the queue
  		 *
  		 * @type {string}
  		 * @memberof SendMessageOptions
  		 */
  var message: String
}

object SendMessageOptions {
  @scala.inline
  def apply(message: String, qname: String, delay: js.UndefOr[Double] = js.undefined): SendMessageOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], qname = qname.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageOptions]
  }
}

