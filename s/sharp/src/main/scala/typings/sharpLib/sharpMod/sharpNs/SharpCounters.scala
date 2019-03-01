package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharpCounters extends js.Object {
  /** The number of resize tasks currently being processed. */
  var process: scala.Double
  /** The number of tasks this module has queued waiting for libuv to provide a worker thread from its pool. */
  var queue: scala.Double
}

object SharpCounters {
  @scala.inline
  def apply(process: scala.Double, queue: scala.Double): SharpCounters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("process")(process)
    __obj.updateDynamic("queue")(queue)
    __obj.asInstanceOf[SharpCounters]
  }
}

