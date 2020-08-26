package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option extends js.Object {
  var option: js.Object = js.native
  var originalEvent: typings.std.Event = js.native
}

object Option {
  @scala.inline
  def apply(option: js.Object, originalEvent: typings.std.Event): Option = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
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
    def setOption(value: js.Object): Self = this.set("option", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalEvent(value: typings.std.Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
  }
  
}

