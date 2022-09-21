package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.progressProgressMod.ProgressProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress", JSImport.Default)
  @js.native
  open class default protected () extends Component[ProgressProps, ComponentState, Any] {
    def this(props: ProgressProps) = this()
    def this(props: ProgressProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Progress", JSImport.Default)
  @js.native
  val default: ComponentClass[ProgressProps, ComponentState] = js.native
  
  type _To = ComponentClass[ProgressProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `progressMod.foo` */
  override def _to: ComponentClass[ProgressProps, ComponentState] = default
}
