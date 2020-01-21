package typings.setIntervalAsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("set-interval-async", "fixed")
@js.native
object fixed extends js.Object {
  /**
    * Executes the given handler at fixed intervals, while preventing
    * multiple concurrent executions. The handler will never be executed
    * concurrently more than once in any given moment, providing a fixed
    * time interval between the end of a given execution and the start of
    * the following one.
    *
    * @param handler - Handler function to be executed in intervals. May be asynchronous.
    * @param interval - Interval in milliseconds. Must be at least 10 ms.
    * @param args - Any number of arguments to pass on to the handler.
    */
  def setIntervalAsync(handler: js.Function1[/* repeated */ js.Any, _], interval: Double, args: js.Any*): SetIntervalAsyncTimer = js.native
}

