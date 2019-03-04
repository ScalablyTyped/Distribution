package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBatchStat extends js.Object {
  var duration: scala.Double
  var failed: scala.Double
  var succeeded: scala.Double
  var total: scala.Double
}

object IBatchStat {
  @scala.inline
  def apply(duration: scala.Double, failed: scala.Double, succeeded: scala.Double, total: scala.Double): IBatchStat = {
    val __obj = js.Dynamic.literal(duration = duration, failed = failed, succeeded = succeeded, total = total)
  
    __obj.asInstanceOf[IBatchStat]
  }
}

