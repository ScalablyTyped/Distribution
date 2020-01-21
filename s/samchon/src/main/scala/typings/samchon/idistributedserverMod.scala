package typings.samchon

import typings.samchon.distributedSystemMod.DistributedSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/interfaces/IDistributedServer", JSImport.Namespace)
@js.native
object idistributedserverMod extends js.Object {
  @js.native
  trait IDistributedServer extends DistributedSystem {
    /**
      * Connect to external server.
      */
    def connect(): Unit = js.native
  }
  
}

