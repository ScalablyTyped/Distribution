package typings.pulumiAws.outputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultActionForwardStickiness extends js.Object {
  /**
    * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
    */
  var duration: Double = js.native
  /**
    * Indicates whether target group stickiness is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object ListenerDefaultActionForwardStickiness {
  @scala.inline
  def apply(duration: Double): ListenerDefaultActionForwardStickiness = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionForwardStickiness]
  }
  @scala.inline
  implicit class ListenerDefaultActionForwardStickinessOps[Self <: ListenerDefaultActionForwardStickiness] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

