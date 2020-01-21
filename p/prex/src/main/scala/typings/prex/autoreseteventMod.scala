package typings.prex

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.cancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/autoresetevent", JSImport.Namespace)
@js.native
object autoreseteventMod extends js.Object {
  @js.native
  /**
    * Initializes a new instance of the AutoResetEvent class.
    *
    * @param initialState A value indicating whether to set the initial state to signaled.
    */
  class AutoResetEvent () extends js.Object {
    def this(initialState: Boolean) = this()
    var _signaled: js.Any = js.native
    var _waiters: js.Any = js.native
    /**
      * Sets the state of the event to nonsignaled, causing asynchronous operations to pause.
      */
    def reset(): Unit = js.native
    /**
      * Sets the state of the event to signaled, resolving one or more waiting Promises.
      * The event is then automatically reset.
      */
    def set(): Unit = js.native
    def wait(token: Cancelable): js.Promise[Unit] = js.native
    def wait(token: CancellationToken): js.Promise[Unit] = js.native
  }
  
}

