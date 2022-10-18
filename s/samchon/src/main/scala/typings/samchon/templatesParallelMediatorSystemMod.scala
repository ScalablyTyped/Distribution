package typings.samchon

import typings.samchon.templatesDistributedDistributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesParallelParallelSystemArrayMediatorMod.ParallelSystemArrayMediator
import typings.samchon.templatesParallelParallelSystemArrayMod.ParallelSystemArray
import typings.samchon.templatesParallelParallelSystemMod.ParallelSystem
import typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesParallelMediatorSystemMod {
  
  /* note: abstract class */ @JSImport("samchon/templates/parallel/MediatorSystem", "MediatorSystem")
  @js.native
  open class MediatorSystem protected () extends SlaveSystem {
    /**
      * Construct from parent {@link DistributedSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link DistributedSystemArrayMediator} object.
      */
    def this(systemArray: DistributedSystemArrayMediator[DistributedSystem]) = this()
    /**
      * Construct from parent {@link ParallelSystemArrayMediator} object.
      *
      * @param systemArray The parent {@link ParallelSystemArrayMediator} object.
      */
    def this(systemArray: ParallelSystemArrayMediator[ParallelSystem]) = this()
    
    /**
      * @hidden
      */
    /* private */ var _Complete_history: Any = js.native
    
    /**
      * Get parent {@link ParallelSystemArrayMediator} or {@link DistributedSystemArrayMediator} object.
      */
    def getSystemArray(): ParallelSystemArrayMediator[ParallelSystem] | DistributedSystemArrayMediator[DistributedSystem] = js.native
    /**
      * Get parent {@link ParallelSystemArrayMediator} object.
      */
    /**
      * Get parent {@link DistributedSystemArrayMediator} object.
      */
    @JSName("getSystemArray")
    def getSystemArray_SystemArray_SystemArray[SystemArray /* <: ParallelSystemArray[ParallelSystem] */](): SystemArray = js.native
    
    /**
      * @hidden
      */
    /* private */ var progress_list_ : Any = js.native
    
    /**
      * Start interaction.
      *
      * The {@link start start()} is an abstract method starting interaction with the **master** system. If the
      * **master** is a server, then connects to the **master**. Otherwise, the **master** is client, then this
      * {@link MediatorSystem} object wil open a server accepting the **master**.
      */
    def start(): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var system_array_ : Any = js.native
  }
}
