package typings.rcDashMenu.esMenuItemMod

import typings.rcDashMenu.Anon_DomEventKey
import typings.rcDashMenu.Anon_Hover
import typings.rcDashMenu.esInterfaceMod.DestroyEventHandler
import typings.rcDashMenu.esInterfaceMod.HoverEventHandler
import typings.rcDashMenu.esInterfaceMod.LegacyFunctionRef
import typings.rcDashMenu.esInterfaceMod.MenuClickEventHandler
import typings.rcDashMenu.esInterfaceMod.MenuHoverEventHandler
import typings.rcDashMenu.esInterfaceMod.MenuInfo
import typings.rcDashMenu.esInterfaceMod.MenuMode
import typings.rcDashMenu.esInterfaceMod.RenderIconType
import typings.rcDashMenu.esInterfaceMod.SelectEventHandler
import typings.rcDashMenu.esInterfaceMod.SelectInfo
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.ReactInstance
import typings.react.reactMod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  /** @deprecated No place to use this. Should remove */
  var attribute: js.UndefOr[Record[String, String]] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[Key] = js.undefined
  var inlineIndent: js.UndefOr[Double] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var itemIcon: js.UndefOr[RenderIconType] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var manualRef: js.UndefOr[LegacyFunctionRef] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
  var onDeselect: js.UndefOr[SelectEventHandler] = js.undefined
  var onDestroy: js.UndefOr[DestroyEventHandler] = js.undefined
  var onItemHover: js.UndefOr[HoverEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onSelect: js.UndefOr[SelectEventHandler] = js.undefined
  var parentMenu: js.UndefOr[ReactInstance] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rootPrefixCls: js.UndefOr[String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object MenuItemProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    attribute: Record[String, String] = null,
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    eventKey: Key = null,
    inlineIndent: Int | Double = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    manualRef: /* node */ ReactInstance => Unit = null,
    mode: MenuMode = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* info */ MenuInfo => Unit = null,
    onDeselect: /* info */ SelectInfo => Unit = null,
    onDestroy: /* key */ Key => Unit = null,
    onItemHover: /* info */ Anon_Hover => Unit = null,
    onMouseEnter: /* info */ Anon_DomEventKey => Unit = null,
    onMouseLeave: /* info */ Anon_DomEventKey => Unit = null,
    onSelect: /* info */ SelectInfo => Unit = null,
    parentMenu: ReactInstance = null,
    role: String = null,
    rootPrefixCls: String = null,
    selectedKeys: js.Array[String] = null,
    style: CSSProperties = null,
    title: String = null
  ): MenuItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (attribute != null) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(js.Any.fromFunction1(manualRef))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1(onDestroy))
    if (onItemHover != null) __obj.updateDynamic("onItemHover")(js.Any.fromFunction1(onItemHover))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
}

