package typings.ratelimiter.ratelimiterMod

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
    val __obj = js.Dynamic.literal(remaining = remaining, reset = reset, total = total)
  
    __obj.asInstanceOf[LimiterInfo]
  }
}

