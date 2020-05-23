package typings.reactRouterNavigationCore.mod

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.Component
import typings.reactRouterNavigationCore.anon.ForceSync
import typings.reactRouterNavigationCore.anon.LoadedTabs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-navigation-core", "TabStack")
@js.native
class TabStack protected ()
  extends Component[TabStackProps, LoadedTabs, js.Any] {
  def this(props: TabStackProps) = this()
  var unlistenHistory: js.UndefOr[js.Function0[Unit]] = js.native
  def onIndexChange(index: Double): Unit = js.native
  def onListenHistory(history: History[LocationState], nextHistory: History[LocationState]): Unit = js.native
}

/* static members */
@JSImport("react-router-navigation-core", "TabStack")
@js.native
object TabStack extends js.Object {
  var defaultProps: ForceSync = js.native
}

