package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryStrategyOptions extends js.Object {
  var attempt: scala.Double
  var error: nodeLib.NodeJSNs.ErrnoException
  var times_connected: scala.Double
  var total_retry_time: scala.Double
}

object RetryStrategyOptions {
  @scala.inline
  def apply(
    attempt: scala.Double,
    error: nodeLib.NodeJSNs.ErrnoException,
    times_connected: scala.Double,
    total_retry_time: scala.Double
  ): RetryStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attempt")(attempt)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("times_connected")(times_connected)
    __obj.updateDynamic("total_retry_time")(total_retry_time)
    __obj.asInstanceOf[RetryStrategyOptions]
  }
}

