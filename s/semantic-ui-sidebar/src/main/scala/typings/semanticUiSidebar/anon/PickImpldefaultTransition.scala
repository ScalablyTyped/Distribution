package typings.semanticUiSidebar.anon

import typings.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.SidebarSettings._Impl, 'defaultTransition'> */
@js.native
trait PickImpldefaultTransition extends js.Object {
  var defaultTransition: DefaultTransitionSettings = js.native
}

object PickImpldefaultTransition {
  @scala.inline
  def apply(defaultTransition: DefaultTransitionSettings): PickImpldefaultTransition = {
    val __obj = js.Dynamic.literal(defaultTransition = defaultTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldefaultTransition]
  }
  @scala.inline
  implicit class PickImpldefaultTransitionOps[Self <: PickImpldefaultTransition] (val x: Self) extends AnyVal {
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
    def setDefaultTransition(value: DefaultTransitionSettings): Self = this.set("defaultTransition", value.asInstanceOf[js.Any])
  }
  
}

