package typings.storybookComponents.tooltipLinkListMod

import typings.storybookComponents.listItemMod.LinkWrapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipLinkListProps extends js.Object {
  var LinkWrapper: js.UndefOr[LinkWrapperType] = js.native
  var links: js.Array[Link] = js.native
}

object TooltipLinkListProps {
  @scala.inline
  def apply(links: js.Array[Link]): TooltipLinkListProps = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipLinkListProps]
  }
  @scala.inline
  implicit class TooltipLinkListPropsOps[Self <: TooltipLinkListProps] (val x: Self) extends AnyVal {
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
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkWrapper(value: LinkWrapperType): Self = this.set("LinkWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkWrapper: Self = this.set("LinkWrapper", js.undefined)
  }
  
}

