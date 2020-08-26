package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharpCounters extends js.Object {
  /** The number of resize tasks currently being processed. */
  var process: Double = js.native
  /** The number of tasks this module has queued waiting for libuv to provide a worker thread from its pool. */
  var queue: Double = js.native
}

object SharpCounters {
  @scala.inline
  def apply(process: Double, queue: Double): SharpCounters = {
    val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharpCounters]
  }
  @scala.inline
  implicit class SharpCountersOps[Self <: SharpCounters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProcess(value: Double): Self = this.set("process", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: Double): Self = this.set("queue", value.asInstanceOf[js.Any])
  }
  
}

