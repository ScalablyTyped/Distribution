package typings.reactBootstrap.listGroupItemMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupItemProps
  extends AllHTMLAttributes[ListGroupItem]
     with ClassAttributes[ListGroupItem] {
  var active: js.UndefOr[js.Any] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var bsStyle: js.UndefOr[String] = js.native
  var eventKey: js.UndefOr[js.Any] = js.native
  var header: js.UndefOr[ReactNode] = js.native
  var listItem: js.UndefOr[Boolean] = js.native
}

object ListGroupItemProps {
  @scala.inline
  def apply(): ListGroupItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupItemProps]
  }
  @scala.inline
  implicit class ListGroupItemPropsOps[Self <: ListGroupItemProps] (val x: Self) extends AnyVal {
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
    def setActive(value: js.Any): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    @scala.inline
    def setEventKey(value: js.Any): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    @scala.inline
    def setHeader(value: ReactNode): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setListItem(value: Boolean): Self = this.set("listItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItem: Self = this.set("listItem", js.undefined)
  }
  
}

