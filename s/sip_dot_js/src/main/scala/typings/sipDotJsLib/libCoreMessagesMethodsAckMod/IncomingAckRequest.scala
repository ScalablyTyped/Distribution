package typings
package sipDotJsLib.libCoreMessagesMethodsAckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingAckRequest extends js.Object {
  /** The incoming message. */
  val message: sipDotJsLib.libSIPMessageMod.IncomingRequest
}

object IncomingAckRequest {
  @scala.inline
  def apply(message: sipDotJsLib.libSIPMessageMod.IncomingRequest): IncomingAckRequest = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[IncomingAckRequest]
  }
}

