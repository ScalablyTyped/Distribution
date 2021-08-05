package typings.rcMenu

import typings.rcMenu.anon.DomEvent
import typings.rcMenu.anon.Hover
import typings.rcMenu.anon.Item
import typings.rcMenu.anon.Mode
import typings.rcMenu.anon.Open
import typings.rcMenu.anon.ReactElementisRootMenuboo
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
import typings.rcMenu.menuItemMod.MenuItem
import typings.rcMenu.rcMenuStrings.ltr
import typings.rcMenu.rcMenuStrings.rtl
import typings.rcMenu.subPopupMenuMod.SubPopupMenuProps
import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subMenuMod {
  
  @JSImport("rc-menu/es/SubMenu", JSImport.Default)
  @js.native
  val default: js.Any = js.native
  
  @JSImport("rc-menu/es/SubMenu", "SubMenu")
  @js.native
  class SubMenu protected ()
    extends Component[SubMenuProps, SubMenuState, js.Any] {
    def this(props: SubMenuProps) = this()
    
    def addKeyPath(info: MenuInfo): Item = js.native
    
    def adjustWidth(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSubMenu(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSubMenu(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSubMenu(): Unit = js.native
    
    def getActiveClassName(): String = js.native
    
    def getBaseProps(): SubPopupMenuProps = js.native
    
    def getDisabledClassName(): String = js.native
    
    def getMode(): MenuMode = js.native
    
    def getMotion(mode: MenuMode, visible: Boolean): CSSMotionProps = js.native
    
    def getOpenClassName(): String = js.native
    
    def getPrefixCls(): String = js.native
    
    def getSelectedClassName(): String = js.native
    
    def getVisible(): Boolean = js.native
    
    var haveOpened: Boolean = js.native
    
    var haveRendered: Boolean = js.native
    
    var internalMenuId: String = js.native
    
    def isChildrenSelected(): Boolean = js.native
    
    def isInlineMode(): Boolean = js.native
    
    var isRootMenu: Boolean = js.native
    
    var menuInstance: MenuItem = js.native
    
    /**
      * Follow timeout should be `number`.
      * Current is only convert code into TS,
      * we not use `window.setTimeout` instead of `setTimeout`.
      */
    var minWidthTimeout: js.Any = js.native
    
    var mouseenterTimeout: js.Any = js.native
    
    var onDeselect: SelectEventHandler = js.native
    
    def onDestroy(key: String): Unit = js.native
    
    /**
      * note:
      *  This legacy code that `onKeyDown` is called by parent instead of dom self.
      *  which need return code to check if this event is handled
      */
    var onKeyDown: KeyboardEventHandler[HTMLElement] = js.native
    
    var onMouseEnter: MouseEventHandler[HTMLElement] = js.native
    
    var onMouseLeave: MouseEventHandler[HTMLElement] = js.native
    
    var onOpenChange: OpenEventHandler = js.native
    
    def onPopupVisibleChange(visible: Boolean): Unit = js.native
    
    var onSelect: SelectEventHandler = js.native
    
    def onSubMenuClick(info: MenuInfo): Unit = js.native
    
    def onTitleClick(e: KeyboardEvent[HTMLElement]): Unit = js.native
    def onTitleClick(e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit = js.native
    
    var onTitleMouseEnter: MouseEventHandler[HTMLElement] = js.native
    
    var onTitleMouseLeave: MouseEventHandler[HTMLElement] = js.native
    
    def renderChildren(): Element = js.native
    
    def renderPopupMenu(className: String): Element = js.native
    def renderPopupMenu(className: String, style: CSSProperties): Element = js.native
    
    def saveMenuInstance(c: MenuItem): Unit = js.native
    
    def saveSubMenuTitle(subMenuTitle: HTMLElement): Unit = js.native
    
    var subMenuTitle: HTMLElement = js.native
    
    def triggerOpenChange(open: Boolean): Unit = js.native
    def triggerOpenChange(open: Boolean, `type`: String): Unit = js.native
    
    var updateStateRaf: Double = js.native
  }
  /* static members */
  object SubMenu {
    
    @JSImport("rc-menu/es/SubMenu", "SubMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-menu/es/SubMenu", "SubMenu.defaultProps")
    @js.native
    def defaultProps: Mode = js.native
    inline def defaultProps_=(x: Mode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait SubMenuProps extends StObject {
    
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
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.undefined
    
    var onDeselect: js.UndefOr[SelectEventHandler] = js.undefined
    
    var onDestroy: js.UndefOr[DestroyEventHandler] = js.undefined
    
    var onItemHover: js.UndefOr[HoverEventHandler] = js.undefined
    
    var onMouseEnter: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onMouseLeave: js.UndefOr[MenuHoverEventHandler] = js.undefined
    
    var onOpenChange: js.UndefOr[OpenEventHandler] = js.undefined
    
    var onSelect: js.UndefOr[SelectEventHandler] = js.undefined
    
    var onTitleClick: js.UndefOr[js.Function1[/* info */ DomEvent, Unit]] = js.undefined
    
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
    
    inline def apply(): SubMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubMenuProps]
    }
    
    extension [Self <: SubMenuProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBuiltinPlacements(value: BuiltinPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEventKey(value: String): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconFunction1(value: /* props */ js.Any => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setForceSubMenuRender(value: Boolean): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
      
      inline def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
      
      inline def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
      
      inline def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      inline def setItemIconFunction1(value: /* props */ js.Any => ReactNode): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setManualRef(value: /* node */ ReactInstance => Unit): Self = StObject.set(x, "manualRef", js.Any.fromFunction1(value))
      
      inline def setManualRefUndefined: Self = StObject.set(x, "manualRef", js.undefined)
      
      inline def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnDeselect(value: /* info */ SelectInfo => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnDestroy(value: /* key */ Key => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1(value))
      
      inline def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      inline def setOnItemHover(value: /* info */ Hover => Unit): Self = StObject.set(x, "onItemHover", js.Any.fromFunction1(value))
      
      inline def setOnItemHoverUndefined: Self = StObject.set(x, "onItemHover", js.undefined)
      
      inline def setOnMouseEnter(value: /* info */ typings.rcMenu.anon.Key => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: /* info */ typings.rcMenu.anon.Key => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnOpenChange(value: /* keys */ js.Array[Key] | Open => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnSelect(value: /* info */ SelectInfo => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnTitleClick(value: /* info */ DomEvent => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction1(value))
      
      inline def setOnTitleClickUndefined: Self = StObject.set(x, "onTitleClick", js.undefined)
      
      inline def setOnTitleMouseEnter(value: /* info */ typings.rcMenu.anon.Key => Unit): Self = StObject.set(x, "onTitleMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnTitleMouseEnterUndefined: Self = StObject.set(x, "onTitleMouseEnter", js.undefined)
      
      inline def setOnTitleMouseLeave(value: /* info */ typings.rcMenu.anon.Key => Unit): Self = StObject.set(x, "onTitleMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnTitleMouseLeaveUndefined: Self = StObject.set(x, "onTitleMouseLeave", js.undefined)
      
      inline def setOpenKeys(value: js.Array[String]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
      
      inline def setOpenKeysUndefined: Self = StObject.set(x, "openKeys", js.undefined)
      
      inline def setOpenKeysVarargs(value: String*): Self = StObject.set(x, "openKeys", js.Array(value :_*))
      
      inline def setParentMenu(value: ReactElementisRootMenuboo): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
      
      inline def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
      
      inline def setPopupClassName(value: String): Self = StObject.set(x, "popupClassName", value.asInstanceOf[js.Any])
      
      inline def setPopupClassNameUndefined: Self = StObject.set(x, "popupClassName", js.undefined)
      
      inline def setPopupOffset(value: js.Array[Double]): Self = StObject.set(x, "popupOffset", value.asInstanceOf[js.Any])
      
      inline def setPopupOffsetUndefined: Self = StObject.set(x, "popupOffset", js.undefined)
      
      inline def setPopupOffsetVarargs(value: Double*): Self = StObject.set(x, "popupOffset", js.Array(value :_*))
      
      inline def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      inline def setStore(value: MiniStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setSubMenuCloseDelay(value: Double): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setSubMenuCloseDelayUndefined: Self = StObject.set(x, "subMenuCloseDelay", js.undefined)
      
      inline def setSubMenuOpenDelay(value: Double): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setSubMenuOpenDelayUndefined: Self = StObject.set(x, "subMenuOpenDelay", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
      
      inline def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
    }
  }
  
  trait SubMenuState extends StObject {
    
    var isOpen: Boolean
    
    var mode: MenuMode
  }
  object SubMenuState {
    
    inline def apply(isOpen: Boolean, mode: MenuMode): SubMenuState = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubMenuState]
    }
    
    extension [Self <: SubMenuState](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
