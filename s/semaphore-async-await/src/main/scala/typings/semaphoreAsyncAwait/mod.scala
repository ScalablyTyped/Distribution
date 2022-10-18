package typings.semaphoreAsyncAwait

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semaphore-async-await", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.semaphoreAsyncAwait.distSemaphoreMod.default {
    /**
      * Creates a semaphore.
      * @param permits  The number of permits, i.e. things being allowed to run in parallel.
      * To create a lock that only lets one thing run at a time, set this to 1.
      * This number can also be negative.
      */
    def this(permits: Double) = this()
  }
  
  @JSImport("semaphore-async-await", "Lock")
  @js.native
  /**
    * Creates a lock.
    */
  open class Lock ()
    extends typings.semaphoreAsyncAwait.distLockMod.Lock
}
