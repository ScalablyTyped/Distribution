package typings
package ratelimiterLib.ratelimiterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimiterInfo extends js.Object {
  /**
    * Number of calls left in current duration without decreasing current get
    */
  var remaining: scala.Double
  /**
    * Time in milliseconds until the end of current duration
    */
  var reset: scala.Double
  /**
    * max value
    */
  var total: scala.Double
}

object LimiterInfo {
  @scala.inline
  def apply(remaining: scala.Double, reset: scala.Double, total: scala.Double): LimiterInfo = {
    val __obj = js.Dynamic.literal(remaining = remaining, reset = reset, total = total)
  
    __obj.asInstanceOf[LimiterInfo]
  }
}

