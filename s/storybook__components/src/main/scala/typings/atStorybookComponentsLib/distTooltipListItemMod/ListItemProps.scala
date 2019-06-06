package typings
package atStorybookComponentsLib.distTooltipListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends js.Object {
  var LinkWrapper: js.UndefOr[LinkWrapperType] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var center: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var href: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var left: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var right: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    LinkWrapper: LinkWrapperType = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    center: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String | js.Object = null,
    left: reactLib.reactMod.ReactNode = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: () => scala.Unit = null,
    right: reactLib.reactMod.ReactNode = null,
    title: reactLib.reactMod.ReactNode = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

