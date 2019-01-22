package typings
package samchonLib.protocolCommunicatorClientUnderscoreDriverSharedWorkerClientDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver because var conflicts: onClose. Inlined listen */ @JSImport("samchon/protocol/communicator/client_driver/SharedWorkerClientDriver", "SharedWorkerClientDriver")
@js.native
class SharedWorkerClientDriver protected ()
  extends samchonLib.protocolCommunicatorCommunicatorSharedWorkerCommunicatorMod.SharedWorkerCommunicator {
  /**
    * Construct from a MessagePort object.
    */
  def this(port: stdLib.MessagePort) = this()
  /**
    * @hidden
    */
  var `listening_`: js.Any = js.native
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
  def listen(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol): scala.Unit = js.native
}

