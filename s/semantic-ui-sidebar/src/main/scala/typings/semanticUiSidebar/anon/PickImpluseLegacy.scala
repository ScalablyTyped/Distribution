package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.semanticUiSidebarStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'useLegacy'> */
@js.native
trait PickImpluseLegacy extends js.Object {
  var useLegacy: auto | Boolean = js.native
}

object PickImpluseLegacy {
  @scala.inline
  def apply(useLegacy: auto | Boolean): PickImpluseLegacy = {
    val __obj = js.Dynamic.literal(useLegacy = useLegacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluseLegacy]
  }
  @scala.inline
  implicit class PickImpluseLegacyOps[Self <: PickImpluseLegacy] (val x: Self) extends AnyVal {
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
    def setUseLegacy(value: auto | Boolean): Self = this.set("useLegacy", value.asInstanceOf[js.Any])
  }
  
}

