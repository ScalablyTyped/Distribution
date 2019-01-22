package typings
package samchonLib.templatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates", "slave")
@js.native
object slaveNs extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeHistory ()
    extends samchonLib.templatesSlaveMod.InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke) = this()
  }
  
  @js.native
  class PInvoke protected ()
    extends samchonLib.templatesSlaveMod.PInvoke {
    /**
      * Initializer Constructor.
      *
      * @param invoke Original {@link Invoke} message.
      * @param history {@link InvokeHistory} object archiving execution time.
      * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
      */
    def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke, history: samchonLib.templatesSlaveInvokeHistoryMod.InvokeHistory, slaveSystem: samchonLib.templatesSlaveSlaveSystemMod.SlaveSystem) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveClient ()
    extends samchonLib.templatesSlaveMod.SlaveClient
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends samchonLib.templatesSlaveMod.SlaveServer
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem ()
    extends samchonLib.templatesSlaveMod.SlaveSystem
  
}

