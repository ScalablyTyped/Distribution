package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspenseConfig
  extends typings.react.experimentalMod.reactAugmentingMod.TimeoutConfig {
  var busyDelayMs: js.UndefOr[Double] = js.undefined
  var busyMinDurationMs: js.UndefOr[Double] = js.undefined
}

object SuspenseConfig {
  @scala.inline
  def apply(timeoutMs: Double, busyDelayMs: Int | Double = null, busyMinDurationMs: Int | Double = null): SuspenseConfig = {
    val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
    if (busyDelayMs != null) __obj.updateDynamic("busyDelayMs")(busyDelayMs.asInstanceOf[js.Any])
    if (busyMinDurationMs != null) __obj.updateDynamic("busyMinDurationMs")(busyMinDurationMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseConfig]
  }
}

