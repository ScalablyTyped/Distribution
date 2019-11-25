package typings.rcDashMenu.esMenuMod

import typings.rcDashMenu.Anon_Item
import typings.rcDashMenu.esInterfaceMod.BuiltinPlacements
import typings.rcDashMenu.esInterfaceMod.DestroyEventHandler
import typings.rcDashMenu.esInterfaceMod.MenuClickEventHandler
import typings.rcDashMenu.esInterfaceMod.MenuInfo
import typings.rcDashMenu.esInterfaceMod.MenuMode
import typings.rcDashMenu.esInterfaceMod.MotionType
import typings.rcDashMenu.esInterfaceMod.OpenAnimation
import typings.rcDashMenu.esInterfaceMod.OpenEventHandler
import typings.rcDashMenu.esInterfaceMod.RenderIconType
import typings.rcDashMenu.esInterfaceMod.SelectEventHandler
import typings.rcDashMenu.esInterfaceMod.SelectInfo
import typings.rcDashMenu.esInterfaceMod.TriggerSubMenuAction
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var activeKey: js.UndefOr[String] = js.undefined
  var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultActiveFirst: js.UndefOr[Boolean] = js.undefined
  var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.undefined
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var expandIcon: js.UndefOr[RenderIconType] = js.undefined
  var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
  var itemIcon: js.UndefOr[RenderIconType] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  /** Menu motion define */
  var motion: js.UndefOr[MotionType] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
  var onDeselect: js.UndefOr[SelectEventHandler] = js.undefined
  var onDestroy: js.UndefOr[DestroyEventHandler] = js.undefined
  var onOpenChange: js.UndefOr[OpenEventHandler] = js.undefined
  var onSelect: js.UndefOr[SelectEventHandler] = js.undefined
  /** @deprecated Please use `motion` instead */
  var openAnimation: js.UndefOr[OpenAnimation] = js.undefined
  var openKeys: js.UndefOr[js.Array[String]] = js.undefined
  /** @deprecated Please use `motion` instead */
  var openTransitionName: js.UndefOr[String] = js.undefined
  var overflowedIndicator: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
  var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
  var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    activeKey: String = null,
    builtinPlacements: BuiltinPlacements = null,
    children: ReactNode = null,
    className: String = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    expandIcon: RenderIconType = null,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: /* node */ HTMLElement => HTMLElement = null,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    mode: MenuMode = null,
    motion: MotionType = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* info */ MenuInfo => Unit = null,
    onDeselect: /* info */ SelectInfo => Unit = null,
    onDestroy: /* key */ Key => Unit = null,
    onOpenChange: /* keys */ js.Array[Key] | Anon_Item => Unit = null,
    onSelect: /* info */ SelectInfo => Unit = null,
    openAnimation: OpenAnimation = null,
    openKeys: js.Array[String] = null,
    openTransitionName: String = null,
    overflowedIndicator: ReactNode = null,
    prefixCls: String = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectedKeys: js.Array[String] = null,
    style: CSSProperties = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    triggerSubMenuAction: TriggerSubMenuAction = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.asInstanceOf[js.Any])
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1(onDestroy))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (openTransitionName != null) __obj.updateDynamic("openTransitionName")(openTransitionName.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

