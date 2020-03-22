package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLimit extends js.Object {
  var counter: String
  var limit: Double
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonLimit {
  @scala.inline
  def apply(counter: String, limit: Double, timeout: Int | Double = null): AnonLimit = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLimit]
  }
}

