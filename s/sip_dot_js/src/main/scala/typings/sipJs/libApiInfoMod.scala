package typings.sipJs

import typings.sipJs.libCoreMessagesMethodsInfoMod.IncomingInfoRequest
import typings.sipJs.libCoreMessagesOutgoingResponseMod.ResponseOptions
import typings.sipJs.libCoreMod.IncomingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiInfoMod {
  
  @JSImport("sip.js/lib/api/info", "Info")
  @js.native
  open class Info protected () extends StObject {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /* private */ var incomingInfoRequest: Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming MESSAGE request message. */
    def request: IncomingRequestMessage = js.native
  }
}
