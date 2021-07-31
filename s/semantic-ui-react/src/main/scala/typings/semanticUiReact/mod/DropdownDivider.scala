package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "DropdownDivider")
@js.native
class DropdownDivider protected ()
  extends Component[DropdownDividerProps, ComponentState, js.Any] {
  def this(props: DropdownDividerProps) = this()
  def this(props: DropdownDividerProps, context: js.Any) = this()
}
object DropdownDivider {
  
  @scala.inline
  def apply: ComponentClass[DropdownDividerProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("DropdownDivider").asInstanceOf[ComponentClass[DropdownDividerProps, ComponentState]]
}
