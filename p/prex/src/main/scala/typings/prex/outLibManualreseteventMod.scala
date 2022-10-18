package typings.prex

import typings.esfxCancelable.mod.Cancelable
import typings.prex.outLibCancellationMod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLibManualreseteventMod {
  
  @JSImport("prex/out/lib/manualresetevent", "ManualResetEvent")
  @js.native
  /**
    * Initializes a new instance of the ManualResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  open class ManualResetEvent () extends StObject {
    def this(initialState: Boolean) = this()
    
    /* private */ var _signaled: Any = js.native
    
    /* private */ var _waiters: Any = js.native
    
    /**
      * Gets a value indicating whether the event is signaled.
      */
    def isSet: Boolean = js.native
    
    /**
      * Sets the state of the event to nonsignaled, causing asynchronous operations to pause.
      */
    def reset(): Unit = js.native
    
    /**
      * Sets the state of the event to signaled, resolving one or more waiting Promises.
      */
    def set(): Unit = js.native
    
    def wait(token: Cancelable): js.Promise[Unit] = js.native
    def wait(token: CancellationToken): js.Promise[Unit] = js.native
  }
}
