package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.SelectorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'selector'> */
@js.native
trait PickImplselector extends js.Object {
  var selector: SelectorSettings = js.native
}

object PickImplselector {
  @scala.inline
  def apply(selector: SelectorSettings): PickImplselector = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplselector]
  }
  @scala.inline
  implicit class PickImplselectorOps[Self <: PickImplselector] (val x: Self) extends AnyVal {
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
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
  
}

