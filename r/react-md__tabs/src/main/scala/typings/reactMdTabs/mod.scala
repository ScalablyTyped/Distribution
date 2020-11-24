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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Tab: ForwardRefExoticComponent[TabProps with RefAttributes[HTMLButtonElement]] = js.native
  
  val TabPanel: ForwardRefExoticComponent[TabPanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  val TabPanels: ForwardRefExoticComponent[TabPanelsProps with RefAttributes[HTMLDivElement]] = js.native
  
  val Tabs: ForwardRefExoticComponent[PickTabsListPropshiddenco] = js.native
  
  val TabsList: ForwardRefExoticComponent[TabsListProps with RefAttributes[HTMLDivElement]] = js.native
  
  def TabsManager(
    hasTabsIdDefaultActiveIndexActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren: TabsManagerProps
  ): ReactElement = js.native
  
  def useTabs(): InitializedTabsManagerContext = js.native
}
