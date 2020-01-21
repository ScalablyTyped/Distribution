package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.confirmConfirmMod.ConfirmProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/addons/Confirm", JSImport.Namespace)
@js.native
object confirmMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[ConfirmProps, ComponentState, js.Any] {
    def this(props: ConfirmProps) = this()
    def this(props: ConfirmProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentClass[ConfirmProps, ComponentState]]
  
}

