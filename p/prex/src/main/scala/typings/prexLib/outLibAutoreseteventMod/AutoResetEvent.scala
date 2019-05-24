package typings
package prexLib.outLibAutoreseteventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/autoresetevent", "AutoResetEvent")
@js.native
/**
  * Initializes a new instance of the AutoResetEvent class.
  *
  * @param initialState A value indicating whether to set the initial state to signaled.
  */
class AutoResetEvent () extends js.Object {
  def this(initialState: scala.Boolean) = this()
  var _signaled: js.Any = js.native
  var _waiters: js.Any = js.native
  /**
    * Sets the state of the event to nonsignaled, causing asynchronous operations to pause.
    */
  def reset(): scala.Unit = js.native
  /**
    * Sets the state of the event to signaled, resolving one or more waiting Promises.
    * The event is then automatically reset.
    */
  def set(): scala.Unit = js.native
  def wait(token: atEsfxCancelableLib.distMod.Cancelable): js.Promise[scala.Unit] = js.native
  def wait(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[scala.Unit] = js.native
}

