package typings
package reactDashRouterDashNavigationDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyLoadedTabs extends js.Object {
  var loadedTabs: js.Array[java.lang.String]
  var navigationState: reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.NavigationState[Anon_TestID]
  var rootIndex: scala.Double
  var tabs: js.Array[
    reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.Tab
  ]
  var tabsHistory: org.scalablytyped.runtime.NumberDictionary[js.Array[historyLib.historyMod.Location[historyLib.historyMod.LocationState]]]
}

object Anon_KeyLoadedTabs {
  @scala.inline
  def apply(
    loadedTabs: js.Array[java.lang.String],
    navigationState: reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.NavigationState[Anon_TestID],
    rootIndex: scala.Double,
    tabs: js.Array[
      reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.Tab
    ],
    tabsHistory: org.scalablytyped.runtime.NumberDictionary[js.Array[historyLib.historyMod.Location[historyLib.historyMod.LocationState]]]
  ): Anon_KeyLoadedTabs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadedTabs")(loadedTabs)
    __obj.updateDynamic("navigationState")(navigationState)
    __obj.updateDynamic("rootIndex")(rootIndex)
    __obj.updateDynamic("tabs")(tabs)
    __obj.updateDynamic("tabsHistory")(tabsHistory)
    __obj.asInstanceOf[Anon_KeyLoadedTabs]
  }
}

