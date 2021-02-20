package typings.samchon

import typings.samchon.iserverMod.IServer
import typings.samchon.slaveSystemMod.SlaveSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slaveServerMod {
  
  @JSImport("samchon/templates/slave/SlaveServer", "SlaveServer")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer () extends ISlaveServer {
    
    /**
      * @inheritdoc
      */
    /* protected */ def createServerBase(): IServer = js.native
    
    /**
      * @hidden
      */
    var server_base_ : js.Any = js.native
  }
  
  @js.native
  trait ISlaveServer
    extends SlaveSystem
       with IServer
}
