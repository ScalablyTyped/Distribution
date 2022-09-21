package typings.rcTabs

import typings.rcTabs.interfaceMod.AnimatedConfig
import typings.rcTabs.interfaceMod.EditableConfig
import typings.rcTabs.interfaceMod.OnTabScroll
import typings.rcTabs.interfaceMod.RenderTabBar
import typings.rcTabs.interfaceMod.TabBarExtraContent
import typings.rcTabs.interfaceMod.TabPosition
import typings.rcTabs.interfaceMod.TabsLocale
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapperMod {
  
  @JSImport("rc-tabs/es/TabNavList/Wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasRenderTabBarRestProps: TabNavListWrapperProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasRenderTabBarRestProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Required<std.Omit<rc-tabs.rc-tabs/es/TabNavList.TabNavListProps, 'children' | 'className'>> & rc-tabs.rc-tabs/es/TabNavList.TabNavListProps */
  @js.native
  trait TabNavListWrapperProps extends StObject {
    
    var activeKey: String = js.native
    
    var animated: AnimatedConfig & js.UndefOr[AnimatedConfig] = js.native
    
    var children: js.UndefOr[js.Function1[/* node */ ReactElement, ReactElement]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: EditableConfig & js.UndefOr[EditableConfig] = js.native
    
    var extra: TabBarExtraContent & js.UndefOr[TabBarExtraContent] = js.native
    
    var getPopupContainer: (js.Function1[/* node */ HTMLElement, HTMLElement]) & (js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]]) = js.native
    
    var id: String = js.native
    
    var locale: TabsLocale & js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: ReactNode & js.UndefOr[ReactNode] = js.native
    
    var moreTransitionName: String & js.UndefOr[String] = js.native
    
    var onTabClick: js.Function2[
        /* activeKey */ String, 
        /* e */ (MouseEvent[typings.std.Element, NativeMouseEvent]) | KeyboardEvent[typings.std.Element], 
        Unit
      ] = js.native
    def onTabClick(activeKey: String, e: KeyboardEvent[typings.std.Element]): Unit = js.native
    def onTabClick(activeKey: String, e: MouseEvent[typings.std.Element, NativeMouseEvent]): Unit = js.native
    
    var onTabScroll: OnTabScroll & js.UndefOr[OnTabScroll] = js.native
    
    var popupClassName: String & js.UndefOr[String] = js.native
    
    var renderTabBar: RenderTabBar & js.UndefOr[RenderTabBar] = js.native
    
    var rtl: Boolean = js.native
    
    var style: CSSProperties & js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: Double & js.UndefOr[Double] = js.native
    
    var tabPosition: TabPosition = js.native
  }
}
