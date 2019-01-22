package typings
package samchonLib.templatesSlavePInvokeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave/PInvoke", "PInvoke")
@js.native
class PInvoke protected ()
  extends samchonLib.protocolInvokeInvokeMod.Invoke {
  /**
    * Initializer Constructor.
    *
    * @param invoke Original {@link Invoke} message.
    * @param history {@link InvokeHistory} object archiving execution time.
    * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
    */
  def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke, history: samchonLib.templatesSlaveInvokeHistoryMod.InvokeHistory, slaveSystem: samchonLib.templatesSlaveSlaveSystemMod.SlaveSystem) = this()
  /**
    * @hidden
    */
  var `history_`: js.Any = js.native
  /**
    * @hidden
    */
  var `hold_`: js.Any = js.native
  /**
    * @hidden
    */
  var `slave_system_`: js.Any = js.native
  /**
    * Report completion.
    */
  def complete(): scala.Unit = js.native
  /**
    * Get history object.
    *
    * Get {@link InvokeHistory} object who is archiving execution time of this process.
    */
  def getHistory(): samchonLib.templatesSlaveInvokeHistoryMod.InvokeHistory = js.native
  /**
    * Hold reporting completion to master.
    */
  def hold(): scala.Unit = js.native
  /**
    * Is the reporting hold?
    */
  def isHold(): scala.Boolean = js.native
}

