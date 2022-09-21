package typings.samchon

import typings.samchon.invokeHistoryMod.InvokeHistory
import typings.samchon.invokeMod.Invoke
import typings.samchon.slaveSystemMod.SlaveSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinvokeMod {
  
  @JSImport("samchon/templates/slave/PInvoke", "PInvoke")
  @js.native
  open class PInvoke protected () extends Invoke {
    /**
      * Initializer Constructor.
      *
      * @param invoke Original {@link Invoke} message.
      * @param history {@link InvokeHistory} object archiving execution time.
      * @param slaveSystem Related {@link SlaveSystem} object who gets those processes from its master.
      */
    def this(invoke: Invoke, history: InvokeHistory, slaveSystem: SlaveSystem) = this()
    
    /**
      * Report completion.
      */
    def complete(): Unit = js.native
    
    /**
      * Get history object.
      *
      * Get {@link InvokeHistory} object who is archiving execution time of this process.
      */
    def getHistory(): InvokeHistory = js.native
    
    /**
      * @hidden
      */
    /* private */ var history_ : Any = js.native
    
    /**
      * Hold reporting completion to master.
      */
    def hold(): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var hold_ : Any = js.native
    
    /**
      * Is the reporting hold?
      */
    def isHold(): Boolean = js.native
    
    /**
      * @hidden
      */
    /* private */ var slave_system_ : Any = js.native
  }
}
