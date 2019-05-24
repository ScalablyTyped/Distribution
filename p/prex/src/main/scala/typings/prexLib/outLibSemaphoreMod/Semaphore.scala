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
  def release(count: scala.Double): scala.Unit = js.native
  def wait(token: atEsfxCancelableLib.distMod.Cancelable): js.Promise[scala.Unit] = js.native
  def wait(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[scala.Unit] = js.native
}

