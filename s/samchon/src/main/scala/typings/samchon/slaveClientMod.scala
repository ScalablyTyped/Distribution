package typings.samchon

import typings.samchon.iserverconnectorMod.IServerConnector
import typings.samchon.slaveSystemMod.SlaveSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/templates/slave/SlaveClient", JSImport.Namespace)
@js.native
object slaveClientMod extends js.Object {
  
  @js.native
  trait ISlaveClient extends SlaveSystem {
    
    def connect(ip: String, port: Double): Unit = js.native
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveClient () extends ISlaveClient {
    
    /**
      * @inheritdoc
      */
    /* protected */ def createServerConnector(): IServerConnector = js.native
  }
}
