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
    val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], times_connected = times_connected.asInstanceOf[js.Any], total_retry_time = total_retry_time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetryStrategyOptions]
  }
}

