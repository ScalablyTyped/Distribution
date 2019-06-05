package typings
package sipDotJsLib.libCoreMessagesIncomingDashResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingResponse extends js.Object {
  /** The incoming message. */
  val message: sipDotJsLib.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
}

object IncomingResponse {
  @scala.inline
  def apply(message: sipDotJsLib.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage): IncomingResponse = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[IncomingResponse]
  }
}

