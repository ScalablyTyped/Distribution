package typings.sipDotJs.libCoreMessagesMethodsAckMod

import typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingAckRequest extends js.Object {
  /** The incoming message. */
  val message: IncomingRequestMessage
}

object IncomingAckRequest {
  @scala.inline
  def apply(message: IncomingRequestMessage): IncomingAckRequest = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IncomingAckRequest]
  }
}

