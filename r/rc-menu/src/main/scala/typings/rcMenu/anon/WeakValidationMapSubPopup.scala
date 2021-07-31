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
  
  @scala.inline
  def apply(): WeakValidationMapSubPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSubPopup]
  }
  
  @scala.inline
  implicit class WeakValidationMapSubPopupMutableBuilder[Self <: WeakValidationMapSubPopup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveKey(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
    
    @scala.inline
    def setBuiltinPlacements(value: Validator[js.UndefOr[BuiltinPlacements | Null]]): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
    
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDefaultActiveFirst(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "defaultActiveFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActiveFirstUndefined: Self = StObject.set(x, "defaultActiveFirst", js.undefined)
    
    @scala.inline
    def setDefaultOpenKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "defaultOpenKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOpenKeysUndefined: Self = StObject.set(x, "defaultOpenKeys", js.undefined)
    
    @scala.inline
    def setDefaultSelectedKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
    
    @scala.inline
    def setDirection(value: Validator[js.UndefOr[ltr | rtl | Null]]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setEventKey(value: Validator[js.UndefOr[typings.react.mod.Key | Null]]): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
    
    @scala.inline
    def setExpandIcon(value: Validator[js.UndefOr[Null | RenderIconType]]): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    @scala.inline
    def setFocusable(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def setForceSubMenuRender(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
    
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInlineIndent(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
    
    @scala.inline
    def setItemIcon(value: Validator[js.UndefOr[Null | RenderIconType]]): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
    
    @scala.inline
    def setLevel(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setManualRef(value: Validator[js.UndefOr[LegacyFunctionRef | Null]]): Self = StObject.set(x, "manualRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualRefUndefined: Self = StObject.set(x, "manualRef", js.undefined)
    
    @scala.inline
    def setMode(value: Validator[js.UndefOr[MenuMode | Null]]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMotion(value: Validator[js.UndefOr[CSSMotionProps | Null]]): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    @scala.inline
    def setMultiple(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[MenuClickEventHandler | Null]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnDeselect(value: Validator[js.UndefOr[Null | SelectEventHandler]]): Self = StObject.set(x, "onDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
    
    @scala.inline
    def setOnDestroy(value: Validator[js.UndefOr[DestroyEventHandler | Null]]): Self = StObject.set(x, "onDestroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
    
    @scala.inline
    def setOnOpenChange(value: Validator[js.UndefOr[Null | OpenEventHandler]]): Self = StObject.set(x, "onOpenChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
    
    @scala.inline
    def setOnSelect(value: Validator[js.UndefOr[Null | SelectEventHandler]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOpenKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenKeysUndefined: Self = StObject.set(x, "openKeys", js.undefined)
    
    @scala.inline
    def setOverflowedIndicator(value: Validator[js.UndefOr[Null | ReactNode]]): Self = StObject.set(x, "overflowedIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowedIndicatorUndefined: Self = StObject.set(x, "overflowedIndicator", js.undefined)
    
    @scala.inline
    def setParentMenu(value: Validator[js.UndefOr[Null | ReactInstance]]): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    @scala.inline
    def setRole(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSelectedKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
    
    @scala.inline
    def setStore(value: Validator[js.UndefOr[MiniStore | Null]]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSubMenuCloseDelay(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuCloseDelayUndefined: Self = StObject.set(x, "subMenuCloseDelay", js.undefined)
    
    @scala.inline
    def setSubMenuOpenDelay(value: Validator[js.UndefOr[Double | Null]]): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubMenuOpenDelayUndefined: Self = StObject.set(x, "subMenuOpenDelay", js.undefined)
    
    @scala.inline
    def setTheme(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTriggerSubMenuAction(value: Validator[js.UndefOr[Null | TriggerSubMenuAction]]): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
    
    @scala.inline
    def setVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
