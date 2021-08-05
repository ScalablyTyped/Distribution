package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "DropdownHeader")
@js.native
class DropdownHeader protected ()
  extends Component[DropdownHeaderProps, ComponentState, js.Any] {
  def this(props: DropdownHeaderProps) = this()
  def this(props: DropdownHeaderProps, context: js.Any) = this()
}
object DropdownHeader {
  
  inline def apply: ComponentClass[DropdownHeaderProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DropdownHeader").asInstanceOf[ComponentClass[DropdownHeaderProps, ComponentState]]
}
