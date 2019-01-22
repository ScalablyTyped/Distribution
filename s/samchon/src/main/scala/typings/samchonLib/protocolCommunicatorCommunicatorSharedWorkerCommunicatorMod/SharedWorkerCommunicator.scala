package typings
package samchonLib.protocolCommunicatorCommunicatorSharedWorkerCommunicatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/communicator/communicator/SharedWorkerCommunicator", "SharedWorkerCommunicator")
@js.native
abstract class SharedWorkerCommunicator ()
  extends samchonLib.protocolCommunicatorCommunicatorUnderscoreCommunicatorBaseMod._CommunicatorBase {
  /**
    * @hidden
    */
  var `port_`: stdLib.MessagePort = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_message(event: stdLib.MessageEvent): scala.Unit = js.native
}

