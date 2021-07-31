package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.visibilityVisibilityMod.VisibilityProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visibilityMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/behaviors/Visibility", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[VisibilityProps, ComponentState, js.Any] {
    def this(props: VisibilityProps) = this()
    def this(props: VisibilityProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/behaviors/Visibility", JSImport.Default)
  @js.native
  val default: ComponentClass[VisibilityProps, ComponentState] = js.native
  
  type _To = ComponentClass[VisibilityProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `visibilityMod.foo` */
  override def _to: ComponentClass[VisibilityProps, ComponentState] = default
}
