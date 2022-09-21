package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.mod.^
import typings.semanticUiReact.stepStepMod.StepComponent
import typings.semanticUiReact.stepStepMod.StepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Step")
@js.native
open class Step protected () extends Component[StepProps, ComponentState, Any] {
  def this(props: StepProps) = this()
  def this(props: StepProps, context: Any) = this()
}
object Step {
  
  inline def apply: StepComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("Step").asInstanceOf[StepComponent]
}
