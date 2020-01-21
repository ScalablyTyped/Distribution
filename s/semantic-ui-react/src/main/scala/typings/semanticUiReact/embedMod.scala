package typings.semanticUiReact

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.embedEmbedMod.EmbedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Namespace)
@js.native
object embedMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[EmbedProps, ComponentState, js.Any] {
    def this(props: EmbedProps) = this()
    def this(props: EmbedProps, context: js.Any) = this()
  }
  
  @js.native
  object default extends TopLevel[ComponentClass[EmbedProps, ComponentState]]
  
}

