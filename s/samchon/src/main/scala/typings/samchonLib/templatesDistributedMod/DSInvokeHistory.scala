package typings
package samchonLib.templatesDistributedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed", "DSInvokeHistory")
@js.native
class DSInvokeHistory protected ()
  extends samchonLib.templatesDistributedDSInvokeHistoryMod.DSInvokeHistory {
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
}

