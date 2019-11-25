package typings.requestDashStats.requestDashStatsMod

import typings.requestDashStats.Anon_BytesBytesDelta
import typings.requestDashStats.Anon_BytesBytesDeltaSpeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  /**
    * `false` if the request is still in progress
    */
  var completed: Boolean
  var req: Anon_BytesBytesDelta
  var res: Anon_BytesBytesDeltaSpeed
  /**
    * The total time the reuqest have been in progress
    */
  var time: Double
  /**
    * The time since previous call to `.progress()`
    */
  var timeDelta: Double
}

object Progress {
  @scala.inline
  def apply(
    completed: Boolean,
    req: Anon_BytesBytesDelta,
    res: Anon_BytesBytesDeltaSpeed,
    time: Double,
    timeDelta: Double
  ): Progress = {
    val __obj = js.Dynamic.literal(completed = completed.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeDelta = timeDelta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Progress]
  }
}

