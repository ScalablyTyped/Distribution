package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.transitionTransitionMod.TransitionComponent
import typings.semanticUiReact.transitionTransitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[TransitionProps, ComponentState, js.Any] {
    def this(props: TransitionProps) = this()
    def this(props: TransitionProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[TransitionComponent]
  
}

