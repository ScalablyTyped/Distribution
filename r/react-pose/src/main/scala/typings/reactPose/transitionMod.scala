package typings.reactPose

import typings.react.mod.Component
import typings.reactPose.anon.EnterAfterExit
import typings.reactPose.anon.PartialState
import typings.reactPose.transitionTypesMod.Props
import typings.reactPose.transitionTypesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-pose/lib/components/Transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  
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
    
    var defaultProps: EnterAfterExit = js.native
    
    def getDerivedStateFromProps(props: Props, state: State): PartialState = js.native
  }
}
