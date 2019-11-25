package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueAttributes extends js.Object {
  /**
  		 * Timestamp (epoch in seconds) when the queue was created
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var created: Double
  /**
  		 * The delay for new messages in seconds
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var delay: Double
  /**
  		 * Current number of hidden / not visible messages.
  		 * A message can be hidden while "in flight" due to a `vt` parameter or when sent with a `delay`
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var hiddenmsgs: Double
  /**
  		 * The maximum size of a message in bytes
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var maxsize: Double
  /**
  		 * Timestamp (epoch in seconds) when the queue was last modified with `setQueueAttributes`
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var modified: Double
  /**
  		 * Current number of messages in the queue
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var msgs: Double
  /**
  		 * Total number of messages received from the queue
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var totalrecv: Double
  /**
  		 * Total number of messages sent to the queue
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var totalsent: Double
  /**
  		 * The visibility timeout for the queue in seconds
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var vt: Double
}

object QueueAttributes {
  @scala.inline
  def apply(
    created: Double,
    delay: Double,
    hiddenmsgs: Double,
    maxsize: Double,
    modified: Double,
    msgs: Double,
    totalrecv: Double,
    totalsent: Double,
    vt: Double
  ): QueueAttributes = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], hiddenmsgs = hiddenmsgs.asInstanceOf[js.Any], maxsize = maxsize.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], msgs = msgs.asInstanceOf[js.Any], totalrecv = totalrecv.asInstanceOf[js.Any], totalsent = totalsent.asInstanceOf[js.Any], vt = vt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueueAttributes]
  }
}

