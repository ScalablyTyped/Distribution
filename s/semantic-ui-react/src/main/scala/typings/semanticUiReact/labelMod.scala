package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.labelLabelMod.LabelComponent
import typings.semanticUiReact.labelLabelMod.LabelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/elements/Label", JSImport.Namespace)
@js.native
object labelMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[LabelProps, ComponentState, js.Any] {
    def this(props: LabelProps) = this()
    def this(props: LabelProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[LabelComponent]
  
}

