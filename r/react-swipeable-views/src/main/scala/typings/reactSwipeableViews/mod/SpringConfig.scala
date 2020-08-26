package typings.reactSwipeableViews.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringConfig extends js.Object {
  var delay: String = js.native
  var duration: String = js.native
  var easeFunction: String = js.native
}

object SpringConfig {
  @scala.inline
  def apply(delay: String, duration: String, easeFunction: String): SpringConfig = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easeFunction = easeFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringConfig]
  }
  @scala.inline
  implicit class SpringConfigOps[Self <: SpringConfig] (val x: Self) extends AnyVal {
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
    def setDelay(value: String): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEaseFunction(value: String): Self = this.set("easeFunction", value.asInstanceOf[js.Any])
  }
  
}

