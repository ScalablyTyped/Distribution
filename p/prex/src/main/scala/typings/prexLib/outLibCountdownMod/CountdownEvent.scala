package typings
package prexLib.outLibCountdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/countdown", "CountdownEvent")
@js.native
class CountdownEvent protected () extends js.Object {
  /**
    * Initializes a new instance of the CountdownEvent class.
    *
    * @param initialCount The initial participant count.
    */
  def this(initialCount: scala.Double) = this()
  var _event: js.Any = js.native
  var _initialCount: js.Any = js.native
  var _remainingCount: js.Any = js.native
  /**
    * Gets the number of signals initially required to set the event.
    */
  val initialCount: scala.Double = js.native
  /**
    * Gets the number of remaining signals required to set the event.
    */
  val remainingCount: scala.Double = js.native
  /**
    * Increments the event's current count by one or more.
    *
    * @param count An optional count specifying the additional number of signals for which the event will wait.
    */
  def add(): scala.Unit = js.native
  def add(count: scala.Double): scala.Unit = js.native
  /**
    * Resets the remaining and initial count to the specified value, or the initial count.
    *
    * @param count An optional count specifying the number of required signals.
    */
  def reset(): scala.Unit = js.native
  def reset(count: scala.Double): scala.Unit = js.native
  /**
    * Registers one or more signals with the CountdownEvent, decrementing the remaining count.
    *
    * @param count An optional count specifying the number of signals to register.
    */
  def signal(): scala.Boolean = js.native
  def signal(count: scala.Double): scala.Boolean = js.native
  def wait(token: atEsfxCancelableLib.distMod.Cancelable): js.Promise[scala.Unit] = js.native
  def wait(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[scala.Unit] = js.native
}

