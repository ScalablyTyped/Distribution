package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'delaySetup'> */
@js.native
trait PickImpldelaySetup extends js.Object {
  var delaySetup: Boolean = js.native
}

object PickImpldelaySetup {
  @scala.inline
  def apply(delaySetup: Boolean): PickImpldelaySetup = {
    val __obj = js.Dynamic.literal(delaySetup = delaySetup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldelaySetup]
  }
  @scala.inline
  implicit class PickImpldelaySetupOps[Self <: PickImpldelaySetup] (val x: Self) extends AnyVal {
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
    def setDelaySetup(value: Boolean): Self = this.set("delaySetup", value.asInstanceOf[js.Any])
  }
  
}

