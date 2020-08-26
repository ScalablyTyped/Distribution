package typings.reactForm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioGroupContext extends js.Object {
  var group: FieldApi = js.native
}

object RadioGroupContext {
  @scala.inline
  def apply(group: FieldApi): RadioGroupContext = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupContext]
  }
  @scala.inline
  implicit class RadioGroupContextOps[Self <: RadioGroupContext] (val x: Self) extends AnyVal {
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
    def setGroup(value: FieldApi): Self = this.set("group", value.asInstanceOf[js.Any])
  }
  
}

