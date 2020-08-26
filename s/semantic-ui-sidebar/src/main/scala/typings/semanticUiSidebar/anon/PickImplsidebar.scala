package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.SelectorSettings._Impl, 'sidebar'> */
@js.native
trait PickImplsidebar extends js.Object {
  var sidebar: String = js.native
}

object PickImplsidebar {
  @scala.inline
  def apply(sidebar: String): PickImplsidebar = {
    val __obj = js.Dynamic.literal(sidebar = sidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsidebar]
  }
  @scala.inline
  implicit class PickImplsidebarOps[Self <: PickImplsidebar] (val x: Self) extends AnyVal {
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
    def setSidebar(value: String): Self = this.set("sidebar", value.asInstanceOf[js.Any])
  }
  
}

