package typings.primereact.contextMenuMod

import typings.primereact.menuItemMod.MenuItem
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuProps extends js.Object {
  var appendTo: js.UndefOr[js.Any] = js.native
  var autoZIndex: js.UndefOr[Boolean] = js.native
  var baseZIndex: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var global: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var model: js.UndefOr[js.Array[MenuItem]] = js.native
  var onHide: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object ContextMenuProps {
  @scala.inline
  def apply(): ContextMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuProps]
  }
  @scala.inline
  implicit class ContextMenuPropsOps[Self <: ContextMenuProps] (val x: Self) extends AnyVal {
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
    def setAppendTo(value: js.Any): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAutoZIndex(value: Boolean): Self = this.set("autoZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoZIndex: Self = this.set("autoZIndex", js.undefined)
    @scala.inline
    def setBaseZIndex(value: Double): Self = this.set("baseZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseZIndex: Self = this.set("baseZIndex", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setModelVarargs(value: MenuItem*): Self = this.set("model", js.Array(value :_*))
    @scala.inline
    def setModel(value: js.Array[MenuItem]): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setOnHide(value: /* e */ Event => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: /* e */ Event => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

