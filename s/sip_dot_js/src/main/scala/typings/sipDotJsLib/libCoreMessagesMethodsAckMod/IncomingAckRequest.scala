package typings
package sipDotJsLib.libCoreMessagesMethodsAckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingAckRequest extends js.Object {
  /** The incoming message. */
  val message: sipDotJsLib.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
}

object IncomingAckRequest {
  @scala.inline
  def apply(message: sipDotJsLib.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage): IncomingAckRequest = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[IncomingAckRequest]
  }
}

