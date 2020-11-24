package typings.semaphoreAsyncAwait

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semaphore-async-await", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Creates a lock.
    */
  class Lock ()
    extends typings.semaphoreAsyncAwait.lockMod.Lock
  
  @js.native
  class default protected ()
    extends typings.semaphoreAsyncAwait.semaphoreMod.default {
    /**
      * Creates a semaphore.
      * @param permits  The number of permits, i.e. things being allowed to run in parallel.
      * To create a lock that only lets one thing run at a time, set this to 1.
      * This number can also be negative.
      */
    def this(permits: Double) = this()
  }
}
