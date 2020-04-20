package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatchStat extends js.Object {
  var duration: Double
  var failed: Double
  var succeeded: Double
  var total: Double
}

object IBatchStat {
  @scala.inline
  def apply(duration: Double, failed: Double, succeeded: Double, total: Double): IBatchStat = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBatchStat]
  }
}

