package typings.samchon.templatesDistributedMod

import typings.samchon.protocolInvokeInvokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/distributed", "DSInvokeHistory")
@js.native
class DSInvokeHistory protected ()
  extends typings.samchon.templatesDistributedDSInvokeHistoryMod.DSInvokeHistory {
  /**
    * Construct from a DistributedSystem.
    *
    * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
    */
  def this(system: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem) = this()
  /**
    * Initilizer Constructor.
    *
    * @param system The {@link DistributedSystem} object who sent the {@link Invoke} message.
    * @param process The {@link DistributedProcess} object who sent the {@link Invoke} message.
    * @param invoke An {@link Invoke} message requesting the *distributed process*.
    * @param weight Weight of resource which indicates how heavy this {@link Invoke} message is.
    */
  def this(
    system: typings.samchon.templatesDistributedDistributedSystemMod.DistributedSystem,
    process: typings.samchon.templatesDistributedDistributedProcessMod.DistributedProcess,
    invoke: Invoke,
    weight: Double
  ) = this()
}

