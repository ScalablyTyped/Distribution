package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.messageMessageMod.MessageComponent
import typings.semanticUiReact.messageMessageMod.MessageProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-ui-react/dist/commonjs/collections/Message", JSImport.Namespace)
@js.native
object messageMod extends js.Object {
  
  @js.native
  class default protected ()
    extends Component[MessageProps, ComponentState, js.Any] {
    def this(props: MessageProps) = this()
    def this(props: MessageProps, context: js.Any) = this()
  }
  @js.native
  object default extends TopLevel[MessageComponent]
}
