package typings.reactForm.anon

import typings.reactForm.mod.FieldApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  var group: FieldApi = js.native
}

object Group {
  @scala.inline
  def apply(group: FieldApi): Group = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
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

