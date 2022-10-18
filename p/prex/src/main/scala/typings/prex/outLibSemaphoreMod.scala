package typings.prex

import typings.esfxCancelable.mod.Cancelable
import typings.prex.outLibCancellationMod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outLibSemaphoreMod {
  
  @JSImport("prex/out/lib/semaphore", "Semaphore")
  @js.native
  open class Semaphore protected () extends StObject {
    /**
      * Initializes a new instance of the Semaphore class.
      *
      * @param initialCount The initial number of entries.
      * @param maxCount The maximum number of entries.
      */
    def this(initialCount: Double) = this()
    def this(initialCount: Double, maxCount: Double) = this()
    
    /* private */ var _currentCount: Any = js.native
    
    /* private */ var _maxCount: Any = js.native
    
    /* private */ var _waiters: Any = js.native
    
    /**
      * Gets the number of remaining asynchronous operations that can enter
      * the Semaphore.
      */
    def count: Double = js.native
    
    /**
      * Releases the Semaphore one or more times.
      *
      * @param count The number of times to release the Semaphore.
      */
    def release(): Unit = js.native
    def release(count: Double): Unit = js.native
    
    def wait(token: Cancelable): js.Promise[Unit] = js.native
    def wait(token: CancellationToken): js.Promise[Unit] = js.native
  }
}
