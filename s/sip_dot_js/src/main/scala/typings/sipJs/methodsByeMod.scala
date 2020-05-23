package typings.sipJs

import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/bye", JSImport.Namespace)
@js.native
object methodsByeMod extends js.Object {
  type IncomingByeRequest = IncomingRequest
  type IncomingByeResponse = IncomingResponse
  type OutgoingByeRequest = OutgoingRequest
}

