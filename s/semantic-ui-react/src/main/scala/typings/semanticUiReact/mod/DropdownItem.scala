package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "DropdownItem")
@js.native
open class DropdownItem protected () extends Component[DropdownItemProps, ComponentState, Any] {
  def this(props: DropdownItemProps) = this()
  def this(props: DropdownItemProps, context: Any) = this()
}
object DropdownItem {
  
  inline def apply: ComponentClass[DropdownItemProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DropdownItem").asInstanceOf[ComponentClass[DropdownItemProps, ComponentState]]
}
