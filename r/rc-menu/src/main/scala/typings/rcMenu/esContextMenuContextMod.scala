package typings.rcMenu

import typings.rcMenu.anon.PartialkeyinMenuModeother
import typings.rcMenu.esInterfaceMod.BuiltinPlacements
import typings.rcMenu.esInterfaceMod.MenuClickEventHandler
import typings.rcMenu.esInterfaceMod.MenuInfo
import typings.rcMenu.esInterfaceMod.MenuMode
import typings.rcMenu.esInterfaceMod.RenderIconInfo
import typings.rcMenu.esInterfaceMod.RenderIconType
import typings.rcMenu.esInterfaceMod.TriggerSubMenuAction
import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMenuContextMod {
  
  @JSImport("rc-menu/es/context/MenuContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildrenLockedRestProps: InheritableContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenLockedRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-menu/es/context/MenuContext", "MenuContext")
  @js.native
  val MenuContext: Context[MenuContextProps] = js.native
  
  /* Inlined parent std.Partial<rc-menu.rc-menu/es/context/MenuContext.MenuContextProps> */
  trait InheritableContextProps extends StObject {
    
    var activeKey: js.UndefOr[String] = js.undefined
    
    var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultMotions: js.UndefOr[PartialkeyinMenuModeother] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expandIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var inlineIndent: js.UndefOr[Double] = js.undefined
    
    var itemIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var locked: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[MenuMode] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var onActive: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
    
    var onInactive: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
    
    var onItemClick: js.UndefOr[MenuClickEventHandler] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function2[/* key */ String, /* open */ Boolean, Unit]] = js.undefined
    
    var openKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var overflowDisabled: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var subMenuCloseDelay: js.UndefOr[Double] = js.undefined
    
    var subMenuOpenDelay: js.UndefOr[Double] = js.undefined
    
    var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.undefined
  }
  object InheritableContextProps {
    
    inline def apply(): InheritableContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InheritableContextProps]
    }
    
    extension [Self <: InheritableContextProps](x: Self) {
      
      inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setBuiltinPlacements(value: BuiltinPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultMotions(value: PartialkeyinMenuModeother): Self = StObject.set(x, "defaultMotions", value.asInstanceOf[js.Any])
      
      inline def setDefaultMotionsUndefined: Self = StObject.set(x, "defaultMotions", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setForceSubMenuRender(value: Boolean): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
      
      inline def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
      
      inline def setGetPopupContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
      
      inline def setInlineIndentUndefined: Self = StObject.set(x, "inlineIndent", js.undefined)
      
      inline def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      inline def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      inline def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOnActive(value: /* key */ String => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
      
      inline def setOnInactive(value: /* key */ String => Unit): Self = StObject.set(x, "onInactive", js.Any.fromFunction1(value))
      
      inline def setOnInactiveUndefined: Self = StObject.set(x, "onInactive", js.undefined)
      
      inline def setOnItemClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnOpenChange(value: (/* key */ String, /* open */ Boolean) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOpenKeys(value: js.Array[String]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
      
      inline def setOpenKeysUndefined: Self = StObject.set(x, "openKeys", js.undefined)
      
      inline def setOpenKeysVarargs(value: String*): Self = StObject.set(x, "openKeys", js.Array(value*))
      
      inline def setOverflowDisabled(value: Boolean): Self = StObject.set(x, "overflowDisabled", value.asInstanceOf[js.Any])
      
      inline def setOverflowDisabledUndefined: Self = StObject.set(x, "overflowDisabled", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setSubMenuCloseDelay(value: Double): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setSubMenuCloseDelayUndefined: Self = StObject.set(x, "subMenuCloseDelay", js.undefined)
      
      inline def setSubMenuOpenDelay(value: Double): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setSubMenuOpenDelayUndefined: Self = StObject.set(x, "subMenuOpenDelay", js.undefined)
      
      inline def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
      
      inline def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
    }
  }
  
  trait MenuContextProps extends StObject {
    
    var activeKey: String
    
    var builtinPlacements: js.UndefOr[BuiltinPlacements] = js.undefined
    
    var defaultMotions: js.UndefOr[PartialkeyinMenuModeother] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var expandIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var forceSubMenuRender: js.UndefOr[Boolean] = js.undefined
    
    def getPopupContainer(node: HTMLElement): HTMLElement
    
    var inlineIndent: Double
    
    var itemIcon: js.UndefOr[RenderIconType] = js.undefined
    
    var mode: MenuMode
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    def onActive(key: String): Unit
    
    def onInactive(key: String): Unit
    
    var onItemClick: MenuClickEventHandler
    
    def onOpenChange(key: String, open: Boolean): Unit
    
    var openKeys: js.Array[String]
    
    var overflowDisabled: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: String
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var selectedKeys: js.Array[String]
    
    var subMenuCloseDelay: Double
    
    var subMenuOpenDelay: Double
    
    var triggerSubMenuAction: js.UndefOr[TriggerSubMenuAction] = js.undefined
  }
  object MenuContextProps {
    
    inline def apply(
      activeKey: String,
      getPopupContainer: HTMLElement => HTMLElement,
      inlineIndent: Double,
      mode: MenuMode,
      onActive: String => Unit,
      onInactive: String => Unit,
      onItemClick: /* info */ MenuInfo => Unit,
      onOpenChange: (String, Boolean) => Unit,
      openKeys: js.Array[String],
      prefixCls: String,
      selectedKeys: js.Array[String],
      subMenuCloseDelay: Double,
      subMenuOpenDelay: Double
    ): MenuContextProps = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], getPopupContainer = js.Any.fromFunction1(getPopupContainer), inlineIndent = inlineIndent.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onActive = js.Any.fromFunction1(onActive), onInactive = js.Any.fromFunction1(onInactive), onItemClick = js.Any.fromFunction1(onItemClick), onOpenChange = js.Any.fromFunction2(onOpenChange), openKeys = openKeys.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], subMenuCloseDelay = subMenuCloseDelay.asInstanceOf[js.Any], subMenuOpenDelay = subMenuOpenDelay.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuContextProps]
    }
    
    extension [Self <: MenuContextProps](x: Self) {
      
      inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacements(value: BuiltinPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setDefaultMotions(value: PartialkeyinMenuModeother): Self = StObject.set(x, "defaultMotions", value.asInstanceOf[js.Any])
      
      inline def setDefaultMotionsUndefined: Self = StObject.set(x, "defaultMotions", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpandIcon(value: RenderIconType): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      inline def setExpandIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setForceSubMenuRender(value: Boolean): Self = StObject.set(x, "forceSubMenuRender", value.asInstanceOf[js.Any])
      
      inline def setForceSubMenuRenderUndefined: Self = StObject.set(x, "forceSubMenuRender", js.undefined)
      
      inline def setGetPopupContainer(value: HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setInlineIndent(value: Double): Self = StObject.set(x, "inlineIndent", value.asInstanceOf[js.Any])
      
      inline def setItemIcon(value: RenderIconType): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
      
      inline def setItemIconFunction1(value: /* props */ RenderIconInfo => ReactNode): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
      
      inline def setItemIconUndefined: Self = StObject.set(x, "itemIcon", js.undefined)
      
      inline def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOnActive(value: String => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      inline def setOnInactive(value: String => Unit): Self = StObject.set(x, "onInactive", js.Any.fromFunction1(value))
      
      inline def setOnItemClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      inline def setOnOpenChange(value: (String, Boolean) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      inline def setOpenKeys(value: js.Array[String]): Self = StObject.set(x, "openKeys", value.asInstanceOf[js.Any])
      
      inline def setOpenKeysVarargs(value: String*): Self = StObject.set(x, "openKeys", js.Array(value*))
      
      inline def setOverflowDisabled(value: Boolean): Self = StObject.set(x, "overflowDisabled", value.asInstanceOf[js.Any])
      
      inline def setOverflowDisabledUndefined: Self = StObject.set(x, "overflowDisabled", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setSubMenuCloseDelay(value: Double): Self = StObject.set(x, "subMenuCloseDelay", value.asInstanceOf[js.Any])
      
      inline def setSubMenuOpenDelay(value: Double): Self = StObject.set(x, "subMenuOpenDelay", value.asInstanceOf[js.Any])
      
      inline def setTriggerSubMenuAction(value: TriggerSubMenuAction): Self = StObject.set(x, "triggerSubMenuAction", value.asInstanceOf[js.Any])
      
      inline def setTriggerSubMenuActionUndefined: Self = StObject.set(x, "triggerSubMenuAction", js.undefined)
    }
  }
}
