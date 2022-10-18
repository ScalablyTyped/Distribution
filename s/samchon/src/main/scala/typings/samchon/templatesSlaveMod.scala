package typings.samchon

import typings.samchon.protocolInvokeInvokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesSlaveMod {
  
  @JSImport("samchon/templates/slave", "InvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  open class InvokeHistory ()
    extends typings.samchon.templatesSlaveInvokeHistoryMod.InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @JSImport("samchon/templates/slave", "PInvoke")
  @js.native
  open class PInvoke protected ()
    extends typings.samchon.templatesSlavePinvokeMod.PInvoke {
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
  
  /* note: abstract class */ @JSImport("samchon/templates/slave", "SlaveClient")
  @js.native
  /**
    * Default Constructor.
    */
  open class SlaveClient ()
    extends typings.samchon.templatesSlaveSlaveClientMod.SlaveClient
  
  /* note: abstract class */ @JSImport("samchon/templates/slave", "SlaveServer")
  @js.native
  /**
    * Default Constructor.
    */
  open class SlaveServer ()
    extends typings.samchon.templatesSlaveSlaveServerMod.SlaveServer
  
  /* note: abstract class */ @JSImport("samchon/templates/slave", "SlaveSystem")
  @js.native
  /**
    * Default Constructor.
    */
  open class SlaveSystem ()
    extends typings.samchon.templatesSlaveSlaveSystemMod.SlaveSystem
}
