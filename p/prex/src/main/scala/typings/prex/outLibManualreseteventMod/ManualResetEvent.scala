package typings.prex.outLibManualreseteventMod

import typings.atEsfxCancelable.distMod.Cancelable
import typings.prex.outLibCancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/manualresetevent", "ManualResetEvent")
@js.native
/**
  * Initializes a new instance of the ManualResetEvent class.
  *
  * @param initialState A value indicating whether to set the initial state to signaled.
  */
class ManualResetEvent () extends js.Object {
  def this(initialState: Boolean) = this()
  var _signaled: js.Any = js.native
  var _waiters: js.Any = js.native
  /**
    * Gets a value indicating whether the event is signaled.
    */
  val isSet: Boolean = js.native
  /**
    * Sets the state of the event to nonsignaled, causing asynchronous operations to pause.
    */
  def reset(): Unit = js.native
  /**
    * Sets the state of the event to signaled, resolving one or more waiting Promises.
    */
  def set(): Unit = js.native
  def wait(token: Cancelable): js.Promise[Unit] = js.native
  def wait(token: CancellationToken): js.Promise[Unit] = js.native
}

