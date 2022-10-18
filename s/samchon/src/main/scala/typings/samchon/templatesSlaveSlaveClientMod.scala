package typings.samchon

import typings.samchon.protocolCommunicatorIserverconnectorMod.IServerConnector
import typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesSlaveSlaveClientMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/slave/SlaveClient", "SlaveClient")
  @js.native
  /**
    * Default Constructor.
    */
  open class SlaveClient () extends ISlaveClient {
    
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
