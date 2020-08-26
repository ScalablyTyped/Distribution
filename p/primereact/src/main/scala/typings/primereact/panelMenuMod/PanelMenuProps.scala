package typings.primereact.panelMenuMod

import typings.primereact.menuItemMod.MenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanelMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var model: js.UndefOr[js.Array[MenuItem]] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object PanelMenuProps {
  @scala.inline
  def apply(): PanelMenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanelMenuProps]
  }
  @scala.inline
  implicit class PanelMenuPropsOps[Self <: PanelMenuProps] (val x: Self) extends AnyVal {
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
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

