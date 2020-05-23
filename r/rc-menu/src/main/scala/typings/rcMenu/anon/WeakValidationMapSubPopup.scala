package typings.rcMenu.anon

import typings.rcMenu.interfaceMod.DestroyEventHandler
import typings.rcMenu.interfaceMod.LegacyFunctionRef
import typings.rcMenu.interfaceMod.MenuClickEventHandler
import typings.rcMenu.interfaceMod.MenuMode
import typings.rcMenu.interfaceMod.MiniStore
import typings.rcMenu.interfaceMod.OpenEventHandler
import typings.rcMenu.interfaceMod.RenderIconType
import typings.rcMenu.interfaceMod.SelectEventHandler
import typings.rcMenu.interfaceMod.TriggerSubMenuAction
import typings.rcMenu.rcMenuStrings.ltr
import typings.rcMenu.rcMenuStrings.rtl
import typings.react.mod.CSSProperties
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<rc-menu.rc-menu/lib/SubPopupMenu.SubPopupMenuProps> */
trait WeakValidationMapSubPopup extends js.Object {
  var activeKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var builtinPlacements: js.UndefOr[Validator[js.UndefOr[typings.rcMenu.interfaceMod.BuiltinPlacements | Null]]] = js.undefined
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var defaultActiveFirst: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var defaultOpenKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.undefined
  var defaultSelectedKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.undefined
  var direction: js.UndefOr[Validator[js.UndefOr[ltr | rtl | Null]]] = js.undefined
  var eventKey: js.UndefOr[Validator[js.UndefOr[typings.react.mod.Key | Null]]] = js.undefined
  var expandIcon: js.UndefOr[Validator[js.UndefOr[Null | RenderIconType]]] = js.undefined
  var focusable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var forceSubMenuRender: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var inlineIndent: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var itemIcon: js.UndefOr[Validator[js.UndefOr[Null | RenderIconType]]] = js.undefined
  var level: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var manualRef: js.UndefOr[Validator[js.UndefOr[LegacyFunctionRef | Null]]] = js.undefined
  var mode: js.UndefOr[Validator[js.UndefOr[MenuMode | Null]]] = js.undefined
  var motion: js.UndefOr[
    Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ _) | Null
      ]
    ]
  ] = js.undefined
  var multiple: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var onClick: js.UndefOr[Validator[js.UndefOr[MenuClickEventHandler | Null]]] = js.undefined
  var onDeselect: js.UndefOr[Validator[js.UndefOr[Null | SelectEventHandler]]] = js.undefined
  var onDestroy: js.UndefOr[Validator[js.UndefOr[DestroyEventHandler | Null]]] = js.undefined
  var onOpenChange: js.UndefOr[Validator[js.UndefOr[Null | OpenEventHandler]]] = js.undefined
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | SelectEventHandler]]] = js.undefined
  var openKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.undefined
  var overflowedIndicator: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var parentMenu: js.UndefOr[Validator[js.UndefOr[Null | ReactInstance]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var selectedKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.undefined
  var store: js.UndefOr[Validator[js.UndefOr[MiniStore | Null]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  var subMenuCloseDelay: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var subMenuOpenDelay: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
  var theme: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var triggerSubMenuAction: js.UndefOr[Validator[js.UndefOr[Null | TriggerSubMenuAction]]] = js.undefined
  var visible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}

object WeakValidationMapSubPopup {
  @scala.inline
  def apply(
    activeKey: Validator[js.UndefOr[Null | String]] = null,
    builtinPlacements: Validator[js.UndefOr[typings.rcMenu.interfaceMod.BuiltinPlacements | Null]] = null,
    children: Validator[js.UndefOr[Null | ReactNode]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    defaultActiveFirst: Validator[js.UndefOr[Boolean | Null]] = null,
    defaultOpenKeys: Validator[js.UndefOr[js.Array[String] | Null]] = null,
    defaultSelectedKeys: Validator[js.UndefOr[js.Array[String] | Null]] = null,
    direction: Validator[js.UndefOr[ltr | rtl | Null]] = null,
    eventKey: Validator[js.UndefOr[typings.react.mod.Key | Null]] = null,
    expandIcon: Validator[js.UndefOr[Null | RenderIconType]] = null,
    focusable: Validator[js.UndefOr[Boolean | Null]] = null,
    forceSubMenuRender: Validator[js.UndefOr[Boolean | Null]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    inlineIndent: Validator[js.UndefOr[Double | Null]] = null,
    itemIcon: Validator[js.UndefOr[Null | RenderIconType]] = null,
    level: Validator[js.UndefOr[Double | Null]] = null,
    manualRef: Validator[js.UndefOr[LegacyFunctionRef | Null]] = null,
    mode: Validator[js.UndefOr[MenuMode | Null]] = null,
    motion: Validator[
      js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MotionType */ _) | Null
      ]
    ] = null,
    multiple: Validator[js.UndefOr[Boolean | Null]] = null,
    onClick: Validator[js.UndefOr[MenuClickEventHandler | Null]] = null,
    onDeselect: Validator[js.UndefOr[Null | SelectEventHandler]] = null,
    onDestroy: Validator[js.UndefOr[DestroyEventHandler | Null]] = null,
    onOpenChange: Validator[js.UndefOr[Null | OpenEventHandler]] = null,
    onSelect: Validator[js.UndefOr[Null | SelectEventHandler]] = null,
    openKeys: Validator[js.UndefOr[js.Array[String] | Null]] = null,
    overflowedIndicator: Validator[js.UndefOr[Null | ReactNode]] = null,
    parentMenu: Validator[js.UndefOr[Null | ReactInstance]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    role: Validator[js.UndefOr[Null | String]] = null,
    selectedKeys: Validator[js.UndefOr[js.Array[String] | Null]] = null,
    store: Validator[js.UndefOr[MiniStore | Null]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null,
    subMenuCloseDelay: Validator[js.UndefOr[Double | Null]] = null,
    subMenuOpenDelay: Validator[js.UndefOr[Double | Null]] = null,
    theme: Validator[js.UndefOr[Null | String]] = null,
    triggerSubMenuAction: Validator[js.UndefOr[Null | TriggerSubMenuAction]] = null,
    visible: Validator[js.UndefOr[Boolean | Null]] = null
  ): WeakValidationMapSubPopup = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveFirst != null) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.asInstanceOf[js.Any])
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys.asInstanceOf[js.Any])
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(expandIcon.asInstanceOf[js.Any])
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (forceSubMenuRender != null) __obj.updateDynamic("forceSubMenuRender")(forceSubMenuRender.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (itemIcon != null) __obj.updateDynamic("itemIcon")(itemIcon.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (manualRef != null) __obj.updateDynamic("manualRef")(manualRef.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (multiple != null) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(onDeselect.asInstanceOf[js.Any])
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(onOpenChange.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
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
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapSubPopup]
  }
}

