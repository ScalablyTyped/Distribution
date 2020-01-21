package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntervalRunning extends js.Object {
  var interval: js.UndefOr[Double] = js.undefined
  // By default, does not run.
  var running: js.UndefOr[Boolean] = js.undefined
}

object AnonIntervalRunning {
  @scala.inline
  def apply(interval: Int | Double = null, running: js.UndefOr[Boolean] = js.undefined): AnonIntervalRunning = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(running)) __obj.updateDynamic("running")(running.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntervalRunning]
  }
}

