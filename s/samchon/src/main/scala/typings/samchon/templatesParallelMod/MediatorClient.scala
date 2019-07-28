package typings.samchon.templatesParallelMod

import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "MediatorClient")
@js.native
class MediatorClient protected ()
  extends typings.samchon.templatesParallelDerivedMediatorClientMod.MediatorClient {
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
    * @param ip IP address to connect.
    * @param port Port number to connect.
    */
  def this(systemArray: DistributedSystemArrayMediator[DistributedSystem], ip: String, port: Double) = this()
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
    * @param ip IP address to connect.
    * @param port Port number to connect.
    */
  def this(
    systemArray: typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[typings.samchon.templatesParallelParallelSystemMod.ParallelSystem],
    ip: String,
    port: Double
  ) = this()
}

