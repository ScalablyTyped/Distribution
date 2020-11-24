package typings.sipJs

import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/messages/methods/prack", JSImport.Namespace)
@js.native
object prackMod extends js.Object {
  
  type IncomingPrackRequest = IncomingRequest
  
  type IncomingPrackResponse = IncomingResponse
  
  type OutgoingPrackRequest = OutgoingRequest
}
