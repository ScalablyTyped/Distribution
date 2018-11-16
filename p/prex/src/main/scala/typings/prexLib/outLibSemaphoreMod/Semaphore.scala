package typings
package prexLib.outLibSemaphoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/semaphore", "Semaphore")
@js.native
class Semaphore protected () extends js.Object {
  /**
       * Initializes a new instance of the Semaphore class.
       *
       * @param initialCount The initial number of entries.
       * @param maxCount The maximum number of entries.
       */
  def this(initialCount: scala.Double) = this()
  /**
       * Initializes a new instance of the Semaphore class.
       *
       * @param initialCount The initial number of entries.
       * @param maxCount The maximum number of entries.
       */
  def this(initialCount: scala.Double, maxCount: scala.Double) = this()
  var _currentCount: js.Any = js.native
  var _maxCount: js.Any = js.native
  var _waiters: js.Any = js.native
  /**
       * Gets the number of remaining asynchronous operations that can enter
       * the Semaphore.
       */
  val count: scala.Double = js.native
  /**
       * Releases the Semaphore one or more times.
       *
       * @param count The number of times to release the Semaphore.
       */
  def release(): scala.Unit = js.native
  /**
       * Releases the Semaphore one or more times.
       *
       * @param count The number of times to release the Semaphore.
       */
  def release(count: scala.Double): scala.Unit = js.native
  /**
       * Asynchronously waits for the event to become signaled.
       *
       * @param token A CancellationToken used to cancel the request.
       */
  def wait(token: prexLib.outLibCancellationMod.CancellationToken): stdLib.Promise[scala.Unit] = js.native
}

