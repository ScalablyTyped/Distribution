package typings.samchon

import typings.samchon.protocolCommunicatorIclientdriverMod.IClientDriver
import typings.samchon.templatesDistributedDistributedSystemArrayMod.DistributedSystemArray
import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesDistributedDistributedSystemMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/distributed/DistributedSystem", "DistributedSystem")
  @js.native
  open class DistributedSystem protected () extends ParallelSystem {
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
    /* private */ var _Compute_average_elapsed_time: Any = js.native
  }
}
