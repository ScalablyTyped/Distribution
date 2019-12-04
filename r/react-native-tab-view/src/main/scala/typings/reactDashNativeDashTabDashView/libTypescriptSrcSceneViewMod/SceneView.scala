package typings.reactDashNativeDashTabDashView.libTypescriptSrcSceneViewMod

import typings.react.reactMod.Component
import typings.reactDashNativeDashTabDashView.Anon_Loading
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneView[T /* <: Route */]
  extends Component[Props[T], State, js.Any] {
  var handleEnter: js.Any = js.native
  @JSName("state")
  var state_SceneView: Anon_Loading = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSceneView(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSceneView(prevProps: Props[T], prevState: State): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSceneView(): Unit = js.native
}

