package typings.samchon.templatesParallelMod

import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "MediatorServer")
@js.native
class MediatorServer protected ()
  extends typings.samchon.templatesParallelDerivedMediatorServerMod.MediatorServer {
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
    * @param port Port number of server to open.
    */
  def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], port: Double) = this()
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
    * @param port Port number of server to open.
    */
  def this(
    systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
    port: Double
  ) = this()
}

