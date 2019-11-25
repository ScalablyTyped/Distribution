package typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import typings.reactDashRouterDashNavigationDashCore.Anon_TestID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsRendererProps extends js.Object {
  var loadedTabs: js.Array[String]
  var navigationState: NavigationState[Anon_TestID]
  var tabs: js.Array[Tab]
  def onIndexChange(index: Double): Unit
}

object TabsRendererProps {
  @scala.inline
  def apply(
    loadedTabs: js.Array[String],
    navigationState: NavigationState[Anon_TestID],
    onIndexChange: Double => Unit,
    tabs: js.Array[Tab]
  ): TabsRendererProps = {
    val __obj = js.Dynamic.literal(loadedTabs = loadedTabs.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), tabs = tabs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabsRendererProps]
  }
}

