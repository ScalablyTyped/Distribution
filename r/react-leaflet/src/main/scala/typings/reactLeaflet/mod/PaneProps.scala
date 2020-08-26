package typings.reactLeaflet.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaneProps extends js.Object {
  var children: js.UndefOr[Children] = js.native
  var className: js.UndefOr[String] = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
  var name: js.UndefOr[String] = js.native
  var pane: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object PaneProps {
  @scala.inline
  def apply(): PaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneProps]
  }
  @scala.inline
  implicit class PanePropsOps[Self <: PaneProps] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ReactNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: Children): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setLeaflet(value: LeafletContext): Self = this.set("leaflet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaflet: Self = this.set("leaflet", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPane(value: String): Self = this.set("pane", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

