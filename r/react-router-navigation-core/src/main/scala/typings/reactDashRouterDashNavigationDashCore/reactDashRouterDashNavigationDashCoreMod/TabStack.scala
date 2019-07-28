package typings.reactDashRouterDashNavigationDashCore.reactDashRouterDashNavigationDashCoreMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import typings.react.reactMod.PureComponent
import typings.reactDashRouterDashNavigationDashCore.Anon_False
import typings.reactDashRouterDashNavigationDashCore.Anon_KeyLoadedTabs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "TabStack")
@js.native
class TabStack protected ()
  extends PureComponent[TabStackProps, Anon_KeyLoadedTabs, js.Any] {
  def this(props: TabStackProps) = this()
  var unlistenHistory: js.UndefOr[js.Function0[Unit]] = js.native
  def onIndexChange(index: Double): Unit = js.native
  def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
}

/* static members */
@JSImport("react-router-navigation-core", "TabStack")
@js.native
object TabStack extends js.Object {
  var defaultProps: Anon_False = js.native
}

