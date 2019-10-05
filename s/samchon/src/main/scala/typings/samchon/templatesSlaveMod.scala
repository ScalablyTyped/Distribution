package typings.samchon

import typings.samchon.protocolInvokeInvokeMod.Invoke
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/slave", JSImport.Namespace)
@js.native
object templatesSlaveMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeHistory ()
    extends typings.samchon.templatesSlaveInvokeHistoryMod.InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
  }
  
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
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveClient ()
    extends typings.samchon.templatesSlaveSlaveClientMod.SlaveClient
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends typings.samchon.templatesSlaveSlaveServerMod.SlaveServer
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem ()
    extends typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
  
}

