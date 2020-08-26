package typings.primus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<primus.primus.ReconnectOpts> */
@js.native
trait ReconnectEventOpts extends js.Object {
  var attempt: Double = js.native
  var backoff: Boolean = js.native
  var duration: Double = js.native
  var factor: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var `reconnect timeout`: Double = js.native
  var retries: Double = js.native
  var scheduled: Double = js.native
  var start: Double = js.native
}

object ReconnectEventOpts {
  @scala.inline
  def apply(
    attempt: Double,
    backoff: Boolean,
    duration: Double,
    factor: Double,
    max: Double,
    min: Double,
    `reconnect timeout`: Double,
    retries: Double,
    scheduled: Double,
    start: Double
  ): ReconnectEventOpts = {
    val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], backoff = backoff.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("reconnect timeout")((`reconnect timeout`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ReconnectEventOpts]
  }
  @scala.inline
  implicit class ReconnectEventOptsOps[Self <: ReconnectEventOpts] (val x: Self) extends AnyVal {
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
    def setBackoff(value: Boolean): Self = this.set("backoff", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFactor(value: Double): Self = this.set("factor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def `setReconnect timeout`(value: Double): Self = this.set("reconnect timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheduled(value: Double): Self = this.set("scheduled", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

