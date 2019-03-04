package typings
package samchonLib.templatesDistributedDSInvokeHistoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed/DSInvokeHistory", "DSInvokeHistory")
@js.native
class DSInvokeHistory protected ()
  extends samchonLib.templatesSlaveInvokeHistoryMod.InvokeHistory {
  /**
    * Construct from a DistributedSystem.
    *
    * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
    */
  def this(system: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem) = this()
  /**
    * Initilizer Constructor.
    *
    * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
    * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
    * @param invoke An {@link Invoke} message requesting the *distributed process*.
    * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
    */
  def this(system: samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem, process: samchonLib.templatesDistributedDistributedProcessMod.DistributedProcess, invoke: samchonLib.protocolInvokeInvokeMod.Invoke, weight: scala.Double) = this()
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
  def getProcess(): samchonLib.templatesDistributedDistributedProcessMod.DistributedProcess = js.native
  /**
    * Get the related {@link DistributedSystem} object.
    */
  def getSystem(): samchonLib.templatesDistributedDistributedSystemMod.DistributedSystem = js.native
  /**
    * Get weight.
    *
    * Gets weight of resource which indicates how heavy this {@link Invoke} message is. Default is 1.
    */
  def getWeight(): scala.Double = js.native
}

