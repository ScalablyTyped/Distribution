package typings
package reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "TabStack")
@js.native
class TabStack protected ()
  extends reactLib.reactMod.PureComponent[TabStackProps, reactDashRouterDashNavigationDashCoreLib.Anon_NavigationState, js.Any] {
  def this(props: TabStackProps) = this()
  var unlistenHistory: js.UndefOr[js.Function0[scala.Unit]] = js.native
  def onIndexChange(index: scala.Double): scala.Unit = js.native
  def onListenHistory(
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    nextHistory: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  ): scala.Unit = js.native
}

@JSImport("react-router-navigation-core", "TabStack")
@js.native
object TabStack extends js.Object {
  var defaultProps: reactDashRouterDashNavigationDashCoreLib.Anon_ForceSync = js.native
}

