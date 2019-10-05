package typings.samchon

import typings.samchon.protocolCommunicatorIClientDriverMod.IClientDriver
import typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/DistributedSystem", JSImport.Namespace)
@js.native
object templatesDistributedDistributedSystemMod extends js.Object {
  @js.native
  abstract class DistributedSystem protected () extends ParallelSystem {
    /**
      * Construct from parent {@link DistributedSystemArray}.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      */
    def this(systemArray: DistributedSystemArray[DistributedSystem]) = this()
    /**
      * Constrct from parent {@link DistributedSystemArray} and communicator.
      *
      * @param systemArray The parent {@link DistributedSystemArray} object.
      * @param communicator A communicator communicates with remote, the external system.
      */
    def this(systemArray: DistributedSystemArray[DistributedSystem], communicator: IClientDriver) = this()
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
    def getSystemArray_SystemArray_DistributedSystemArrayDistributedSystem_SystemArray[SystemArray /* <: DistributedSystemArray[DistributedSystem] */](): SystemArray = js.native
  }
  
}

