package typings.rcMenu.anon

import typings.rcMenu.interfaceMod.BuiltinPlacements
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
import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<rc-menu.rc-menu/es/SubPopupMenu.SubPopupMenuProps> */
trait WeakValidationMapSubPopup extends StObject {
  
  var activeKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var builtinPlacements: js.UndefOr[Validator[js.UndefOr[BuiltinPlacements | Null]]] = js.undefined
  
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
  
  var motion: js.UndefOr[Validator[js.UndefOr[CSSMotionProps | Null]]] = js.undefined
  
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
  
  inline def apply(): WeakValidationMapSubPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSubPopup]
  }
  
  extension [Self <: WeakValidationMapSubPopup](x: Self) {
    
    inline def setActiveKey(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    inline def setBuiltinPlacements(value: Validator[js.UndefOr[BuiltinPlacements | Null]]): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
    
    inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
    
    inline def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultActiveFirst(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defaultActiveFirst", value.asInstanceOf[js.Any])
    
    inline def setDefaultActiveFirstUndefined: Self = StObject.set(x, "defaultActiveFirst", js.undefined)
    
    inline def setDefaultOpenKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "defaultOpenKeys", value.asInstanceOf[js.Any])
    
    inline def setDefaultOpenKeysUndefined: Self = StObject.set(x, "defaultOpenKeys", js.undefined)
    
    inline def setDefaultSelectedKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
    
    inline def setDirection(value: Validator[js.UndefOr[ltr | rtl | Null]]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEventKey(value: Validator[js.UndefOr[typings.react.mod.Key | Null]]): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    inline def setExpandIcon(value: Validator[js.UndefOr[Null | RenderIconType]]): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setFocusable(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setForceSubMenuRender(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
    
    inline def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
    
    inline def setId(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInlineIndent(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
    
    inline def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
    
    inline def setItemIcon(value: Validator[js.UndefOr[Null | RenderIconType]]): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
    
    inline def setLevel(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setManualRef(value: Validator[js.UndefOr[LegacyFunctionRef | Null]]): Self = StObject.set(x, "manualRef", value.asInstanceOf[js.Any])
    
    inline def setManualRefUndefined: Self = StObject.set(x, "manualRef", js.undefined)
    
    inline def setMode(value: Validator[js.UndefOr[MenuMode | Null]]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMotion(value: Validator[js.UndefOr[CSSMotionProps | Null]]): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    inline def setMultiple(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOnClick(value: Validator[js.UndefOr[MenuClickEventHandler | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnDeselect(value: Validator[js.UndefOr[Null | SelectEventHandler]]): Self = StObject.set(x, "onDeselect", value.asInstanceOf[js.Any])
    
    inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
    
    inline def setOnDestroy(value: Validator[js.UndefOr[DestroyEventHandler | Null]]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
    
    inline def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
    
    inline def setOnOpenChange(value: Validator[js.UndefOr[Null | OpenEventHandler]]): Self = StObject.set(x, "onOpenChange", value.asInstanceOf[js.Any])
    
    inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
    
    inline def setOnSelect(value: Validator[js.UndefOr[Null | SelectEventHandler]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOpenKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
    
    inline def setOpenKeysUndefined: Self = StObject.set(x, "openKeys", js.undefined)
    
    inline def setOverflowedIndicator(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "overflowedIndicator", value.asInstanceOf[js.Any])
    
    inline def setOverflowedIndicatorUndefined: Self = StObject.set(x, "overflowedIndicator", js.undefined)
    
    inline def setParentMenu(value: Validator[js.UndefOr[Null | ReactInstance]]): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
    
    inline def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
    
    inline def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setRole(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSelectedKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
    
    inline def setStore(value: Validator[js.UndefOr[MiniStore | Null]]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    inline def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSubMenuCloseDelay(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
    
    inline def setSubMenuCloseDelayUndefined: Self = StObject.set(x, "subMenuCloseDelay", js.undefined)
    
    inline def setSubMenuOpenDelay(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
    
    inline def setSubMenuOpenDelayUndefined: Self = StObject.set(x, "subMenuOpenDelay", js.undefined)
    
    inline def setTheme(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTriggerSubMenuAction(value: Validator[js.UndefOr[Null | TriggerSubMenuAction]]): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
    
    inline def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
    
    inline def setVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
