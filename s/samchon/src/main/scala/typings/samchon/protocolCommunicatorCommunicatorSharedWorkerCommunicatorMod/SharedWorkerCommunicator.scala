package typings.samchon.protocolCommunicatorCommunicatorSharedWorkerCommunicatorMod

import typings.samchon.protocolCommunicatorCommunicatorUnderscoreCommunicatorBaseMod._CommunicatorBase
import typings.std.MessageEvent
import typings.std.MessagePort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/communicator/SharedWorkerCommunicator", "SharedWorkerCommunicator")
@js.native
abstract class SharedWorkerCommunicator () extends _CommunicatorBase {
  /**
    * @hidden
    */
  var port_ : MessagePort = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_message(event: MessageEvent): Unit = js.native
}

