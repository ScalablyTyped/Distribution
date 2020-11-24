package typings.sipJs

import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/messages/methods/cancel", JSImport.Namespace)
@js.native
object cancelMod extends js.Object {
  
  type IncomingCancelRequest = IncomingRequest
  
  type IncomingCancelResponse = IncomingResponse
  
  type OutgoingCancelRequest = OutgoingRequest
}
