package typings.setIntervalAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("set-interval-async", "legacy")
@js.native
object legacy extends js.Object {
  
  /**
    * Executes the given handler at fixed intervals; ie. the start time
    * between consecutive executions is always a fixed amount of time.
    * If a given execution takes longer than the given time interval to
    * complete, then the handler will be invoked again without waiting
    * for the previous one to finish. In this scenario, multiple concurrent
    * executions can and will ocurr, so this function should only be used
    * when the given handler is reentrancy-safe.
    *
    * @param handler - Handler function to be executed in intervals. May be asynchronous.
    * @param interval - Interval in milliseconds. Must be at least 10 ms.
    * @param args - Any number of arguments to pass on to the handler.
    */
  def setIntervalAsync(handler: js.Function1[/* repeated */ js.Any, _], interval: Double, args: js.Any*): SetIntervalAsyncTimer = js.native
}
