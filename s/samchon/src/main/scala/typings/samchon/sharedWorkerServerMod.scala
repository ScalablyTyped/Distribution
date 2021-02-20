package typings.samchon

import typings.samchon.iserverMod.IServer
import typings.samchon.sharedWorkerClientDriverMod.SharedWorkerClientDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedWorkerServerMod {
  
  @JSImport("samchon/protocol/server/SharedWorkerServer", "SharedWorkerServer")
  @js.native
  abstract class SharedWorkerServer () extends IServer {
    
    /**
      * @hidden
      */
    var _Handle_connect: js.Any = js.native
    
    /**
      * @inheritdoc
      */
    def addClient(driver: SharedWorkerClientDriver): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def open(): Unit = js.native
  }
}
