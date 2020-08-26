package typings.primereact.panelMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var collapseIcon: js.UndefOr[String] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var expandIcon: js.UndefOr[String] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var id: js.UndefOr[String] = js.native
  var onCollapse: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onExpand: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onToggle: js.UndefOr[js.Function1[/* e */ typings.primereact.anon.Event, Unit]] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var toggleable: js.UndefOr[Boolean] = js.native
}

object PanelProps {
  @scala.inline
  def apply(): PanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelProps]
  }
  @scala.inline
  implicit class PanelPropsOps[Self <: PanelProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCollapseIcon(value: String): Self = this.set("collapseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseIcon: Self = this.set("collapseIcon", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setExpandIcon(value: String): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnCollapse(value: /* event */ Event => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    @scala.inline
    def setOnExpand(value: /* event */ Event => Unit): Self = this.set("onExpand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    @scala.inline
    def setOnToggle(value: /* e */ typings.primereact.anon.Event => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setToggleable(value: Boolean): Self = this.set("toggleable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleable: Self = this.set("toggleable", js.undefined)
  }
  
}

