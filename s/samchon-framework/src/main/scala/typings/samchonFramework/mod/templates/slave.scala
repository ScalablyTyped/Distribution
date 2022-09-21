package typings.samchonFramework.mod.templates

import typings.samchon.invokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slave {
  
  @JSImport("samchon-framework", "templates.slave.InvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  open class InvokeHistory ()
    extends typings.samchon.mod.templates.slave.InvokeHistory {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
  }
  
  @JSImport("samchon-framework", "templates.slave.PInvoke")
  @js.native
  open class PInvoke protected ()
    extends typings.samchon.mod.templates.slave.PInvoke {
    /**
      * Initializer Constructor.
      *
      * @param invoke Original {@link Invoke} message.
      * @param history {@link InvokeHistory} object archiving execution time.
      * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
      */
    def this(
      invoke: Invoke,
      history: typings.samchon.invokeHistoryMod.InvokeHistory,
      slaveSystem: typings.samchon.slaveSystemMod.SlaveSystem
    ) = this()
  }
  
  @JSImport("samchon-framework", "templates.slave.SlaveClient")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveClient ()
    extends typings.samchon.mod.templates.slave.SlaveClient
  
  @JSImport("samchon-framework", "templates.slave.SlaveServer")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveServer ()
    extends typings.samchon.mod.templates.slave.SlaveServer
  
  @JSImport("samchon-framework", "templates.slave.SlaveSystem")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class SlaveSystem ()
    extends typings.samchon.mod.templates.slave.SlaveSystem
}
