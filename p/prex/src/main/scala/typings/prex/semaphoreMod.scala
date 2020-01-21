package typings.prex

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/semaphore", JSImport.Namespace)
@js.native
object semaphoreMod extends js.Object {
  @js.native
  class Semaphore protected () extends js.Object {
    /**
      * Initializes a new instance of the Semaphore class.
      *
      * @param initialCount The initial number of entries.
      * @param maxCount The maximum number of entries.
      */
    def this(initialCount: Double) = this()
    def this(initialCount: Double, maxCount: Double) = this()
    var _currentCount: js.Any = js.native
    var _maxCount: js.Any = js.native
    var _waiters: js.Any = js.native
    /**
      * Gets the number of remaining asynchronous operations that can enter
      * the Semaphore.
      */
    val count: Double = js.native
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

