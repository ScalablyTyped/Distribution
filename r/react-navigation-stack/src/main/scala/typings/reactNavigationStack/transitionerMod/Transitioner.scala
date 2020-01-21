package typings.reactNavigationStack.transitionerMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transitioner
  extends Component[Props, State, js.Any] {
  var computeScenes: js.Any = js.native
  var handleLayout: js.Any = js.native
  var handleTransitionEnd: js.Any = js.native
  var isComponentMounted: js.Any = js.native
  var isTransitionRunning: js.Any = js.native
  var positionListener: js.Any = js.native
  var prevTransitionProps: js.Any = js.native
  var queuedTransition: js.Any = js.native
  var startTransition: js.Any = js.native
  var transitionProps: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MTransitioner(nextProps: Props): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTransitioner(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTransitioner(): Unit = js.native
}

