package typings.sipJs

import typings.sipJs.incomingRequestMod.IncomingRequest
import typings.sipJs.incomingResponseMod.IncomingResponse
import typings.sipJs.outgoingRequestMod.OutgoingRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/messages/methods/refer", JSImport.Namespace)
@js.native
object referMod extends js.Object {
  
  type IncomingReferRequest = IncomingRequest
  
  type IncomingReferResponse = IncomingResponse
  
  type OutgoingReferRequest = OutgoingRequest
}
