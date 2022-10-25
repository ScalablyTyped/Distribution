package typings.sipJs

import typings.sipJs.libCoreMessagesIncomingRequestMessageMod.IncomingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiCancelMod {
  
  @JSImport("sip.js/lib/api/cancel", "Cancel")
  @js.native
  open class Cancel protected () extends StObject {
    /** @internal */
    def this(incomingCancelRequest: IncomingRequestMessage) = this()
    
    /* private */ var incomingCancelRequest: Any = js.native
    
    /** Incoming CANCEL request message. */
    def request: IncomingRequestMessage = js.native
  }
}
