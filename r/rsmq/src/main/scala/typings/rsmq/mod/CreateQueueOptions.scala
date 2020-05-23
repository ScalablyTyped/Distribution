package typings.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateQueueOptions extends BaseOptions {
  /**
  		 * *(Default: 0)*
  		 * The time in seconds that the delivery of all new messages in the queue will be delayed.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof CreateQueueOptions
  		 */
  var delay: js.UndefOr[Double] = js.undefined
  /**
  		 * *(Default: 65536)*
  		 * The maximum message size in bytes.
  		 * Allowed values: 1024-65536 and -1 (for unlimited size)
  		 *
  		 * @type {number}
  		 * @memberof CreateQueueOptions
  		 */
  var maxsize: js.UndefOr[Double] = js.undefined
  /**
  		 * *(Default: 30)*
  		 * The length of time, in seconds, that a message received from a queue will
  		 * be invisible to other receiving components when they ask to receive messages.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof CreateQueueOptions
  		 */
  var vt: js.UndefOr[Double] = js.undefined
}

object CreateQueueOptions {
  @scala.inline
  def apply(
    qname: String,
    delay: js.UndefOr[Double] = js.undefined,
    maxsize: js.UndefOr[Double] = js.undefined,
    vt: js.UndefOr[Double] = js.undefined
  ): CreateQueueOptions = {
    val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxsize)) __obj.updateDynamic("maxsize")(maxsize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vt)) __obj.updateDynamic("vt")(vt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQueueOptions]
  }
}

