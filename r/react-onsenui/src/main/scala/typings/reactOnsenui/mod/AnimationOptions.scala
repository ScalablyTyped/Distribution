package typings.reactOnsenui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var timing: js.UndefOr[String] = js.native
}

object AnimationOptions {
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setTiming(value: String): Self = this.set("timing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
  }
  
}

