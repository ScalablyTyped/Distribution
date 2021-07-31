package typings.sipJs

import typings.sipJs.coreMod.IncomingRequestMessage
import typings.sipJs.methodsInfoMod.IncomingInfoRequest
import typings.sipJs.outgoingResponseMod.ResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infoMod {
  
  @JSImport("sip.js/lib/api/info", "Info")
  @js.native
  class Info protected () extends StObject {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    var incomingInfoRequest: js.Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming MESSAGE request message. */
    def request: IncomingRequestMessage = js.native
  }
}
