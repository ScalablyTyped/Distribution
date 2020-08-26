package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'escape'> */
@js.native
trait PickImplescape extends js.Object {
  var escape: Double = js.native
}

object PickImplescape {
  @scala.inline
  def apply(escape: Double): PickImplescape = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplescape]
  }
  @scala.inline
  implicit class PickImplescapeOps[Self <: PickImplescape] (val x: Self) extends AnyVal {
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
    def setEscape(value: Double): Self = this.set("escape", value.asInstanceOf[js.Any])
  }
  
}

