package typings.redis.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetryStrategyOptions extends js.Object {
  var attempt: Double = js.native
  var error: ErrnoException = js.native
  var times_connected: Double = js.native
  var total_retry_time: Double = js.native
}

object RetryStrategyOptions {
  @scala.inline
  def apply(attempt: Double, error: ErrnoException, times_connected: Double, total_retry_time: Double): RetryStrategyOptions = {
    val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], times_connected = times_connected.asInstanceOf[js.Any], total_retry_time = total_retry_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryStrategyOptions]
  }
  @scala.inline
  implicit class RetryStrategyOptionsOps[Self <: RetryStrategyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttempt(value: Double): Self = this.set("attempt", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrnoException): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimes_connected(value: Double): Self = this.set("times_connected", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_retry_time(value: Double): Self = this.set("total_retry_time", value.asInstanceOf[js.Any])
  }
  
}

