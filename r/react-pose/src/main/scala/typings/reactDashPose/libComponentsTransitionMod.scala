package typings.reactDashPose

import typings.react.reactMod.Component
import typings.reactDashPose.libComponentsTransitionTypesMod.Props
import typings.reactDashPose.libComponentsTransitionTypesMod.State
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose/lib/components/Transition", JSImport.Namespace)
@js.native
object libComponentsTransitionMod extends js.Object {
  @js.native
  trait Transition
    extends Component[Props, State, js.Any] {
    def removeChild(key: String): Unit = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTransition(nextProps: Props, nextState: State): Boolean = js.native
  }
  
  @js.native
  class default () extends Transition
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_EnterAfterExit = js.native
    def getDerivedStateFromProps(props: Props, state: State): Partial[State] = js.native
  }
  
}

