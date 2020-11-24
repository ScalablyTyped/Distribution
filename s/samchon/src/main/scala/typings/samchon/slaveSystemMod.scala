package typings.samchon

import typings.samchon.icommunicatorMod.ICommunicator
import typings.samchon.invokeMod.Invoke
import typings.samchon.iprotocolMod.IProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/slave/SlaveSystem", JSImport.Namespace)
@js.native
object slaveSystemMod extends js.Object {
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem () extends IProtocol {
    
    var _Complete_process: js.Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Reply_data(invoke: Invoke): Unit = js.native
    
    /**
      * @hidden
      */
    var communicator_ : ICommunicator = js.native
  }
}
