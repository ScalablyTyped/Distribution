package typings.reactDashNativeDashTabDashView.libTypescriptSrcTabBarMod

import typings.react.reactMod.Component
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBar[T /* <: Route */]
  extends Component[Props[T], State, js.Any] {
  var getComputedTabWidth: js.Any = js.native
  var getFlattenedTabWidth: js.Any = js.native
  var getMaxScrollDistance: js.Any = js.native
  var getMemoizedTabWidthGettter: js.Any = js.native
  var getScrollAmount: js.Any = js.native
  var getTabBarWidth: js.Any = js.native
  var getTranslateX: js.Any = js.native
  var handleLayout: js.Any = js.native
  var measuredTabWidths: js.Any = js.native
  var normalizeScrollValue: js.Any = js.native
  var resetScroll: js.Any = js.native
  var scrollAmount: js.Any = js.native
  var scrollView: js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabBar(prevProps: Props[T], prevState: State): Unit = js.native
}

