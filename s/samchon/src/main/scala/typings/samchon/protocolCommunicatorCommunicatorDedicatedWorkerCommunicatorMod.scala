package typings.samchon

import typings.samchon.protocolCommunicatorCommunicatorUnderscoreCommunicatorBaseMod._CommunicatorBase
import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/communicator/DedicatedWorkerCommunicator", JSImport.Namespace)
@js.native
object protocolCommunicatorCommunicatorDedicatedWorkerCommunicatorMod extends js.Object {
  @js.native
  abstract class DedicatedWorkerCommunicator () extends _CommunicatorBase {
    /**
      * @hidden
      */
    /* protected */ def _Handle_message(event: MessageEvent): Unit = js.native
  }
  
}

