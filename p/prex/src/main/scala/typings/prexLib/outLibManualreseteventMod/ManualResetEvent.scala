package typings
package prexLib.outLibManualreseteventMod

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
  def this(initialState: scala.Boolean) = this()
  var _signaled: js.Any = js.native
  var _waiters: js.Any = js.native
  /**
    * Gets a value indicating whether the event is signaled.
    */
  val isSet: scala.Boolean = js.native
  /**
    * Sets the state of the event to nonsignaled, causing asynchronous operations to pause.
    */
  def reset(): scala.Unit = js.native
  /**
    * Sets the state of the event to signaled, resolving one or more waiting Promises.
    */
  def set(): scala.Unit = js.native
  def wait(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[scala.Unit] = js.native
}

