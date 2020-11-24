package typings.samchon

import typings.samchon.communicatorBaseMod.CommunicatorBase
import typings.std.MessageEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/communicator/communicator/DedicatedWorkerCommunicator", JSImport.Namespace)
@js.native
object dedicatedWorkerCommunicatorMod extends js.Object {
  
  @js.native
  abstract class DedicatedWorkerCommunicator () extends CommunicatorBase {
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_message(event: MessageEvent[_]): Unit = js.native
  }
}
