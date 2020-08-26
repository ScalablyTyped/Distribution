package typings.reactRouterNavigationCore.anon

import org.scalablytyped.runtime.NumberDictionary
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouterNavigationCore.mod.NavigationState
import typings.reactRouterNavigationCore.mod.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadedTabs extends js.Object {
  var loadedTabs: js.Array[String] = js.native
  var navigationState: NavigationState[TestID] = js.native
  var rootIndex: Double = js.native
  var tabs: js.Array[Tab] = js.native
  var tabsHistory: NumberDictionary[js.Array[Location[LocationState]]] = js.native
}

object LoadedTabs {
  @scala.inline
  def apply(
    loadedTabs: js.Array[String],
    navigationState: NavigationState[TestID],
    rootIndex: Double,
    tabs: js.Array[Tab],
    tabsHistory: NumberDictionary[js.Array[Location[LocationState]]]
  ): LoadedTabs = {
    val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], rootIndex = rootIndex.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], tabsHistory = tabsHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadedTabs]
  }
  @scala.inline
  implicit class LoadedTabsOps[Self <: LoadedTabs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadedTabsVarargs(value: String*): Self = this.set("loadedTabs", js.Array(value :_*))
    @scala.inline
    def setLoadedTabs(value: js.Array[String]): Self = this.set("loadedTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavigationState(value: NavigationState[TestID]): Self = this.set("navigationState", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootIndex(value: Double): Self = this.set("rootIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabsVarargs(value: Tab*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Tab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabsHistory(value: NumberDictionary[js.Array[Location[LocationState]]]): Self = this.set("tabsHistory", value.asInstanceOf[js.Any])
  }
  
}

