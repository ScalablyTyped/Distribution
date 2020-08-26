package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ClassNameSettings._Impl, 'placeholder'> */
@js.native
trait PickImplplaceholderPlaceholder extends js.Object {
  var placeholder: String = js.native
}

object PickImplplaceholderPlaceholder {
  @scala.inline
  def apply(placeholder: String): PickImplplaceholderPlaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplplaceholderPlaceholder]
  }
  @scala.inline
  implicit class PickImplplaceholderPlaceholderOps[Self <: PickImplplaceholderPlaceholder] (val x: Self) extends AnyVal {
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
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
  }
  
}

