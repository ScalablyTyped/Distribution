package typings.samchon

import typings.samchon.communicatorBaseMod.CommunicatorBase
import typings.samchon.iprotocolMod.IProtocol
import typings.std.MessageEvent
import typings.std.MessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedWorkerCommunicatorMod {
  
  @JSImport("samchon/protocol/communicator/communicator/SharedWorkerCommunicator", "SharedWorkerCommunicator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SharedWorkerCommunicator () extends CommunicatorBase {
    /**
      * Construct from *listener*.
      *
      * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
      */
    def this(listener: IProtocol) = this()
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_message(event: MessageEvent[_]): Unit = js.native
    
    /**
      * @hidden
      */
    var port_ : MessagePort = js.native
  }
}
