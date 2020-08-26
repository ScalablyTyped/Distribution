package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import typings.semanticUiDropdown.semanticUiDropdownStrings.auto
import typings.semanticUiDropdown.semanticUiDropdownStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'placeholder'> */
@js.native
trait PickImplplaceholder extends js.Object {
  var placeholder: auto | value | `false` = js.native
}

object PickImplplaceholder {
  @scala.inline
  def apply(placeholder: auto | value | `false`): PickImplplaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholder]
  }
  @scala.inline
  implicit class PickImplplaceholderOps[Self <: PickImplplaceholder] (val x: Self) extends AnyVal {
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
    def setPlaceholder(value: auto | value | `false`): Self = this.set("placeholder", value.asInstanceOf[js.Any])
  }
  
}

