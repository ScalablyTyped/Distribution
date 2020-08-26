package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.KeySettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'keys'> */
@js.native
trait PickImplkeys extends js.Object {
  var keys: KeySettings = js.native
}

object PickImplkeys {
  @scala.inline
  def apply(keys: KeySettings): PickImplkeys = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplkeys]
  }
  @scala.inline
  implicit class PickImplkeysOps[Self <: PickImplkeys] (val x: Self) extends AnyVal {
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
    def setKeys(value: KeySettings): Self = this.set("keys", value.asInstanceOf[js.Any])
  }
  
}

