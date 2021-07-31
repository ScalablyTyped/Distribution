package typings.prex

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.cancellationMod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoreseteventMod {
  
  @JSImport("prex/out/lib/autoresetevent", "AutoResetEvent")
  @js.native
  /**
    * Initializes a new instance of the AutoResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class AutoResetEvent () extends StObject {
    def this(initialState: Boolean) = this()
    
    var _signaled: js.Any = js.native
    
    var _waiters: js.Any = js.native
    
    /**
      * Sets the state of the event to nonsignaled, causing asynchronous operations to pause.
      */
    def reset(): Unit = js.native
    
    /**
      * Sets the state of the event to signaled, resolving one or more waiting Promises.
      * The event is then automatically reset.
      */
    def set(): Unit = js.native
    
    def wait(token: Cancelable): js.Promise[Unit] = js.native
    def wait(token: CancellationToken): js.Promise[Unit] = js.native
  }
}
