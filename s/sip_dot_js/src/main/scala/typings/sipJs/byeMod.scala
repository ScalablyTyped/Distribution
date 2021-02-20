package typings.sipJs

import typings.sipJs.coreMod.IncomingRequestMessage
import typings.sipJs.methodsByeMod.IncomingByeRequest
import typings.sipJs.outgoingResponseMod.ResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byeMod {
  
  @JSImport("sip.js/lib/api/bye", "Bye")
  @js.native
  class Bye protected () extends StObject {
    /** @internal */
    def this(incomingByeRequest: IncomingByeRequest) = this()
    
    /** Accept the request. */
    def accept(): js.Promise[Unit] = js.native
    def accept(options: ResponseOptions): js.Promise[Unit] = js.native
    
    var incomingByeRequest: js.Any = js.native
    
    /** Reject the request. */
    def reject(): js.Promise[Unit] = js.native
    def reject(options: ResponseOptions): js.Promise[Unit] = js.native
    
    /** Incoming BYE request message. */
    def request: IncomingRequestMessage = js.native
  }
}
