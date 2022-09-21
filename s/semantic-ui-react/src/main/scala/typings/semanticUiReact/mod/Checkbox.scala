package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.checkboxCheckboxMod.CheckboxProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Checkbox")
@js.native
open class Checkbox protected () extends Component[CheckboxProps, ComponentState, Any] {
  def this(props: CheckboxProps) = this()
  def this(props: CheckboxProps, context: Any) = this()
}
object Checkbox {
  
  inline def apply: ComponentClass[CheckboxProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("Checkbox").asInstanceOf[ComponentClass[CheckboxProps, ComponentState]]
}
