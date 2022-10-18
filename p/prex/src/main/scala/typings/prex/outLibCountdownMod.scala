package typings.prex

import typings.esfxCancelable.mod.Cancelable
import typings.prex.outLibCancellationMod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLibCountdownMod {
  
  @JSImport("prex/out/lib/countdown", "CountdownEvent")
  @js.native
  open class CountdownEvent protected () extends StObject {
    /**
      * Initializes a new instance of the CountdownEvent class.
      *
      * @param initialCount The initial participant count.
      */
    def this(initialCount: Double) = this()
    
    /* private */ var _event: Any = js.native
    
    /* private */ var _initialCount: Any = js.native
    
    /* private */ var _remainingCount: Any = js.native
    
    /**
      * Increments the event's current count by one or more.
      *
      * @param count An optional count specifying the additional number of signals for which the event will wait.
      */
    def add(): Unit = js.native
    def add(count: Double): Unit = js.native
    
    /**
      * Gets the number of signals initially required to set the event.
      */
    def initialCount: Double = js.native
    
    /**
      * Gets the number of remaining signals required to set the event.
      */
    def remainingCount: Double = js.native
    
    /**
      * Resets the remaining and initial count to the specified value, or the initial count.
      *
      * @param count An optional count specifying the number of required signals.
      */
    def reset(): Unit = js.native
    def reset(count: Double): Unit = js.native
    
    /**
      * Registers one or more signals with the CountdownEvent, decrementing the remaining count.
      *
      * @param count An optional count specifying the number of signals to register.
      */
    def signal(): Boolean = js.native
    def signal(count: Double): Boolean = js.native
    
    def wait(token: Cancelable): js.Promise[Unit] = js.native
    def wait(token: CancellationToken): js.Promise[Unit] = js.native
  }
}
