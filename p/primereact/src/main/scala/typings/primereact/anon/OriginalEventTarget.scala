package typings.primereact.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalEventTarget extends js.Object {
  var originalEvent: typings.std.Event = js.native
  var target: Name = js.native
  var value: Date | js.Array[Date] = js.native
}

object OriginalEventTarget {
  @scala.inline
  def apply(originalEvent: typings.std.Event, target: Name, value: Date | js.Array[Date]): OriginalEventTarget = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventTarget]
  }
  @scala.inline
  implicit class OriginalEventTargetOps[Self <: OriginalEventTarget] (val x: Self) extends AnyVal {
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
    def setOriginalEvent(value: typings.std.Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Name): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: Date*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Date | js.Array[Date]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

