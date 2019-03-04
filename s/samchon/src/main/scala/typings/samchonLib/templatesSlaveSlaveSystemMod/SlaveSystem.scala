package typings
package samchonLib.templatesSlaveSlaveSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave/SlaveSystem", "SlaveSystem")
@js.native
/**
  * Default Constructor.
  */
abstract class SlaveSystem ()
  extends samchonLib.protocolInvokeIProtocolMod.IProtocol {
  var _Complete_process: js.Any = js.native
  /**
    * @hidden
    */
  var communicator_ : samchonLib.protocolCommunicatorICommunicatorMod.ICommunicator = js.native
  /**
    * @hidden
    */
  /* protected */ def _Reply_data(invoke: samchonLib.protocolInvokeInvokeMod.Invoke): scala.Unit = js.native
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

