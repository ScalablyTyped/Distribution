package typings.ratelimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimiterInfo extends js.Object {
  /**
    * Number of calls left in current duration without decreasing current get
    */
  var remaining: Double
  /**
    * Time in milliseconds until the end of current duration
    */
  var reset: Double
  /**
    * max value
    */
  var total: Double
}

object LimiterInfo {
  @scala.inline
  def apply(remaining: Double, reset: Double, total: Double): LimiterInfo = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterInfo]
  }
}

