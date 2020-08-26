package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'pageUp'> */
@js.native
trait PickImplpageUp extends js.Object {
  var pageUp: Double = js.native
}

object PickImplpageUp {
  @scala.inline
  def apply(pageUp: Double): PickImplpageUp = {
    val __obj = js.Dynamic.literal(pageUp = pageUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpageUp]
  }
  @scala.inline
  implicit class PickImplpageUpOps[Self <: PickImplpageUp] (val x: Self) extends AnyVal {
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
    def setPageUp(value: Double): Self = this.set("pageUp", value.asInstanceOf[js.Any])
  }
  
}

