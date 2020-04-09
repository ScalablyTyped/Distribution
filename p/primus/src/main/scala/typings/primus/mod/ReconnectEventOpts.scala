package typings.primus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<primus.primus.ReconnectOpts> */
trait ReconnectEventOpts extends js.Object {
  var attempt: Double
  var backoff: Boolean
  var duration: Double
  var factor: Double
  var max: Double
  var min: Double
  var `reconnect timeout`: Double
  var retries: Double
  var scheduled: Double
  var start: Double
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
    __obj.updateDynamic("reconnect timeout")(`reconnect timeout`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReconnectEventOpts]
  }
}

