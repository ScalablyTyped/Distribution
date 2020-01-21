package typings.sipJs

import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/register", JSImport.Namespace)
@js.native
object registerMod extends js.Object {
  type IncomingRegisterRequest = IncomingRequest
  type IncomingRegisterResponse = IncomingResponse
  type OutgoingRegisterRequest = OutgoingRequest
}

