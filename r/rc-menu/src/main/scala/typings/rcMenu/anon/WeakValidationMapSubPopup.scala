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
import typings.rcTrigger.interfaceMod.MotionType
import typings.react.mod.CSSProperties
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<rc-menu.rc-menu/es/SubPopupMenu.SubPopupMenuProps> */
@js.native
trait WeakValidationMapSubPopup extends js.Object {
  var activeKey: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var builtinPlacements: js.UndefOr[Validator[js.UndefOr[typings.rcMenu.interfaceMod.BuiltinPlacements | Null]]] = js.native
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var defaultActiveFirst: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var defaultOpenKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.native
  var defaultSelectedKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.native
  var direction: js.UndefOr[Validator[js.UndefOr[ltr | rtl | Null]]] = js.native
  var eventKey: js.UndefOr[Validator[js.UndefOr[typings.react.mod.Key | Null]]] = js.native
  var expandIcon: js.UndefOr[Validator[js.UndefOr[Null | RenderIconType]]] = js.native
  var focusable: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var forceSubMenuRender: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var inlineIndent: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var itemIcon: js.UndefOr[Validator[js.UndefOr[Null | RenderIconType]]] = js.native
  var level: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var manualRef: js.UndefOr[Validator[js.UndefOr[LegacyFunctionRef | Null]]] = js.native
  var mode: js.UndefOr[Validator[js.UndefOr[MenuMode | Null]]] = js.native
  var motion: js.UndefOr[Validator[js.UndefOr[MotionType | Null]]] = js.native
  var multiple: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  var onClick: js.UndefOr[Validator[js.UndefOr[MenuClickEventHandler | Null]]] = js.native
  var onDeselect: js.UndefOr[Validator[js.UndefOr[Null | SelectEventHandler]]] = js.native
  var onDestroy: js.UndefOr[Validator[js.UndefOr[DestroyEventHandler | Null]]] = js.native
  var onOpenChange: js.UndefOr[Validator[js.UndefOr[Null | OpenEventHandler]]] = js.native
  var onSelect: js.UndefOr[Validator[js.UndefOr[Null | SelectEventHandler]]] = js.native
  var openKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.native
  var overflowedIndicator: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.native
  var parentMenu: js.UndefOr[Validator[js.UndefOr[Null | ReactInstance]]] = js.native
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var role: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var selectedKeys: js.UndefOr[Validator[js.UndefOr[js.Array[String] | Null]]] = js.native
  var store: js.UndefOr[Validator[js.UndefOr[MiniStore | Null]]] = js.native
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.native
  var subMenuCloseDelay: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var subMenuOpenDelay: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  var theme: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  var triggerSubMenuAction: js.UndefOr[Validator[js.UndefOr[Null | TriggerSubMenuAction]]] = js.native
  var visible: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
}

object WeakValidationMapSubPopup {
  @scala.inline
  def apply(): WeakValidationMapSubPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapSubPopup]
  }
  @scala.inline
  implicit class WeakValidationMapSubPopupOps[Self <: WeakValidationMapSubPopup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveKey(value: Validator[js.UndefOr[Null | String]]): Self = this.set("activeKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveKey: Self = this.set("activeKey", js.undefined)
    @scala.inline
    def setBuiltinPlacements(value: Validator[js.UndefOr[typings.rcMenu.interfaceMod.BuiltinPlacements | Null]]): Self = this.set("builtinPlacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltinPlacements: Self = this.set("builtinPlacements", js.undefined)
    @scala.inline
    def setChildren(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultActiveFirst(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("defaultActiveFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActiveFirst: Self = this.set("defaultActiveFirst", js.undefined)
    @scala.inline
    def setDefaultOpenKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = this.set("defaultOpenKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpenKeys: Self = this.set("defaultOpenKeys", js.undefined)
    @scala.inline
    def setDefaultSelectedKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = this.set("defaultSelectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedKeys: Self = this.set("defaultSelectedKeys", js.undefined)
    @scala.inline
    def setDirection(value: Validator[js.UndefOr[ltr | rtl | Null]]): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEventKey(value: Validator[js.UndefOr[typings.react.mod.Key | Null]]): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    @scala.inline
    def setExpandIcon(value: Validator[js.UndefOr[Null | RenderIconType]]): Self = this.set("expandIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandIcon: Self = this.set("expandIcon", js.undefined)
    @scala.inline
    def setFocusable(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    @scala.inline
    def setForceSubMenuRender(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("forceSubMenuRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSubMenuRender: Self = this.set("forceSubMenuRender", js.undefined)
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInlineIndent(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("inlineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineIndent: Self = this.set("inlineIndent", js.undefined)
    @scala.inline
    def setItemIcon(value: Validator[js.UndefOr[Null | RenderIconType]]): Self = this.set("itemIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemIcon: Self = this.set("itemIcon", js.undefined)
    @scala.inline
    def setLevel(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setManualRef(value: Validator[js.UndefOr[LegacyFunctionRef | Null]]): Self = this.set("manualRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualRef: Self = this.set("manualRef", js.undefined)
    @scala.inline
    def setMode(value: Validator[js.UndefOr[MenuMode | Null]]): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMotion(value: Validator[js.UndefOr[MotionType | Null]]): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotion: Self = this.set("motion", js.undefined)
    @scala.inline
    def setMultiple(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[MenuClickEventHandler | Null]]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnDeselect(value: Validator[js.UndefOr[Null | SelectEventHandler]]): Self = this.set("onDeselect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    @scala.inline
    def setOnDestroy(value: Validator[js.UndefOr[DestroyEventHandler | Null]]): Self = this.set("onDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDestroy: Self = this.set("onDestroy", js.undefined)
    @scala.inline
    def setOnOpenChange(value: Validator[js.UndefOr[Null | OpenEventHandler]]): Self = this.set("onOpenChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOpenChange: Self = this.set("onOpenChange", js.undefined)
    @scala.inline
    def setOnSelect(value: Validator[js.UndefOr[Null | SelectEventHandler]]): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOpenKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = this.set("openKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenKeys: Self = this.set("openKeys", js.undefined)
    @scala.inline
    def setOverflowedIndicator(value: Validator[js.UndefOr[Null | ReactNode]]): Self = this.set("overflowedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowedIndicator: Self = this.set("overflowedIndicator", js.undefined)
    @scala.inline
    def setParentMenu(value: Validator[js.UndefOr[Null | ReactInstance]]): Self = this.set("parentMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentMenu: Self = this.set("parentMenu", js.undefined)
    @scala.inline
    def setPrefixCls(value: Validator[js.UndefOr[Null | String]]): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    @scala.inline
    def setRole(value: Validator[js.UndefOr[Null | String]]): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSelectedKeys(value: Validator[js.UndefOr[js.Array[String] | Null]]): Self = this.set("selectedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedKeys: Self = this.set("selectedKeys", js.undefined)
    @scala.inline
    def setStore(value: Validator[js.UndefOr[MiniStore | Null]]): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setStyle(value: Validator[js.UndefOr[CSSProperties | Null]]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSubMenuCloseDelay(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("subMenuCloseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenuCloseDelay: Self = this.set("subMenuCloseDelay", js.undefined)
    @scala.inline
    def setSubMenuOpenDelay(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("subMenuOpenDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubMenuOpenDelay: Self = this.set("subMenuOpenDelay", js.undefined)
    @scala.inline
    def setTheme(value: Validator[js.UndefOr[Null | String]]): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTriggerSubMenuAction(value: Validator[js.UndefOr[Null | TriggerSubMenuAction]]): Self = this.set("triggerSubMenuAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerSubMenuAction: Self = this.set("triggerSubMenuAction", js.undefined)
    @scala.inline
    def setVisible(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

