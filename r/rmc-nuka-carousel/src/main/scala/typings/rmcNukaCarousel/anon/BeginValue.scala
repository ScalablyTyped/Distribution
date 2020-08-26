package typings.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginValue extends js.Object {
  var beginValue: js.Any = js.native
  var delay: js.Any = js.native
  var duration: js.Any = js.native
  var easing: js.Any = js.native
  var endValue: js.Any = js.native
  var onEnd: js.Any = js.native
  var stackBehavior: js.Any = js.native
}

object BeginValue {
  @scala.inline
  def apply(
    beginValue: js.Any,
    delay: js.Any,
    duration: js.Any,
    easing: js.Any,
    endValue: js.Any,
    onEnd: js.Any,
    stackBehavior: js.Any
  ): BeginValue = {
    val __obj = js.Dynamic.literal(beginValue = beginValue.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], endValue = endValue.asInstanceOf[js.Any], onEnd = onEnd.asInstanceOf[js.Any], stackBehavior = stackBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginValue]
  }
  @scala.inline
  implicit class BeginValueOps[Self <: BeginValue] (val x: Self) extends AnyVal {
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
    def setBeginValue(value: js.Any): Self = this.set("beginValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: js.Any): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: js.Any): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEasing(value: js.Any): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndValue(value: js.Any): Self = this.set("endValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnEnd(value: js.Any): Self = this.set("onEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackBehavior(value: js.Any): Self = this.set("stackBehavior", value.asInstanceOf[js.Any])
  }
  
}

