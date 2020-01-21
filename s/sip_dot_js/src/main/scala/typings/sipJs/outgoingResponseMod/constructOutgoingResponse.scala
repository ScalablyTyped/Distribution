package typings.sipJs.outgoingResponseMod

import typings.sipJs.incomingRequestMessageMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/outgoing-response", "constructOutgoingResponse")
@js.native
object constructOutgoingResponse extends js.Object {
  def apply(message: IncomingRequestMessage, options: ResponseOptions): OutgoingResponse = js.native
}

