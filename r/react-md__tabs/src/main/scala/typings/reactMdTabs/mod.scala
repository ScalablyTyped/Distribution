package typings.reactMdTabs

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdTabs.tabMod.TabProps
import typings.reactMdTabs.tabPanelMod.TabPanelProps
import typings.reactMdTabs.tabPanelsMod.TabPanelsProps
import typings.reactMdTabs.tabsListMod.TabsListProps
import typings.reactMdTabs.tabsManagerMod.InitializedTabsManagerContext
import typings.reactMdTabs.tabsManagerMod.TabsManagerProps
import typings.reactMdTabs.tabsMod.TabsProps
import typings.reactMdTransition.typesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/tabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/tabs", "DEFAULT_TABPANEL_CLASSNAMES")
  @js.native
  val DEFAULT_TABPANEL_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/tabs", "DEFAULT_TABPANEL_TIMEOUT")
  @js.native
  val DEFAULT_TABPANEL_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/tabs", "Tab")
  @js.native
  val Tab: ForwardRefExoticComponent[TabProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabPanel")
  @js.native
  val TabPanel: ForwardRefExoticComponent[TabPanelProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabPanels")
  @js.native
  val TabPanels: ForwardRefExoticComponent[TabPanelsProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "Tabs")
  @js.native
  val Tabs: ForwardRefExoticComponent[TabsProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabsList")
  @js.native
  val TabsList: ForwardRefExoticComponent[TabsListProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def TabsManager(
    hasTabsIdDefaultActiveIndexPropActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren: TabsManagerProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("TabsManager")(hasTabsIdDefaultActiveIndexPropActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useTabs(): InitializedTabsManagerContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabs")().asInstanceOf[InitializedTabsManagerContext]
}
