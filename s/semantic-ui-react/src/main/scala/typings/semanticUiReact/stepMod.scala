package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.stepStepMod.StepComponent
import typings.semanticUiReact.stepStepMod.StepProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-ui-react/dist/commonjs/elements/Step", JSImport.Namespace)
@js.native
object stepMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[StepProps, ComponentState, js.Any] {
    def this(props: StepProps) = this()
    def this(props: StepProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[StepComponent]
  
}

