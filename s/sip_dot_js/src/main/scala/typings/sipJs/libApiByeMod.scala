package typings.sipJs

import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import typings.sipJs.libCoreMessagesMethodsByeMod.IncomingByeRequest
import typings.sipJs.libCoreMessagesOutgoingResponseMod.ResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiByeMod {
  
  @JSImport("sip.js/lib/api/bye", "Bye")
  @js.native
  open class Bye protected () extends StObject {
    /** @internal */
    def this(incomingByeRequest: IncomingByeRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /* private */ var incomingByeRequest: Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming BYE request message. */
    def request: IncomingRequestMessage = js.native
  }
}
