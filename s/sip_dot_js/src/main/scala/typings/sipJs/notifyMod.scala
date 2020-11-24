package typings.sipJs

import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/messages/methods/notify", JSImport.Namespace)
@js.native
object notifyMod extends js.Object {
  
  type IncomingNotifyRequest = IncomingRequest
  
  type IncomingNotifyResponse = IncomingResponse
  
  type OutgoingNotifyRequest = OutgoingRequest
}
