package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.semanticUiDropdownBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'delimiter'> */
@js.native
trait PickImpldelimiter extends js.Object {
  var delimiter: Double | `false` = js.native
}

object PickImpldelimiter {
  @scala.inline
  def apply(delimiter: Double | `false`): PickImpldelimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldelimiter]
  }
  @scala.inline
  implicit class PickImpldelimiterOps[Self <: PickImpldelimiter] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: Double | `false`): Self = this.set("delimiter", value.asInstanceOf[js.Any])
  }
  
}

