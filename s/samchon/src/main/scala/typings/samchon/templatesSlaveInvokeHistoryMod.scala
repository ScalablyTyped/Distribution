package typings.samchon

import typings.samchon.protocolEntityEntityMod.Entity
import typings.samchon.protocolInvokeInvokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesSlaveInvokeHistoryMod {
  
  @JSImport("samchon/templates/slave/InvokeHistory", "InvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  open class InvokeHistory () extends Entity {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
    
    /**
      * Complete the history.
      *
      * Completes the history and determines the {@link getEndTime end time}.
      */
    def complete(): Unit = js.native
    
    /**
      * Compute elapsed time.
      *
      * @return nanoseconds.
      */
    def computeElapsedTime(): Double = js.native
    
    /**
      * @hidden
      */
    /* private */ var end_time_ : Any = js.native
    
    /**
      * Get end time.
      */
    def getEndTime(): js.Date = js.native
    
    /**
      * Get {@link Invoke.getListener listener} of the {@link Invoke} message.
      */
    def getListener(): String = js.native
    
    /**
      * Get start time.
      */
    def getStartTime(): js.Date = js.native
    
    /**
      * Get unique ID.
      */
    def getUID(): Double = js.native
    
    /**
      * @hidden
      */
    /* private */ var listener: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var start_time_ : Any = js.native
    
    /**
      * Convert to an {@link Invoke} message.
      *
      * Creates and returns an {@link Invoke} message that is used to reporting to the **master**.
      */
    def toInvoke(): Invoke = js.native
    
    /**
      * @hidden
      */
    /* private */ var uid: Any = js.native
  }
}
