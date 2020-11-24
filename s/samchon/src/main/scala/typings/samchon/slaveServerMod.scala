package typings.samchon

import typings.samchon.iserverMod.IServer
import typings.samchon.slaveSystemMod.SlaveSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/slave/SlaveServer", JSImport.Namespace)
@js.native
object slaveServerMod extends js.Object {
  
  @js.native
  trait ISlaveServer
    extends SlaveSystem
       with IServer
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends SlaveSystem
       with IServer {
    
    /**
      * @inheritdoc
      */
    /* protected */ def createServerBase(): IServer = js.native
    
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
  }
}
