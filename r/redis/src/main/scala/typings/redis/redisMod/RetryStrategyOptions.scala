package typings.redis.redisMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryStrategyOptions extends js.Object {
  var attempt: Double
  var error: ErrnoException
  var times_connected: Double
  var total_retry_time: Double
}

object RetryStrategyOptions {
  @scala.inline
  def apply(attempt: Double, error: ErrnoException, times_connected: Double, total_retry_time: Double): RetryStrategyOptions = {
    val __obj = js.Dynamic.literal(attempt = attempt, error = error, times_connected = times_connected, total_retry_time = total_retry_time)
  
    __obj.asInstanceOf[RetryStrategyOptions]
  }
}

