package typings.samchon

import typings.samchon.communicatorBaseMod.CommunicatorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/communicator/communicator/WebCommunicator", JSImport.Namespace)
@js.native
object webCommunicatorMod extends js.Object {
  
  @js.native
  abstract class WebCommunicator () extends CommunicatorBase {
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_close(): Unit = js.native
    
    /**
      * @hidden
      */
    var _Handle_message: js.Any = js.native
    
    /**
      * @hidden
      */
    var connection_ : js.Any = js.native
  }
}
