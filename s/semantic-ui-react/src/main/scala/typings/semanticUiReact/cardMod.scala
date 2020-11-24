package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.cardCardMod.CardComponent
import typings.semanticUiReact.cardCardMod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semantic-ui-react/dist/commonjs/views/Card", JSImport.Namespace)
@js.native
object cardMod extends js.Object {
  
  @js.native
  class default protected ()
    extends Component[CardProps, ComponentState, js.Any] {
    def this(props: CardProps) = this()
    def this(props: CardProps, context: js.Any) = this()
  }
  @js.native
  object default extends TopLevel[CardComponent]
}
