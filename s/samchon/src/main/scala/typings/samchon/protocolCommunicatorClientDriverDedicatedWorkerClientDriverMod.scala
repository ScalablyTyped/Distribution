package typings.samchon

import typings.samchon.protocolCommunicatorCommunicatorDedicatedWorkerCommunicatorMod.DedicatedWorkerCommunicator
import typings.samchon.protocolInvokeIprotocolMod.IProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCommunicatorClientDriverDedicatedWorkerClientDriverMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.samchon.protocolInvokeIprotocolMod.IProtocol because Already inherited
  - typings.samchon.protocolCommunicatorIcommunicatorMod.ICommunicator because Already inherited
  - typings.samchon.protocolCommunicatorIclientdriverMod.IClientDriver because var conflicts: onClose. Inlined listen */ @JSImport("samchon/protocol/communicator/client_driver/DedicatedWorkerClientDriver", "DedicatedWorkerClientDriver")
  @js.native
  /**
    * Default Constructor.
    */
  open class DedicatedWorkerClientDriver () extends DedicatedWorkerCommunicator {
    
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
  }
}
