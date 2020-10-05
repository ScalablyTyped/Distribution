package typings.react.experimentalMod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutConfig extends js.Object {
  /**
    * This timeout (in milliseconds) tells React how long to wait before showing the next state.
    *
    * React will always try to use a shorter lag when network and device allows it.
    *
    * **NOTE: We recommend that you share Suspense Config between different modules.**
    */
  var timeoutMs: Double = js.native
}

object TimeoutConfig {
  @scala.inline
  def apply(timeoutMs: Double): TimeoutConfig = {
    val __obj = js.Dynamic.literal(timeoutMs = timeoutMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutConfig]
  }
  @scala.inline
  implicit class TimeoutConfigOps[Self <: TimeoutConfig] (val x: Self) extends AnyVal {
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
    def setTimeoutMs(value: Double): Self = this.set("timeoutMs", value.asInstanceOf[js.Any])
  }
  
}

