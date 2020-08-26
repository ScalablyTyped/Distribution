package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.MessageSettings._Impl, 'addResult'> */
@js.native
trait PickImpladdResult extends js.Object {
  var addResult: String = js.native
}

object PickImpladdResult {
  @scala.inline
  def apply(addResult: String): PickImpladdResult = {
    val __obj = js.Dynamic.literal(addResult = addResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpladdResult]
  }
  @scala.inline
  implicit class PickImpladdResultOps[Self <: PickImpladdResult] (val x: Self) extends AnyVal {
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
    def setAddResult(value: String): Self = this.set("addResult", value.asInstanceOf[js.Any])
  }
  
}

