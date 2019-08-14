package typings.setDashIntervalDashAsync.setDashIntervalDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("set-interval-async", "dynamic")
@js.native
object dynamicNs extends js.Object {
  /**
    * Attempts to execute the given handler at regular intervals, while preventing
    * multiple concurrent executions. The handler will never be executed concurrently
    * more than once in any given moment. If the running time of any execution exceeds
    * the desired interval, the following execution will be scheduled as soon as
    * possible; ie. immediately after the previous execution concludes.
    *
    * @param handler - Handler function to be executed in intervals. May be asynchronous.
    * @param interval - Interval in milliseconds. Must be at least 10 ms.
    * @param args - Any number of arguments to pass on to the handler.
    */
  def setIntervalAsync(handler: js.Function1[/* repeated */ js.Any, _], interval: Double, args: js.Any*): SetIntervalAsyncTimer = js.native
}

