package typings.reactLeafletSidebarv2.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarProps extends js.Object {
  var children: TabType = js.native
  var closeIcon: js.UndefOr[Icon] = js.native
  var collapsed: Boolean = js.native
  var id: String = js.native
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
  var position: Position = js.native
  var selected: String = js.native
}

object SidebarProps {
  @scala.inline
  def apply(children: TabType, collapsed: Boolean, id: String, position: Position, selected: String): SidebarProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarProps]
  }
  @scala.inline
  implicit class SidebarPropsOps[Self <: SidebarProps] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReactElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: TabType): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseIcon(value: Icon): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnOpen(value: /* id */ String => Unit): Self = this.set("onOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
  }
  
}

