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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Dropdown")
@js.native
class Dropdown protected ()
  extends Component[DropdownProps, ComponentState, js.Any] {
  def this(props: DropdownProps) = this()
  def this(props: DropdownProps, context: js.Any) = this()
}
object Dropdown extends Shortcut {
  
  @JSImport("semantic-ui-react", "Dropdown")
  @js.native
  val ^ : DropdownComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.Divider")
  @js.native
  class Divider protected ()
    extends Component[DropdownDividerProps, ComponentState, js.Any] {
    def this(props: DropdownDividerProps) = this()
    def this(props: DropdownDividerProps, context: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.Header")
  @js.native
  class Header protected ()
    extends Component[DropdownHeaderProps, ComponentState, js.Any] {
    def this(props: DropdownHeaderProps) = this()
    def this(props: DropdownHeaderProps, context: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.Item")
  @js.native
  class Item protected ()
    extends Component[DropdownItemProps, ComponentState, js.Any] {
    def this(props: DropdownItemProps) = this()
    def this(props: DropdownItemProps, context: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Dropdown.SearchInput")
  @js.native
  class SearchInput protected ()
    extends Component[DropdownSearchInputProps, ComponentState, js.Any] {
    def this(props: DropdownSearchInputProps) = this()
    def this(props: DropdownSearchInputProps, context: js.Any) = this()
  }
  
  type _To = DropdownComponent
  
  /* This means you don't have to write `^`, but can instead just say `Dropdown.foo` */
  override def _to: DropdownComponent = ^
}
