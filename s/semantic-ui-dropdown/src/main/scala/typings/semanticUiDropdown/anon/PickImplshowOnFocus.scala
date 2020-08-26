package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'showOnFocus'> */
@js.native
trait PickImplshowOnFocus extends js.Object {
  var showOnFocus: Boolean = js.native
}

object PickImplshowOnFocus {
  @scala.inline
  def apply(showOnFocus: Boolean): PickImplshowOnFocus = {
    val __obj = js.Dynamic.literal(showOnFocus = showOnFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowOnFocus]
  }
  @scala.inline
  implicit class PickImplshowOnFocusOps[Self <: PickImplshowOnFocus] (val x: Self) extends AnyVal {
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
    def setShowOnFocus(value: Boolean): Self = this.set("showOnFocus", value.asInstanceOf[js.Any])
  }
  
}

