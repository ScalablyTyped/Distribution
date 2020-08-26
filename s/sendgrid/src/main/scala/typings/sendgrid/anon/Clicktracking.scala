package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clicktracking extends js.Object {
  var click_tracking: js.Any = js.native
  var ganalytics: js.Any = js.native
  var open_tracking: js.Any = js.native
  var subscription_tracking: js.Any = js.native
}

object Clicktracking {
  @scala.inline
  def apply(click_tracking: js.Any, ganalytics: js.Any, open_tracking: js.Any, subscription_tracking: js.Any): Clicktracking = {
    val __obj = js.Dynamic.literal(click_tracking = click_tracking.asInstanceOf[js.Any], ganalytics = ganalytics.asInstanceOf[js.Any], open_tracking = open_tracking.asInstanceOf[js.Any], subscription_tracking = subscription_tracking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clicktracking]
  }
  @scala.inline
  implicit class ClicktrackingOps[Self <: Clicktracking] (val x: Self) extends AnyVal {
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
    def setClick_tracking(value: js.Any): Self = this.set("click_tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setGanalytics(value: js.Any): Self = this.set("ganalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen_tracking(value: js.Any): Self = this.set("open_tracking", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription_tracking(value: js.Any): Self = this.set("subscription_tracking", value.asInstanceOf[js.Any])
  }
  
}

