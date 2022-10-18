package typings.sipJs

import typings.sipJs.libCoreMessagesMethodsAckMod.IncomingAckRequest
import typings.sipJs.libCoreMod.IncomingRequestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiAckMod {
  
  @JSImport("sip.js/lib/api/ack", "Ack")
  @js.native
  open class Ack protected () extends StObject {
    /** @internal */
    def this(incomingAckRequest: IncomingAckRequest) = this()
    
    /* private */ var incomingAckRequest: Any = js.native
    
    /** Incoming ACK request message. */
    def request: IncomingRequestMessage = js.native
  }
}
