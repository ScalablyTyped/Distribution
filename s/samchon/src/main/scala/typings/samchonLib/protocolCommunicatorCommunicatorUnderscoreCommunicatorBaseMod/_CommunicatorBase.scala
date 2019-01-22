package typings
package samchonLib.protocolCommunicatorCommunicatorUnderscoreCommunicatorBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/communicator/_CommunicatorBase", "_CommunicatorBase")
@js.native
/**
  * Default Constructor.
  */
abstract class _CommunicatorBase ()
  extends samchonLib.protocolCommunicatorICommunicatorMod.ICommunicator {
  /**
    * Construct from *listener*.
    *
    * @param listener An {@link IProtocol} object to listen {@link Invoke} messages.
    */
  def this(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol) = this()
  /**
    * @hidden
    */
  var `binary_invoke_`: js.Any = js.native
  /**
    * @hidden
    */
  var `binary_parameters_`: js.Any = js.native
  /**
    * @hidden
    */
  var `connected_`: scala.Boolean = js.native
  /**
    * @hidden
    */
  var `listener_`: samchonLib.protocolInvokeIProtocolMod.IProtocol = js.native
  /**
    * Callback function for connection closed.
    */
  /* CompleteClass */
  override var onClose: js.Function = js.native
  /**
    * @hidden
    */
  var `unhandled_invokes_`: js.Any = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_binary(binary: stdLib.Uint8Array): scala.Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_string(str: java.lang.String): scala.Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Is_binary_invoke(): scala.Boolean = js.native
  /**
    * Close connection.
    */
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /**
    * Test connection.
    *
    * Test whether this {@link ICommunicator communicator} object is connected with the remote system. If the
    * connection is alive, then returns ```true```. Otherwise, the connection is not alive or this
    * {@link ICommunicator communicator has not connected with the remote system yet, then returns ```false```.
    *
    * @return true if connected, otherwise false.
    */
  /* CompleteClass */
  override def isConnected(): scala.Boolean = js.native
  /**
    * Sending message.
    *
    * Sends message to related system or shifts the responsibility to chain.
    *
    * @param invoke Invoke message to send
    */
  /* CompleteClass */
  override def replyData(invoke: samchonLib.protocolInvokeInvokeMod.Invoke): scala.Unit = js.native
  /**
    * Handling replied message.
    *
    * Handles replied message or shifts the responsibility to chain.
    *
    * @param invoke An {@link Invoke} message has received.
    */
  /* CompleteClass */
  override def sendData(invoke: samchonLib.protocolInvokeInvokeMod.Invoke): scala.Unit = js.native
}

