package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'minCharacters'> */
@js.native
trait PickImplminCharacters extends js.Object {
  var minCharacters: Double = js.native
}

object PickImplminCharacters {
  @scala.inline
  def apply(minCharacters: Double): PickImplminCharacters = {
    val __obj = js.Dynamic.literal(minCharacters = minCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplminCharacters]
  }
  @scala.inline
  implicit class PickImplminCharactersOps[Self <: PickImplminCharacters] (val x: Self) extends AnyVal {
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
    def setMinCharacters(value: Double): Self = this.set("minCharacters", value.asInstanceOf[js.Any])
  }
  
}

