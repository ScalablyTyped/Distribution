package typings.rsmq.rsmqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueMessage extends js.Object {
  /**
  		 * Timestamp of when this message was first received.
  		 *
  		 * @type {number}
  		 * @memberof QueueMessage
  		 */
  var fr: Double
  /**
  		 * The internal message id.
  		 *
  		 * @type {string}
  		 * @memberof QueueMessage
  		 */
  var id: String
  /**
  		 * The message's contents.
  		 *
  		 * @type {string}
  		 * @memberof QueueMessage
  		 */
  var message: String
  /**
  		 * Number of times this message was received.
  		 *
  		 * @type {number}
  		 * @memberof QueueMessage
  		 */
  var rc: Double
  /**
  		 * Timestamp of when this message was sent / created.
  		 *
  		 * @type {number}
  		 * @memberof QueueMessage
  		 */
  var sent: Double
}

object QueueMessage {
  @scala.inline
  def apply(fr: Double, id: String, message: String, rc: Double, sent: Double): QueueMessage = {
    val __obj = js.Dynamic.literal(fr = fr.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], rc = rc.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueueMessage]
  }
}

