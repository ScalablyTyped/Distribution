package typings.rcMenu

import typings.rcMenu.anon.Children
import typings.rcMenu.anon.ClassName
import typings.rcMenu.anon.Open
import typings.rcMenu.anon.PartialSubPopupMenuProps
import typings.rcMenu.anon.WeakValidationMapSubPopup
import typings.rcMenu.interfaceMod.BuiltinPlacements
import typings.rcMenu.interfaceMod.DestroyEventHandler
import typings.rcMenu.interfaceMod.HoverEventHandler
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
import typings.rcMenu.menuItemMod.MenuItem
import typings.rcMenu.menuItemMod.MenuItemProps
import typings.rcMenu.rcMenuStrings.ltr
import typings.rcMenu.rcMenuStrings.rtl
import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ValidationMap
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subPopupMenuMod {
  
  @JSImport("rc-menu/es/SubPopupMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-menu/es/SubPopupMenu", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SubPopupMenuProps, js.Any, js.Any] {
    def this(props: SubPopupMenuProps) = this()
    def this(props: SubPopupMenuProps, context: js.Any) = this()
  }
  /* Inlined react.react.ComponentClass<rc-menu.rc-menu/es/SubPopupMenu.SubPopupMenuProps, any> & {getWrappedInstance (): rc-menu.rc-menu/es/SubPopupMenu.SubPopupMenu} */
  object default {
    
    @JSImport("rc-menu/es/SubPopupMenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-menu/es/SubPopupMenu", "default.childContextTypes")
    @js.native
    def childContextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def childContextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/SubPopupMenu", "default.contextType")
    @js.native
    def contextType: js.UndefOr[Context[js.Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/SubPopupMenu", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/SubPopupMenu", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSubPopupMenuProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialSubPopupMenuProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/SubPopupMenu", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/SubPopupMenu", "default.getDerivedStateFromError")
    @js.native
    def getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[SubPopupMenuProps, js.Any]] = js.native
    inline def getDerivedStateFromError_=(x: js.UndefOr[GetDerivedStateFromError[SubPopupMenuProps, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
    
    @JSImport("rc-menu/es/SubPopupMenu", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[SubPopupMenuProps, js.Any]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[GetDerivedStateFromProps[SubPopupMenuProps, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
    
    inline def getWrappedInstance(): SubPopupMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("getWrappedInstance")().asInstanceOf[SubPopupMenu]
    
    @JSImport("rc-menu/es/SubPopupMenu", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSubPopup] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapSubPopup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-menu/es/SubPopupMenu", "SubPopupMenu")
  @js.native
  class SubPopupMenu protected ()
    extends Component[SubPopupMenuProps, js.Object, js.Any] {
    def this(props: SubPopupMenuProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MSubPopupMenu(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSubPopupMenu(prevProps: SubPopupMenuProps): Unit = js.native
    
    def getFlatInstanceArray(): js.Array[MenuItem] = js.native
    
    var instanceArray: js.Array[MenuItem] = js.native
    
    var onClick: MenuClickEventHandler = js.native
    
    var onDeselect: SelectEventHandler = js.native
    
    var onDestroy: DestroyEventHandler = js.native
    
    var onItemHover: HoverEventHandler = js.native
    
    /**
      * all keyboard events callbacks run from here at first
      *
      * note:
      *  This legacy code that `onKeyDown` is called by parent instead of dom self.
      *  which need return code to check if this event is handled
      */
    def onKeyDown(e: KeyboardEvent[HTMLElement], callback: js.Function1[/* item */ MenuItem, Unit]): Double = js.native
    
    var onOpenChange: OpenEventHandler = js.native
    
    var onSelect: SelectEventHandler = js.native
    
    def renderCommonMenuItem(child: ReactElement, i: Double, extraProps: MenuItemProps): ReactElement = js.native
    
    def renderMenuItem(c: ReactElement, i: Double, subMenuKey: Key): ReactElement = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MSubPopupMenu(nextProps: SubPopupMenuProps): Boolean = js.native
    
    def step(direction: Double): MenuItem = js.native
  }
  /* static members */
  object SubPopupMenu {
    
    @JSImport("rc-menu/es/SubPopupMenu", "SubPopupMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-menu/es/SubPopupMenu", "SubPopupMenu.defaultProps")
    @js.native
    def defaultProps: ClassName = js.native
    inline def defaultProps_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def getActiveKey(props: Children, originalActiveKey: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveKey")(props.asInstanceOf[js.Any], originalActiveKey.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def saveRef(c: ReactInstance): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveRef")(c.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait SubPopupMenuProps extends StObject {
    
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
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
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
  object SubPopupMenuProps {
    
    inline def apply(): SubPopupMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubPopupMenuProps]
    }
    
    extension [Self <: SubPopupMenuProps](x: Self) {
      
      inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setBuiltinPlacements(value: BuiltinPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultActiveFirst(value: Boolean): Self = StObject.set(x, "defaultActiveFirst", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveFirstUndefined: Self = StObject.set(x, "defaultActiveFirst", js.undefined)
      
      inline def setDefaultOpenKeys(value: js.Array[String]): Self = StObject.set(x, "defaultOpenKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenKeysUndefined: Self = StObject.set(x, "defaultOpenKeys", js.undefined)
      
      inline def setDefaultOpenKeysVarargs(value: String*): Self = StObject.set(x, "defaultOpenKeys", js.Array(value :_*))
      
      inline def setDefaultSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "defaultSelectedKeys", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedKeysUndefined: Self = StObject.set(x, "defaultSelectedKeys", js.undefined)
      
      inline def setDefaultSelectedKeysVarargs(value: String*): Self = StObject.set(x, "defaultSelectedKeys", js.Array(value :_*))
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEventKey(value: Key): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconFunction1(value: /* props */ js.Any => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setForceSubMenuRender(value: Boolean): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
      
      inline def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
      
      inline def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
      
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
      
      inline def setOnOpenChange(value: /* keys */ js.Array[Key] | Open => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnSelect(value: /* info */ SelectInfo => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOpenKeys(value: js.Array[String]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
      
      inline def setOpenKeysUndefined: Self = StObject.set(x, "openKeys", js.undefined)
      
      inline def setOpenKeysVarargs(value: String*): Self = StObject.set(x, "openKeys", js.Array(value :_*))
      
      inline def setOverflowedIndicator(value: ReactNode): Self = StObject.set(x, "overflowedIndicator", value.asInstanceOf[js.Any])
      
      inline def setOverflowedIndicatorUndefined: Self = StObject.set(x, "overflowedIndicator", js.undefined)
      
      inline def setParentMenu(value: ReactInstance): Self = StObject.set(x, "parentMenu", value.asInstanceOf[js.Any])
      
      inline def setParentMenuUndefined: Self = StObject.set(x, "parentMenu", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
      
      inline def setStore(value: MiniStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubMenuCloseDelay(value: Double): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setSubMenuCloseDelayUndefined: Self = StObject.set(x, "subMenuCloseDelay", js.undefined)
      
      inline def setSubMenuOpenDelay(value: Double): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setSubMenuOpenDelayUndefined: Self = StObject.set(x, "subMenuOpenDelay", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
      
      inline def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
