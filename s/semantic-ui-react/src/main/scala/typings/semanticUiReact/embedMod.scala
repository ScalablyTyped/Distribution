package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.embedEmbedMod.EmbedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embedMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Default)
  @js.native
  open class default protected () extends Component[EmbedProps, ComponentState, Any] {
    def this(props: EmbedProps) = this()
    def this(props: EmbedProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Embed", JSImport.Default)
  @js.native
  val default: ComponentClass[EmbedProps, ComponentState] = js.native
  
  type _To = ComponentClass[EmbedProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `embedMod.foo` */
  override def _to: ComponentClass[EmbedProps, ComponentState] = default
}
