package typings.samchon

import typings.samchon.protocolCommunicatorICommunicatorMod.ICommunicator
import typings.samchon.protocolInvokeIProtocolMod.IProtocol
import typings.samchon.protocolInvokeInvokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave/SlaveSystem", JSImport.Namespace)
@js.native
object templatesSlaveSlaveSystemMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem () extends IProtocol {
    var _Complete_process: js.Any = js.native
    /**
      * @hidden
      */
    var communicator_ : ICommunicator = js.native
    /**
      * @hidden
      */
    /* protected */ def _Reply_data(invoke: Invoke): Unit = js.native
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    /* CompleteClass */
    override def replyData(invoke: Invoke): Unit = js.native
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    /* CompleteClass */
    override def sendData(invoke: Invoke): Unit = js.native
  }
  
}

