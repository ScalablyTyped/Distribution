package typings.rcMenu

import typings.rcMenu.interfaceMod.BuiltinPlacements
import typings.rcMenu.interfaceMod.DestroyEventHandler
import typings.rcMenu.interfaceMod.LegacyFunctionRef
import typings.rcMenu.interfaceMod.MenuClickEventHandler
import typings.rcMenu.interfaceMod.MenuInfo
import typings.rcMenu.interfaceMod.MenuMode
import typings.rcMenu.interfaceMod.MiniStore
import typings.rcMenu.interfaceMod.OpenEventHandler
import typings.rcMenu.interfaceMod.RenderIconType
import typings.rcMenu.interfaceMod.SelectEventHandler
import typings.rcMenu.interfaceMod.SelectInfo
import typings.rcMenu.interfaceMod.TriggerSubMenuAction
import typings.rcMenu.rcMenuStrings.ltr
import typings.rcMenu.rcMenuStrings.rtl
import typings.rcTrigger.interfaceMod.MotionType
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rc-menu.rc-menu/lib/SubPopupMenu.SubPopupMenuProps> */
trait PartialSubPopupMenuProps extends js.Object {
  var activeKey: js.UndefOr[String] = js.undefined
  var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultActiveFirst: js.UndefOr[Boolean] = js.undefined
  var defaultOpenKeys: js.UndefOr[js.Array[String]] = js.undefined
  var defaultSelectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var eventKey: js.UndefOr[Key] = js.undefined
  var expandIcon: js.UndefOr[RenderIconType] = js.undefined
  var focusable: js.UndefOr[Boolean] = js.undefined
  var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var inlineIndent: js.UndefOr[Double] = js.undefined
  var itemIcon: js.UndefOr[RenderIconType] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var manualRef: js.UndefOr[LegacyFunctionRef] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var motion: js.UndefOr[MotionType] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
  var onDeselect: js.UndefOr[SelectEventHandler] = js.undefined
  var onDestroy: js.UndefOr[DestroyEventHandler] = js.undefined
  var onOpenChange: js.UndefOr[OpenEventHandler] = js.undefined
  var onSelect: js.UndefOr[SelectEventHandler] = js.undefined
  var openKeys: js.UndefOr[js.Array[String]] = js.undefined
  var overflowedIndicator: js.UndefOr[ReactNode] = js.undefined
  var parentMenu: js.UndefOr[ReactInstance] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var store: js.UndefOr[MiniStore] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
  var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PartialSubPopupMenuProps {
  @scala.inline
  def apply(
    activeKey: String = null,
    builtinPlacements: BuiltinPlacements = null,
    children: ReactNode = null,
    className: String = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    defaultOpenKeys: js.Array[String] = null,
    defaultSelectedKeys: js.Array[String] = null,
    direction: ltr | rtl = null,
    eventKey: Key = null,
    expandIcon: RenderIconType = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlineIndent: Int | Double = null,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    manualRef: /* node */ ReactInstance => Unit = null,
    mode: MenuMode = null,
    motion: MotionType = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* info */ MenuInfo => Unit = null,
    onDeselect: /* info */ SelectInfo => Unit = null,
    onDestroy: /* key */ Key => Unit = null,
    onOpenChange: /* keys */ js.Array[Key] | AnonOpen => Unit = null,
    onSelect: /* info */ SelectInfo => Unit = null,
    openKeys: js.Array[String] = null,
    overflowedIndicator: ReactNode = null,
    parentMenu: ReactInstance = null,
    prefixCls: String = null,
    role: String = null,
    selectedKeys: js.Array[String] = null,
    store: MiniStore = null,
    style: CSSProperties = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    theme: String = null,
    triggerSubMenuAction: TriggerSubMenuAction = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PartialSubPopupMenuProps = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.asInstanceOf[js.Any])
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(js.Any.fromFunction1(manualRef))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1(onDestroy))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSubPopupMenuProps]
  }
}

