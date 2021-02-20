package typings.samchon

import typings.samchon.distributedSystemArrayMod.DistributedSystemArray
import typings.samchon.iclientdriverMod.IClientDriver
import typings.samchon.parallelSystemMod.ParallelSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributedSystemMod {
  
  @JSImport("samchon/templates/distributed/DistributedSystem", "DistributedSystem")
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
