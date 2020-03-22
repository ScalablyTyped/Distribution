package typings.storybookComponents.listItemMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps extends js.Object {
  var LinkWrapper: js.UndefOr[LinkWrapperType] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var center: js.UndefOr[ReactNode] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var href: js.UndefOr[String | js.Object] = js.native
  var left: js.UndefOr[ReactNode] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  var right: js.UndefOr[ReactNode] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object ListItemProps {
  @scala.inline
  def apply(
    LinkWrapper: LinkWrapperType = null,
    active: js.UndefOr[Boolean] = js.undefined,
    center: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String | js.Object = null,
    left: ReactNode = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onClick: () => Unit = null,
    right: ReactNode = null,
    title: ReactNode = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (LinkWrapper != null) __obj.updateDynamic("LinkWrapper")(LinkWrapper.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

