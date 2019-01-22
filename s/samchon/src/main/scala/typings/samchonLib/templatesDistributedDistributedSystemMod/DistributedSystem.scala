package typings
package samchonLib.templatesDistributedDistributedSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/DistributedSystem", "DistributedSystem")
@js.native
abstract class DistributedSystem protected ()
  extends samchonLib.templatesParallelParallelSystemMod.ParallelSystem {
  /**
    * Construct from parent {@link DistributedSystemArray}.
    *
    * @param systemArray The parent {@link DistributedSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[DistributedSystem]) = this()
  /**
    * Constrct from parent {@link DistributedSystemArray} and communicator.
    *
    * @param systemArray The parent {@link DistributedSystemArray} object.
    * @param communicator A communicator communicates with remote, the external system.
    */
  def this(systemArray: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[DistributedSystem], communicator: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver) = this()
  /**
    * @hidden
    */
  var _Compute_average_elapsed_time: js.Any = js.native
  /**
    * Get manager of this object.
    *
    * @return The parent {@link DistributedSystemArray} object.
    */
  @JSName("getSystemArray")
  def getSystemArray_SystemArrayDistributedSystemArraySystemArray[SystemArray /* <: samchonLib.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray[DistributedSystem] */](): SystemArray = js.native
}

