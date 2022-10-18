package typings.samchon

import typings.samchon.protocolCommunicatorCommunicatorCommunicatorBaseMod.CommunicatorBase
import typings.samchon.protocolInvokeIprotocolMod.IProtocol
import typings.std.MessageEvent
import typings.std.MessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCommunicatorCommunicatorSharedWorkerCommunicatorMod {
  
  /* note: abstract class */ @JSImport("samchon/protocol/communicator/communicator/SharedWorkerCommunicator", "SharedWorkerCommunicator")
  @js.native
  /**
    * Default Constructor.
    */
  open class SharedWorkerCommunicator () extends CommunicatorBase {
    /**
      * Construct from *listener*.
      *
      * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_message(event: MessageEvent[Any]): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ var port_ : MessagePort = js.native
  }
}
