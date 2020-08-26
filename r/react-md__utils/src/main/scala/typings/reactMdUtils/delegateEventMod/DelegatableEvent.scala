package typings.reactMdUtils.delegateEventMod

import typings.std.AddEventListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegatableEvent extends js.Object {
  var handler: DelegatedEventHandler = js.native
  var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.native
  var target: DelegatedEventTarget = js.native
  var throttle: Boolean = js.native
  var `type`: String = js.native
}

object DelegatableEvent {
  @scala.inline
  def apply(handler: DelegatedEventHandler, target: DelegatedEventTarget, throttle: Boolean, `type`: String): DelegatableEvent = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegatableEvent]
  }
  @scala.inline
  implicit class DelegatableEventOps[Self <: DelegatableEvent] (val x: Self) extends AnyVal {
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
    def setHandler(value: DelegatedEventHandler): Self = this.set("handler", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: DelegatedEventTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrottle(value: Boolean): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Boolean | AddEventListenerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

