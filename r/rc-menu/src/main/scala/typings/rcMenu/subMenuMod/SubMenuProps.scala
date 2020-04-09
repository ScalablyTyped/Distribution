package typings.rcMenu.subMenuMod

import typings.rcMenu.AnonDomEvent
import typings.rcMenu.AnonHover
import typings.rcMenu.AnonKey
import typings.rcMenu.AnonOpen
import typings.rcMenu.ReactElementisRootMenuboo
import typings.rcMenu.interfaceMod.BuiltinPlacements
import typings.rcMenu.interfaceMod.DestroyEventHandler
import typings.rcMenu.interfaceMod.HoverEventHandler
import typings.rcMenu.interfaceMod.LegacyFunctionRef
import typings.rcMenu.interfaceMod.MenuClickEventHandler
import typings.rcMenu.interfaceMod.MenuHoverEventHandler
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
import typings.react.mod.Key
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubMenuProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[String] = js.undefined
  var expandIcon: js.UndefOr[RenderIconType] = js.undefined
  var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
  var inlineIndent: js.UndefOr[Double] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
  var itemIcon: js.UndefOr[RenderIconType] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var manualRef: js.UndefOr[LegacyFunctionRef] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var motion: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any
  ] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
  var onDeselect: js.UndefOr[SelectEventHandler] = js.undefined
  var onDestroy: js.UndefOr[DestroyEventHandler] = js.undefined
  var onItemHover: js.UndefOr[HoverEventHandler] = js.undefined
  var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onOpenChange: js.UndefOr[OpenEventHandler] = js.undefined
  var onSelect: js.UndefOr[SelectEventHandler] = js.undefined
  var onTitleClick: js.UndefOr[js.Function1[/* info */ AnonDomEvent, Unit]] = js.undefined
  var onTitleMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var onTitleMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
  var openKeys: js.UndefOr[js.Array[String]] = js.undefined
  var parentMenu: js.UndefOr[ReactElementisRootMenuboo] = js.undefined
  var popupClassName: js.UndefOr[String] = js.undefined
  var popupOffset: js.UndefOr[js.Array[Double]] = js.undefined
  var rootPrefixCls: js.UndefOr[String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var store: js.UndefOr[MiniStore] = js.undefined
  var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
  var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.undefined
}

object SubMenuProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    builtinPlacements: BuiltinPlacements = null,
    children: ReactNode = null,
    className: String = null,
    direction: ltr | rtl = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    eventKey: String = null,
    expandIcon: RenderIconType = null,
    forceSubMenuRender: js.UndefOr[Boolean] = js.undefined,
    inlineIndent: Int | Double = null,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemIcon: RenderIconType = null,
    level: Int | Double = null,
    manualRef: /* node */ ReactInstance => Unit = null,
    mode: MenuMode = null,
    motion: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ js.Any = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onClick: /* info */ MenuInfo => Unit = null,
    onDeselect: /* info */ SelectInfo => Unit = null,
    onDestroy: /* key */ Key => Unit = null,
    onItemHover: /* info */ AnonHover => Unit = null,
    onMouseEnter: /* info */ AnonKey => Unit = null,
    onMouseLeave: /* info */ AnonKey => Unit = null,
    onOpenChange: /* keys */ js.Array[Key] | AnonOpen => Unit = null,
    onSelect: /* info */ SelectInfo => Unit = null,
    onTitleClick: /* info */ AnonDomEvent => Unit = null,
    onTitleMouseEnter: /* info */ AnonKey => Unit = null,
    onTitleMouseLeave: /* info */ AnonKey => Unit = null,
    openKeys: js.Array[String] = null,
    parentMenu: ReactElementisRootMenuboo = null,
    popupClassName: String = null,
    popupOffset: js.Array[Double] = null,
    rootPrefixCls: String = null,
    selectedKeys: js.Array[String] = null,
    store: MiniStore = null,
    subMenuCloseDelay: Int | Double = null,
    subMenuOpenDelay: Int | Double = null,
    title: ReactNode = null,
    triggerSubMenuAction: TriggerSubMenuAction = null
  ): SubMenuProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSubMenuRender)) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(js.Any.fromFunction1(manualRef))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(js.Any.fromFunction1(onDestroy))
    if (onItemHover != null) __obj.updateDynamic("onItemHover")(js.Any.fromFunction1(onItemHover))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1(onTitleClick))
    if (onTitleMouseEnter != null) __obj.updateDynamic("onTitleMouseEnter")(js.Any.fromFunction1(onTitleMouseEnter))
    if (onTitleMouseLeave != null) __obj.updateDynamic("onTitleMouseLeave")(js.Any.fromFunction1(onTitleMouseLeave))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu.asInstanceOf[js.Any])
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName.asInstanceOf[js.Any])
    if (popupOffset != null) __obj.updateDynamic("popupOffset")(popupOffset.asInstanceOf[js.Any])
    if (rootPrefixCls != null) __obj.updateDynamic("rootPrefixCls")(rootPrefixCls.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerSubMenuAction != null) __obj.updateDynamic("triggerSubMenuAction")(triggerSubMenuAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubMenuProps]
  }
}

