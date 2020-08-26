package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, 'hide'> */
@js.native
trait PickImplhide extends js.Object {
  var hide: Double = js.native
}

object PickImplhide {
  @scala.inline
  def apply(hide: Double): PickImplhide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhide]
  }
  @scala.inline
  implicit class PickImplhideOps[Self <: PickImplhide] (val x: Self) extends AnyVal {
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
    def setHide(value: Double): Self = this.set("hide", value.asInstanceOf[js.Any])
  }
  
}

