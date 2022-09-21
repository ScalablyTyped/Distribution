package typings.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typings.semanticUiReact.dropdownDropdownMod.DropdownComponent
import typings.semanticUiReact.dropdownDropdownMod.DropdownProps
import typings.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.dropdownSearchInputMod.DropdownSearchInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Dropdown")
@js.native
open class Dropdown protected () extends Component[DropdownProps, ComponentState, Any] {
  def this(props: DropdownProps) = this()
  def this(props: DropdownProps, context: Any) = this()
}
object Dropdown extends Shortcut {
  
  @JSImport("semantic-ui-react", "Dropdown")
  @js.native
  val ^ : DropdownComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.Divider")
  @js.native
  open class Divider protected () extends Component[DropdownDividerProps, ComponentState, Any] {
    def this(props: DropdownDividerProps) = this()
    def this(props: DropdownDividerProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.Header")
  @js.native
  open class Header protected () extends Component[DropdownHeaderProps, ComponentState, Any] {
    def this(props: DropdownHeaderProps) = this()
    def this(props: DropdownHeaderProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.Item")
  @js.native
  open class Item protected () extends Component[DropdownItemProps, ComponentState, Any] {
    def this(props: DropdownItemProps) = this()
    def this(props: DropdownItemProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.SearchInput")
  @js.native
  open class SearchInput protected () extends Component[DropdownSearchInputProps, ComponentState, Any] {
    def this(props: DropdownSearchInputProps) = this()
    def this(props: DropdownSearchInputProps, context: Any) = this()
  }
  
  type _To = DropdownComponent
  
  /* This means you don't have to write `^`, but can instead just say `Dropdown.foo` */
  override def _to: DropdownComponent = ^
}
