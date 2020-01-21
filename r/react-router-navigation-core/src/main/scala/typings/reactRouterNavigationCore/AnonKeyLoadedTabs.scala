package typings.reactRouterNavigationCore

import org.scalablytyped.runtime.NumberDictionary
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouterNavigationCore.mod.NavigationState
import typings.reactRouterNavigationCore.mod.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyLoadedTabs extends js.Object {
  var loadedTabs: js.Array[String]
  var navigationState: NavigationState[AnonTestID]
  var rootIndex: Double
  var tabs: js.Array[Tab]
  var tabsHistory: NumberDictionary[js.Array[Location[LocationState]]]
}

object AnonKeyLoadedTabs {
  @scala.inline
  def apply(
    loadedTabs: js.Array[String],
    navigationState: NavigationState[AnonTestID],
    rootIndex: Double,
    tabs: js.Array[Tab],
    tabsHistory: NumberDictionary[js.Array[Location[LocationState]]]
  ): AnonKeyLoadedTabs = {
    val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], rootIndex = rootIndex.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], tabsHistory = tabsHistory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeyLoadedTabs]
  }
}

