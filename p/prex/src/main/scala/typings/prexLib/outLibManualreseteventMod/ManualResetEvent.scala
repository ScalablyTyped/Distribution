package typings
package prexLib.outLibManualreseteventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/manualresetevent", "ManualResetEvent")
@js.native
class ManualResetEvent () extends js.Object {
  /**
       * Initializes a new instance of the ManualResetEvent class.
       *
       * @param initialState A value indicating whether to set the initial state to signaled.
       */
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
  /**
       * Asynchronously waits for the event to become signaled.
       *
       * @param token A CancellationToken used to cancel the request.
       */
  def wait(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[scala.Unit] = js.native
}

