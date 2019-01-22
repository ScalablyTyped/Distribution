package typings
package samchonLib.templatesParallelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/parallel", "MediatorClient")
@js.native
class MediatorClient protected ()
  extends samchonLib.templatesParallelDerivedMediatorClientMod.MediatorClient {
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
    * @param ip IP address to connect.
    * @param port Port number to connect.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator[samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem], ip: java.lang.String, port: scala.Double) = this()
  /**
    * Initializer Constructor.
    *
    * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
    * @param ip IP address to connect.
    * @param port Port number to connect.
    */
  def this(systemArray: samchonLib.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator[samchonLib.templatesParallelParallelSystemMod.ParallelSystem], ip: java.lang.String, port: scala.Double) = this()
}

