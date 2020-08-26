package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'sortSelect'> */
@js.native
trait PickImplsortSelect extends js.Object {
  var sortSelect: Boolean = js.native
}

object PickImplsortSelect {
  @scala.inline
  def apply(sortSelect: Boolean): PickImplsortSelect = {
    val __obj = js.Dynamic.literal(sortSelect = sortSelect.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsortSelect]
  }
  @scala.inline
  implicit class PickImplsortSelectOps[Self <: PickImplsortSelect] (val x: Self) extends AnyVal {
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
    def setSortSelect(value: Boolean): Self = this.set("sortSelect", value.asInstanceOf[js.Any])
  }
  
}

