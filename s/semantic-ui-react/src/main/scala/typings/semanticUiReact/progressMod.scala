package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.progressProgressMod.ProgressProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Progress", JSImport.Namespace)
@js.native
object progressMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[ProgressProps, ComponentState, js.Any] {
    def this(props: ProgressProps) = this()
    def this(props: ProgressProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentClass[ProgressProps, ComponentState]]
  
}

