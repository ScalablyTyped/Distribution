package typings.react.experimentalMod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuspenseConfig extends TimeoutConfig {
  var busyDelayMs: js.UndefOr[Double] = js.native
  var busyMinDurationMs: js.UndefOr[Double] = js.native
}

object SuspenseConfig {
  @scala.inline
  def apply(timeoutMs: Double): SuspenseConfig = {
    val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseConfig]
  }
  @scala.inline
  implicit class SuspenseConfigOps[Self <: SuspenseConfig] (val x: Self) extends AnyVal {
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
    def setBusyDelayMs(value: Double): Self = this.set("busyDelayMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusyDelayMs: Self = this.set("busyDelayMs", js.undefined)
    @scala.inline
    def setBusyMinDurationMs(value: Double): Self = this.set("busyMinDurationMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusyMinDurationMs: Self = this.set("busyMinDurationMs", js.undefined)
  }
  
}

