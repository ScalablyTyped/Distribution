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
  def apply(links: js.Array[Link], LinkWrapper: LinkWrapperType = null): TooltipLinkListProps = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipLinkListProps]
  }
}

