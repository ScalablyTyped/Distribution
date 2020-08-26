package typings.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueMessage extends js.Object {
  /**
  		 * Timestamp of when this message was first received.
  		 *
  		 * @type {number}
  		 * @memberof QueueMessage
  		 */
  var fr: Double = js.native
  /**
  		 * The internal message id.
  		 *
  		 * @type {string}
  		 * @memberof QueueMessage
  		 */
  var id: String = js.native
  /**
  		 * The message's contents.
  		 *
  		 * @type {string}
  		 * @memberof QueueMessage
  		 */
  var message: String = js.native
  /**
  		 * Number of times this message was received.
  		 *
  		 * @type {number}
  		 * @memberof QueueMessage
  		 */
  var rc: Double = js.native
  /**
  		 * Timestamp of when this message was sent / created.
  		 *
  		 * @type {number}
  		 * @memberof QueueMessage
  		 */
  var sent: Double = js.native
}

object QueueMessage {
  @scala.inline
  def apply(fr: Double, id: String, message: String, rc: Double, sent: Double): QueueMessage = {
    val __obj = js.Dynamic.literal(fr = fr.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], rc = rc.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueMessage]
  }
  @scala.inline
  implicit class QueueMessageOps[Self <: QueueMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFr(value: Double): Self = this.set("fr", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setRc(value: Double): Self = this.set("rc", value.asInstanceOf[js.Any])
    @scala.inline
    def setSent(value: Double): Self = this.set("sent", value.asInstanceOf[js.Any])
  }
  
}

