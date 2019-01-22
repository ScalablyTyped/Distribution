package typings
package samchonLib.templatesParallelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "MediatorServer")
@js.native
class MediatorServer protected ()
  extends samchonLib.templatesParallelDerivedMediatorServerMod.MediatorServer {
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
    * @param port Port number of server to open.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem], port: scala.Double) = this()
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
    * @param port Port number of server to open.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[samchonLib.templatesParallelParallelSystemMod.ParallelSystem], port: scala.Double) = this()
}

