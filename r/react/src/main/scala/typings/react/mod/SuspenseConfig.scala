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
  def apply(
    timeoutMs: Double,
    busyDelayMs: js.UndefOr[Double] = js.undefined,
    busyMinDurationMs: js.UndefOr[Double] = js.undefined
  ): SuspenseConfig = {
    val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
    if (!js.isUndefined(busyDelayMs)) __obj.updateDynamic("busyDelayMs")(busyDelayMs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(busyMinDurationMs)) __obj.updateDynamic("busyMinDurationMs")(busyMinDurationMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseConfig]
  }
}

