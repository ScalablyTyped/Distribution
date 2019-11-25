package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharpCounters extends js.Object {
  /** The number of resize tasks currently being processed. */
  var process: Double
  /** The number of tasks this module has queued waiting for libuv to provide a worker thread from its pool. */
  var queue: Double
}

object SharpCounters {
  @scala.inline
  def apply(process: Double, queue: Double): SharpCounters = {
    val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SharpCounters]
  }
}

