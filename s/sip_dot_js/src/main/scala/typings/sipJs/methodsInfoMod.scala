package typings.sipJs

import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/methods/info", JSImport.Namespace)
@js.native
object methodsInfoMod extends js.Object {
  type IncomingInfoRequest = IncomingRequest
  type IncomingInfoResponse = IncomingResponse
  type OutgoingInfoRequest = OutgoingRequest
}

