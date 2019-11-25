package typings.atStorybookComponents.distTooltipTooltipLinkListMod

import typings.atStorybookComponents.distTooltipListItemMod.LinkWrapperType
import typings.atStorybookComponents.distTooltipListItemMod.ListItemProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends ListItemProps {
  var id: String
  var isGatsby: js.UndefOr[Boolean] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    id: String,
    LinkWrapper: LinkWrapperType = null,
    active: js.UndefOr[Boolean] = js.undefined,
    center: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String | js.Object = null,
    isGatsby: js.UndefOr[Boolean] = js.undefined,
    left: ReactNode = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onClick: () => Unit = null,
    right: ReactNode = null,
    title: ReactNode = null
  ): Link = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(isGatsby)) __obj.updateDynamic("isGatsby")(isGatsby.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

