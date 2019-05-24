package typings
package sipDotJsLib.libCoreMessagesMethodsAckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingAckRequest extends js.Object {
  /** The outgoing message. */
  val message: sipDotJsLib.libSIPMessageMod.OutgoingRequest
}

object OutgoingAckRequest {
  @scala.inline
  def apply(message: sipDotJsLib.libSIPMessageMod.OutgoingRequest): OutgoingAckRequest = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[OutgoingAckRequest]
  }
}

