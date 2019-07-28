package typings.sipDotJs.libCoreMessagesIncomingDashResponseMod

import typings.sipDotJs.libCoreMessagesIncomingDashResponseDashMessageMod.IncomingResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingResponse extends js.Object {
  /** The incoming message. */
  val message: IncomingResponseMessage
}

object IncomingResponse {
  @scala.inline
  def apply(message: IncomingResponseMessage): IncomingResponse = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[IncomingResponse]
  }
}

