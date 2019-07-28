package typings.reactDashPose.libComponentsTransitionMod

import typings.react.reactMod.Component
import typings.reactDashPose.libComponentsTransitionTypesMod.Props
import typings.reactDashPose.libComponentsTransitionTypesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transition
  extends Component[Props, State, js.Any] {
  def removeChild(key: String): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTransition(nextProps: Props, nextState: State): Boolean = js.native
}

