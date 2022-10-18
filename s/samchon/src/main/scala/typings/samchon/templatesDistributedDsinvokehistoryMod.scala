package typings.samchon

import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesDistributedDistributedProcessMod.DistributedProcess
import typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem
import typings.samchon.templatesSlaveInvokeHistoryMod.InvokeHistory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesDistributedDsinvokehistoryMod {
  
  @JSImport("samchon/templates/distributed/DSInvokeHistory", "DSInvokeHistory")
  @js.native
  open class DSInvokeHistory protected () extends InvokeHistory {
    /**
      * Construct from a DistributedSystem.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      */
    def this(system: DistributedSystem) = this()
    /**
      * Initilizer Constructor.
      *
      * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
      * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
      * @param invoke An {@link Invoke} message requesting the *distributed process*.
      * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
      */
    def this(system: DistributedSystem, process: DistributedProcess, invoke: Invoke, weight: Double) = this()
    
    /**
      * Get the related {@link DistributedProcess} object.
      */
    def getProcess(): DistributedProcess = js.native
    
    /**
      * Get the related {@link DistributedSystem} object.
      */
    def getSystem(): DistributedSystem = js.native
    
    /**
      * Get weight.
      *
      * Gets weight of resource which indicates how heavy this {@link Invoke} message is. Default is 1.
      */
    def getWeight(): Double = js.native
    
    /**
      * @hidden
      */
    /* private */ var process_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var system_ : Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var weight_ : Any = js.native
  }
}
