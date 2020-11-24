package typings.semaphoreAsyncAwait.semaphoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semaphore-async-await/dist/Semaphore", JSImport.Default)
@js.native
class default protected () extends Semaphore {
  /**
    * Creates a semaphore.
    * @param permits  The number of permits, i.e. things being allowed to run in parallel.
    * To create a lock that only lets one thing run at a time, set this to 1.
    * This number can also be negative.
    */
  def this(permits: Double) = this()
}
