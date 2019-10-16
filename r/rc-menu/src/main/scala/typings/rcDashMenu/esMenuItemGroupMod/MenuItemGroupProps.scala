package typings.rcDashMenu.esMenuItemGroupMod

import typings.rcDashMenu.esInterfaceMod.MenuClickEventHandler
import typings.rcDashMenu.esInterfaceMod.MenuInfo
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
  var rootPrefixCls: js.UndefOr[String] = js.undefined
  var subMenuKey: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  def renderMenuItem(item: ReactElement, index: Double, key: String): ReactElement
}

object MenuItemGroupProps {
  @scala.inline
  def apply(
    renderMenuItem: (ReactElement, Double, String) => ReactElement,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    onClick: /* info */ MenuInfo => Unit = null,
    rootPrefixCls: String = null,
    subMenuKey: String = null,
    title: String = null
  ): MenuItemGroupProps = {
    val __obj = js.Dynamic.literal(renderMenuItem = js.Any.fromFunction3(renderMenuItem))
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls)
    if (subMenuKey != null) __obj.updateDynamic("subMenuKey")(subMenuKey)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MenuItemGroupProps]
  }
}

