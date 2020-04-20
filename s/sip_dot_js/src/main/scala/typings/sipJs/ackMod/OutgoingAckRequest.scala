package typings.sipJs.ackMod

import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingAckRequest extends js.Object {
  /** The outgoing message. */
  val message: OutgoingRequestMessage
}

object OutgoingAckRequest {
  @scala.inline
  def apply(message: OutgoingRequestMessage): OutgoingAckRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutgoingAckRequest]
  }
}

