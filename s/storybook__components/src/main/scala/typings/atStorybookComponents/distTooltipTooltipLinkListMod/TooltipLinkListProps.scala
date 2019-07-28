package typings.atStorybookComponents.distTooltipTooltipLinkListMod

import typings.atStorybookComponents.distTooltipListItemMod.LinkWrapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipLinkListProps extends js.Object {
  var LinkWrapper: js.UndefOr[LinkWrapperType] = js.undefined
  var links: js.Array[Link]
}

object TooltipLinkListProps {
  @scala.inline
  def apply(links: js.Array[Link], LinkWrapper: LinkWrapperType = null): TooltipLinkListProps = {
    val __obj = js.Dynamic.literal(links = links)
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper)
    __obj.asInstanceOf[TooltipLinkListProps]
  }
}

