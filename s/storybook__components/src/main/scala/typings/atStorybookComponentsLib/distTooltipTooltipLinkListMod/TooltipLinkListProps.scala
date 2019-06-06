package typings
package atStorybookComponentsLib.distTooltipTooltipLinkListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipLinkListProps extends js.Object {
  var LinkWrapper: js.UndefOr[atStorybookComponentsLib.distTooltipListItemMod.LinkWrapperType] = js.undefined
  var links: js.Array[Link]
}

object TooltipLinkListProps {
  @scala.inline
  def apply(
    links: js.Array[Link],
    LinkWrapper: atStorybookComponentsLib.distTooltipListItemMod.LinkWrapperType = null
  ): TooltipLinkListProps = {
    val __obj = js.Dynamic.literal(links = links)
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper)
    __obj.asInstanceOf[TooltipLinkListProps]
  }
}

