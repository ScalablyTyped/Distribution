package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.dropdownSearchInputMod.DropdownSearchInputProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "DropdownSearchInput")
@js.native
open class DropdownSearchInput protected () extends Component[DropdownSearchInputProps, ComponentState, Any] {
  def this(props: DropdownSearchInputProps) = this()
  def this(props: DropdownSearchInputProps, context: Any) = this()
}
object DropdownSearchInput {
  
  inline def apply: ComponentClass[DropdownSearchInputProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DropdownSearchInput").asInstanceOf[ComponentClass[DropdownSearchInputProps, ComponentState]]
}
