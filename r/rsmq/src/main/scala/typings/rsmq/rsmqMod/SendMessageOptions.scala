package typings.rsmq.rsmqMod

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
  def apply(message: String, qname: String, delay: Int | Double = null): SendMessageOptions = {
    val __obj = js.Dynamic.literal(message = message, qname = qname)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageOptions]
  }
}

