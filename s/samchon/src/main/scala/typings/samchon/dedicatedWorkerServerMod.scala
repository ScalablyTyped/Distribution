package typings.samchon

import typings.samchon.dedicatedWorkerClientDriverMod.DedicatedWorkerClientDriver
import typings.samchon.iserverMod.IServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/server/DedicatedWorkerServer", JSImport.Namespace)
@js.native
object dedicatedWorkerServerMod extends js.Object {
  
  @js.native
  abstract class DedicatedWorkerServer () extends IServer {
    
    /**
      * @inheritdoc
      */
    def addClient(driver: DedicatedWorkerClientDriver): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def open(): Unit = js.native
  }
}
