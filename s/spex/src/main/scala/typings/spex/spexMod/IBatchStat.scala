package typings.spex.spexMod

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
    val __obj = js.Dynamic.literal(duration = duration, failed = failed, succeeded = succeeded, total = total)
  
    __obj.asInstanceOf[IBatchStat]
  }
}

