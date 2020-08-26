package typings.semanticUiDropdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.ErrorSettings._Impl, 'alreadySetup'> */
@js.native
trait PickImplalreadySetup extends js.Object {
  var alreadySetup: String = js.native
}

object PickImplalreadySetup {
  @scala.inline
  def apply(alreadySetup: String): PickImplalreadySetup = {
    val __obj = js.Dynamic.literal(alreadySetup = alreadySetup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplalreadySetup]
  }
  @scala.inline
  implicit class PickImplalreadySetupOps[Self <: PickImplalreadySetup] (val x: Self) extends AnyVal {
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
    def setAlreadySetup(value: String): Self = this.set("alreadySetup", value.asInstanceOf[js.Any])
  }
  
}

