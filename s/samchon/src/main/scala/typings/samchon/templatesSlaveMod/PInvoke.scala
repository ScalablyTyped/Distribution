package typings.samchon.templatesSlaveMod

import typings.samchon.protocolInvokeInvokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave", "PInvoke")
@js.native
class PInvoke protected ()
  extends typings.samchon.templatesSlavePInvokeMod.PInvoke {
  /**
    * Initializer Constructor.
    *
    * @param invoke Original {@link Invoke} message.
    * @param history {@link InvokeHistory} object archiving execution time.
    * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
    */
  def this(
    invoke: Invoke,
    history: typings.samchon.templatesSlaveInvokeHistoryMod.InvokeHistory,
    slaveSystem: typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
  ) = this()
}

