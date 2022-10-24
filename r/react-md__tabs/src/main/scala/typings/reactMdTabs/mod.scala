package typings.reactMdTabs

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdTabs.typesTabMod.TabProps
import typings.reactMdTabs.typesTabPanelMod.TabPanelProps
import typings.reactMdTabs.typesTabPanelsMod.TabPanelsProps
import typings.reactMdTabs.typesTabsListMod.TabsListProps
import typings.reactMdTabs.typesTabsManagerMod.InitializedTabsManagerContext
import typings.reactMdTabs.typesTabsManagerMod.TabsManagerProps
import typings.reactMdTabs.typesTabsMod.TabsProps
import typings.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typings.reactMdTransition.typesTypesMod.TransitionTimeout
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
  
  inline def TabsManager(param0: TabsManagerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("TabsManager")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useTabs(): InitializedTabsManagerContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabs")().asInstanceOf[InitializedTabsManagerContext]
}
