package typings.sipJs

import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/messages/methods/message", JSImport.Namespace)
@js.native
object methodsMessageMod extends js.Object {
  
  type IncomingMessageRequest = IncomingRequest
  
  type IncomingMessageResponse = IncomingResponse
  
  type OutgoingMessageRequest = OutgoingRequest
}
