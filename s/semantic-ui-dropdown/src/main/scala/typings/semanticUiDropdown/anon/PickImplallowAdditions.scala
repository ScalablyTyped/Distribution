package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.DropdownSettings._Impl, 'allowAdditions'> */
@js.native
trait PickImplallowAdditions extends js.Object {
  var allowAdditions: Boolean = js.native
}

object PickImplallowAdditions {
  @scala.inline
  def apply(allowAdditions: Boolean): PickImplallowAdditions = {
    val __obj = js.Dynamic.literal(allowAdditions = allowAdditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplallowAdditions]
  }
  @scala.inline
  implicit class PickImplallowAdditionsOps[Self <: PickImplallowAdditions] (val x: Self) extends AnyVal {
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
    def setAllowAdditions(value: Boolean): Self = this.set("allowAdditions", value.asInstanceOf[js.Any])
  }
  
}

