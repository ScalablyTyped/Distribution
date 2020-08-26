package typings.semanticUiSidebar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'movedSidebar'> */
@js.native
trait PickImplmovedSidebar extends js.Object {
  var movedSidebar: String = js.native
}

object PickImplmovedSidebar {
  @scala.inline
  def apply(movedSidebar: String): PickImplmovedSidebar = {
    val __obj = js.Dynamic.literal(movedSidebar = movedSidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmovedSidebar]
  }
  @scala.inline
  implicit class PickImplmovedSidebarOps[Self <: PickImplmovedSidebar] (val x: Self) extends AnyVal {
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
    def setMovedSidebar(value: String): Self = this.set("movedSidebar", value.asInstanceOf[js.Any])
  }
  
}

