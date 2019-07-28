package typings.reactDashRouterDashNavigationDashCore

import org.scalablytyped.runtime.NumberDictionary
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod.NavigationState
import typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyLoadedTabs extends js.Object {
  var loadedTabs: js.Array[String]
  var navigationState: NavigationState[Anon_TestID]
  var rootIndex: Double
  var tabs: js.Array[Tab]
  var tabsHistory: NumberDictionary[js.Array[Location[LocationState]]]
}

object Anon_KeyLoadedTabs {
  @scala.inline
  def apply(
    loadedTabs: js.Array[String],
    navigationState: NavigationState[Anon_TestID],
    rootIndex: Double,
    tabs: js.Array[Tab],
    tabsHistory: NumberDictionary[js.Array[Location[LocationState]]]
  ): Anon_KeyLoadedTabs = {
    val __obj = js.Dynamic.literal(loadedTabs = loadedTabs, navigationState = navigationState, rootIndex = rootIndex, tabs = tabs, tabsHistory = tabsHistory)
  
    __obj.asInstanceOf[Anon_KeyLoadedTabs]
  }
}

