package typings.samchon

import typings.samchon.distributedProcessMod.DistributedProcess
import typings.samchon.distributedSystemMod.DistributedSystem
import typings.samchon.invokeHistoryMod.InvokeHistory
import typings.samchon.invokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/DSInvokeHistory", JSImport.Namespace)
@js.native
object dsinvokehistoryMod extends js.Object {
  @js.native
  class DSInvokeHistory protected () extends InvokeHistory {
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
      * @hidden
      */
    var process_ : js.Any = js.native
    /**
      * @hidden
      */
    var system_ : js.Any = js.native
    /**
      * @hidden
      */
    var weight_ : js.Any = js.native
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
  }
  
}

