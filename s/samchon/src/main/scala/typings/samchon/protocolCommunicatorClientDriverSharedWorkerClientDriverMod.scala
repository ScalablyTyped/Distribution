package typings.samchon

import typings.samchon.protocolCommunicatorCommunicatorSharedWorkerCommunicatorMod.SharedWorkerCommunicator
import typings.samchon.protocolInvokeIprotocolMod.IProtocol
import typings.std.MessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCommunicatorClientDriverSharedWorkerClientDriverMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.samchon.protocolInvokeIprotocolMod.IProtocol because Already inherited
  - typings.samchon.protocolCommunicatorIcommunicatorMod.ICommunicator because Already inherited
  - typings.samchon.protocolCommunicatorIclientdriverMod.IClientDriver because var conflicts: onClose. Inlined listen */ @JSImport("samchon/protocol/communicator/client_driver/SharedWorkerClientDriver", "SharedWorkerClientDriver")
  @js.native
  open class SharedWorkerClientDriver protected () extends SharedWorkerCommunicator {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: MessagePort) = this()
    
    /**
      * @inheritdoc
      */
    /**
      * Listen message from the newly connected client.
      *
      * Starts listening message from the newly connected client. Replied message from the connected client will be
      * converted to {@link Invoke} classes and shifted to the *listener*'s {@link IProtocol.replyData replyData()}
      * method.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def listen(listener: IProtocol): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var listening_ : Any = js.native
  }
}
