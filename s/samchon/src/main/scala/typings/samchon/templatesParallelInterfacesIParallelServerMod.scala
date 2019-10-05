package typings.samchon

import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel/interfaces/IParallelServer", JSImport.Namespace)
@js.native
object templatesParallelInterfacesIParallelServerMod extends js.Object {
  @js.native
  trait IParallelServer extends ParallelSystem {
    /**
      * Connect to slave server.
      */
    def connect(): Unit = js.native
  }
  
}

