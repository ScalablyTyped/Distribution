package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.checkboxCheckboxMod.CheckboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[CheckboxProps, ComponentState, js.Any] {
    def this(props: CheckboxProps) = this()
    def this(props: CheckboxProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Checkbox", JSImport.Default)
  @js.native
  val default: ComponentClass[CheckboxProps, ComponentState] = js.native
  
  type _To = ComponentClass[CheckboxProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxMod.foo` */
  override def _to: ComponentClass[CheckboxProps, ComponentState] = default
}
