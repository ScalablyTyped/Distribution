package typings.samchon

import typings.samchon.protocolCommunicatorCommunicatorCommunicatorBaseMod.CommunicatorBase
import typings.samchon.protocolInvokeIprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCommunicatorCommunicatorWebCommunicatorMod {
  
  /* note: abstract class */ @JSImport("samchon/protocol/communicator/communicator/WebCommunicator", "WebCommunicator")
  @js.native
  /**
    * Default Constructor.
    */
  open class WebCommunicator () extends CommunicatorBase {
    /**
      * Construct from *listener*.
      *
      * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_close(): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Handle_message: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var connection_ : Any = js.native
  }
}
