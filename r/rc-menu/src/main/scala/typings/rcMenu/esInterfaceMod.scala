package typings.rcMenu

import typings.rcMenu.anon.DomEvent
import typings.rcMenu.rcMenuStrings.divider
import typings.rcMenu.rcMenuStrings.group
import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.std.FocusOptions
import typings.std.HTMLElement
import typings.std.HTMLUListElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  type BuiltinPlacements = Record[String, Any]
  
  trait ItemSharedProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ItemSharedProps {
    
    inline def apply(): ItemSharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemSharedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemSharedProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcMenu.esInterfaceMod.SubMenuType
    - typings.rcMenu.esInterfaceMod.MenuItemType
    - typings.rcMenu.esInterfaceMod.MenuItemGroupType
    - typings.rcMenu.esInterfaceMod.MenuDividerType
    - scala.Null
  */
  type ItemType = _ItemType | Null
  
  type MenuClickEventHandler = js.Function1[/* info */ MenuInfo, Unit]
  
  trait MenuDividerType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var `type`: divider
  }
  object MenuDividerType {
    
    inline def apply(): MenuDividerType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("divider")
      __obj.asInstanceOf[MenuDividerType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuDividerType] (val x: Self) extends AnyVal {
      
      inline def setType(value: divider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type MenuHoverEventHandler = js.Function1[/* info */ DomEvent, Unit]
  
  trait MenuInfo extends StObject {
    
    var domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]
    
    /** @deprecated This will not support in future. You should avoid to use this */
    var item: ReactInstance
    
    var key: String
    
    var keyPath: js.Array[String]
  }
  object MenuInfo {
    
    inline def apply(
      domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement],
      item: ReactInstance,
      key: String,
      keyPath: js.Array[String]
    ): MenuInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuInfo] (val x: Self) extends AnyVal {
      
      inline def setDomEvent(value: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyPath(value: js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value*))
    }
  }
  
  trait MenuItemGroupType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var children: js.UndefOr[js.Array[ItemType]] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var `type`: group
  }
  object MenuItemGroupType {
    
    inline def apply(): MenuItemGroupType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[MenuItemGroupType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemGroupType] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[ItemType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ItemType*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuItemType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var itemIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var key: Key
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
    
    var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
  }
  object MenuItemType {
    
    inline def apply(key: Key): MenuItemType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemType] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      inline def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcMenu.rcMenuStrings.horizontal
    - typings.rcMenu.rcMenuStrings.vertical
    - typings.rcMenu.rcMenuStrings.`inline`
  */
  trait MenuMode extends StObject
  object MenuMode {
    
    inline def horizontal: typings.rcMenu.rcMenuStrings.horizontal = "horizontal".asInstanceOf[typings.rcMenu.rcMenuStrings.horizontal]
    
    inline def `inline`: typings.rcMenu.rcMenuStrings.`inline` = "inline".asInstanceOf[typings.rcMenu.rcMenuStrings.`inline`]
    
    inline def vertical: typings.rcMenu.rcMenuStrings.vertical = "vertical".asInstanceOf[typings.rcMenu.rcMenuStrings.vertical]
  }
  
  @js.native
  trait MenuRef extends StObject {
    
    /**
      * Focus active child if any, or the first child which is not disabled will be focused.
      * @param options
      */
    def focus(): Unit = js.native
    def focus(options: FocusOptions): Unit = js.native
    
    var list: HTMLUListElement = js.native
  }
  
  trait MenuTitleInfo extends StObject {
    
    var domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]
    
    var key: String
  }
  object MenuTitleInfo {
    
    inline def apply(domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], key: String): MenuTitleInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuTitleInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuTitleInfo] (val x: Self) extends AnyVal {
      
      inline def setDomEvent(value: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenderIconInfo extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var isSubMenu: js.UndefOr[Boolean] = js.undefined
  }
  object RenderIconInfo {
    
    inline def apply(): RenderIconInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderIconInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderIconInfo] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setIsSubMenu(value: Boolean): Self = StObject.set(x, "isSubMenu", value.asInstanceOf[js.Any])
      
      inline def setIsSubMenuUndefined: Self = StObject.set(x, "isSubMenu", js.undefined)
    }
  }
  
  type RenderIconType = ReactNode | (js.Function1[/* props */ RenderIconInfo, ReactNode])
  
  type SelectEventHandler = js.Function1[/* info */ SelectInfo, Unit]
  
  trait SelectInfo
    extends StObject
       with MenuInfo {
    
    var selectedKeys: js.Array[String]
  }
  object SelectInfo {
    
    inline def apply(
      domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement],
      item: ReactInstance,
      key: String,
      keyPath: js.Array[String],
      selectedKeys: js.Array[String]
    ): SelectInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectInfo] (val x: Self) extends AnyVal {
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    }
  }
  
  trait SubMenuType
    extends StObject
       with ItemSharedProps
       with _ItemType {
    
    var children: js.Array[ItemType]
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expandIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var itemIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var key: String
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
    
    var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onTitleClick: js.UndefOr[js.Function1[/* info */ MenuTitleInfo, Unit]] = js.undefined
    
    var onTitleMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onTitleMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var popupClassName: js.UndefOr[String] = js.undefined
    
    var popupOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
  }
  object SubMenuType {
    
    inline def apply(children: js.Array[ItemType], key: String): SubMenuType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubMenuType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubMenuType] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[ItemType]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ItemType*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      inline def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTitleClick(value: /* info */ MenuTitleInfo => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1(value))
      
      inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
      
      inline def setOnTitleMouseEnter(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onTitleMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnTitleMouseEnterUndefined: Self = StObject.set(x, "onTitleMouseEnter", js.undefined)
      
      inline def setOnTitleMouseLeave(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onTitleMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnTitleMouseLeaveUndefined: Self = StObject.set(x, "onTitleMouseLeave", js.undefined)
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupOffset(value: js.Array[Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      inline def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      inline def setPopupOffsetVarargs(value: Double*): Self = StObject.set(x, "popupOffset", js.Array(value*))
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcMenu.rcMenuStrings.click
    - typings.rcMenu.rcMenuStrings.hover
  */
  trait TriggerSubMenuAction extends StObject
  object TriggerSubMenuAction {
    
    inline def click: typings.rcMenu.rcMenuStrings.click = "click".asInstanceOf[typings.rcMenu.rcMenuStrings.click]
    
    inline def hover: typings.rcMenu.rcMenuStrings.hover = "hover".asInstanceOf[typings.rcMenu.rcMenuStrings.hover]
  }
  
  trait _ItemType extends StObject
  object _ItemType {
    
    inline def MenuDividerType(): typings.rcMenu.esInterfaceMod.MenuDividerType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("divider")
      __obj.asInstanceOf[typings.rcMenu.esInterfaceMod.MenuDividerType]
    }
    
    inline def MenuItemGroupType(): typings.rcMenu.esInterfaceMod.MenuItemGroupType = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("group")
      __obj.asInstanceOf[typings.rcMenu.esInterfaceMod.MenuItemGroupType]
    }
    
    inline def MenuItemType(key: Key): typings.rcMenu.esInterfaceMod.MenuItemType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcMenu.esInterfaceMod.MenuItemType]
    }
    
    inline def SubMenuType(children: js.Array[ItemType], key: String): typings.rcMenu.esInterfaceMod.SubMenuType = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rcMenu.esInterfaceMod.SubMenuType]
    }
  }
}
