package typings.reactRouterNavigationCore.mod

import typings.reactRouterNavigationCore.anon.TestID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsRendererProps extends js.Object {
  var loadedTabs: js.Array[String] = js.native
  var navigationState: NavigationState[TestID] = js.native
  var tabs: js.Array[Tab] = js.native
  def onIndexChange(index: Double): Unit = js.native
}

object TabsRendererProps {
  @scala.inline
  def apply(
    loadedTabs: js.Array[String],
    navigationState: NavigationState[TestID],
    onIndexChange: Double => Unit,
    tabs: js.Array[Tab]
  ): TabsRendererProps = {
    val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsRendererProps]
  }
  @scala.inline
  implicit class TabsRendererPropsOps[Self <: TabsRendererProps] (val x: Self) extends AnyVal {
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
    def setOnIndexChange(value: Double => Unit): Self = this.set("onIndexChange", js.Any.fromFunction1(value))
    @scala.inline
    def setTabsVarargs(value: Tab*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[Tab]): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
  
}

