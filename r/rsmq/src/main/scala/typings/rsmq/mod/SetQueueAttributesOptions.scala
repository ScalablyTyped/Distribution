package typings.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetQueueAttributesOptions extends BaseOptions {
  /**
  		 * The time in seconds that the delivery of all new messages in the queue will be delayed.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof SetQueueAttributesOptions
  		 */
  var delay: js.UndefOr[Double] = js.undefined
  /**
  		 * The maximum message size in bytes.
  		 * Allowed values: 1024-65536 and -1 (for unlimited size)
  		 *
  		 * @type {number}
  		 * @memberof SetQueueAttributesOptions
  		 */
  var maxsize: js.UndefOr[Double] = js.undefined
  /**
  		 * The length of time, in seconds,
  		 * that a message received from a queue will be invisible to other receiving components
  		 * when they ask to receive messages.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof SetQueueAttributesOptions
  		 */
  var vt: js.UndefOr[Double] = js.undefined
}

object SetQueueAttributesOptions {
  @scala.inline
  def apply(qname: String, delay: Int | Double = null, maxsize: Int | Double = null, vt: Int | Double = null): SetQueueAttributesOptions = {
    val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (maxsize != null) __obj.updateDynamic("maxsize")(maxsize.asInstanceOf[js.Any])
    if (vt != null) __obj.updateDynamic("vt")(vt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetQueueAttributesOptions]
  }
}

