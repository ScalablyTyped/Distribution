package typings.semanticUiForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-form.SemanticUI.Form.SelectorSettings._Impl, 'group'> */
@js.native
trait PickImplgroup extends js.Object {
  var group: String = js.native
}

object PickImplgroup {
  @scala.inline
  def apply(group: String): PickImplgroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplgroup]
  }
  @scala.inline
  implicit class PickImplgroupOps[Self <: PickImplgroup] (val x: Self) extends AnyVal {
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
  }
  
}

