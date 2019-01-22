package typings
package samchonLib.templatesSlaveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave", "PInvoke")
@js.native
class PInvoke protected ()
  extends samchonLib.templatesSlavePInvokeMod.PInvoke {
  /**
    * Initializer Constructor.
    *
    * @param invoke Original {@link Invoke} message.
    * @param history {@link InvokeHistory} object archiving execution time.
    * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
    */
  def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke, history: samchonLib.templatesSlaveInvokeHistoryMod.InvokeHistory, slaveSystem: samchonLib.templatesSlaveSlaveSystemMod.SlaveSystem) = this()
}

