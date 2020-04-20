package typings.sailthruClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var limit: Double
  var remaining: Double
  var reset: Double
}

object AnonLimit {
  @scala.inline
  def apply(limit: Double, remaining: Double, reset: Double): AnonLimit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
}

