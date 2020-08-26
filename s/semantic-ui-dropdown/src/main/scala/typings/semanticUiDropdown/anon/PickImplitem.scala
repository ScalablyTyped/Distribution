package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'item'> */
@js.native
trait PickImplitem extends js.Object {
  var item: String = js.native
}

object PickImplitem {
  @scala.inline
  def apply(item: String): PickImplitem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplitem]
  }
  @scala.inline
  implicit class PickImplitemOps[Self <: PickImplitem] (val x: Self) extends AnyVal {
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
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

