package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsRendererProps extends js.Object {
  var loadedTabs: js.Array[java.lang.String]
  var navigationState: NavigationState[reactDashRouterDashNavigationDashCoreLib.Anon_TestID]
  var tabs: js.Array[Tab]
  def onIndexChange(index: scala.Double): scala.Unit
}

object TabsRendererProps {
  @scala.inline
  def apply(
    loadedTabs: js.Array[java.lang.String],
    navigationState: NavigationState[reactDashRouterDashNavigationDashCoreLib.Anon_TestID],
    onIndexChange: js.Function1[scala.Double, scala.Unit],
    tabs: js.Array[Tab]
  ): TabsRendererProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadedTabs")(loadedTabs)
    __obj.updateDynamic("navigationState")(navigationState)
    __obj.updateDynamic("onIndexChange")(onIndexChange)
    __obj.updateDynamic("tabs")(tabs)
    __obj.asInstanceOf[TabsRendererProps]
  }
}

