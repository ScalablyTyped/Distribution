package typings.storybookComponents.tooltipLinkListMod

import typings.storybookComponents.listItemMod.ListItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link extends ListItemProps {
  var id: String = js.native
  var isGatsby: js.UndefOr[Boolean] = js.native
}

object Link {
  @scala.inline
  def apply(id: String): Link = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGatsby(value: Boolean): Self = this.set("isGatsby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGatsby: Self = this.set("isGatsby", js.undefined)
  }
  
}

