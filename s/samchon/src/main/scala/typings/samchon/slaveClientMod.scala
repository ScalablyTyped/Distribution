package typings.samchon

import typings.samchon.iserverconnectorMod.IServerConnector
import typings.samchon.slaveSystemMod.SlaveSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slaveClientMod {
  
  @JSImport("samchon/templates/slave/SlaveClient", "SlaveClient")
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
  
  @js.native
  trait ISlaveClient extends SlaveSystem {
    
    def connect(ip: String, port: Double): Unit = js.native
  }
}
