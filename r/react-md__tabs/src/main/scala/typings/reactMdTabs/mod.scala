package typings.reactMdTabs

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdTabs.anon.PickTabsListPropshiddenco
import typings.reactMdTabs.tabMod.TabProps
import typings.reactMdTabs.tabPanelMod.TabPanelProps
import typings.reactMdTabs.tabPanelsMod.TabPanelsProps
import typings.reactMdTabs.tabsListMod.TabsListProps
import typings.reactMdTabs.tabsManagerMod.InitializedTabsManagerContext
import typings.reactMdTabs.tabsManagerMod.TabsManagerProps
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/tabs", "Tab")
  @js.native
  val Tab: ForwardRefExoticComponent[TabProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabPanel")
  @js.native
  val TabPanel: ForwardRefExoticComponent[TabPanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabPanels")
  @js.native
  val TabPanels: ForwardRefExoticComponent[TabPanelsProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "Tabs")
  @js.native
  val Tabs: ForwardRefExoticComponent[PickTabsListPropshiddenco] = js.native
  
  @JSImport("@react-md/tabs", "TabsList")
  @js.native
  val TabsList: ForwardRefExoticComponent[TabsListProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/tabs", "TabsManager")
  @js.native
  def TabsManager(
    hasTabsIdDefaultActiveIndexActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren: TabsManagerProps
  ): ReactElement = js.native
  
  @JSImport("@react-md/tabs", "useTabs")
  @js.native
  def useTabs(): InitializedTabsManagerContext = js.native
}
