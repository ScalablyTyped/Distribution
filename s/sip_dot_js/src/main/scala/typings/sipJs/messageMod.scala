package typings.sipJs

import typings.sipJs.coreMod.IncomingRequestMessage
import typings.sipJs.methodsMessageMod.IncomingMessageRequest
import typings.sipJs.outgoingResponseMod.ResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/api/message", JSImport.Namespace)
@js.native
object messageMod extends js.Object {
  
  @js.native
  class Message protected () extends js.Object {
    /** @internal */
    def this(incomingMessageRequest: IncomingMessageRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    var incomingMessageRequest: js.Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming MESSAGE request message. */
    def request: IncomingRequestMessage = js.native
  }
}
