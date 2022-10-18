package typings.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsAddonsSelectSelectMod.SelectComponent
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownDividerMod.DropdownDividerProps
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownHeaderMod.DropdownHeaderProps
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Select extends Shortcut {
  
  @JSImport("semantic-ui-react", "Select")
  @js.native
  val ^ : SelectComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Select.Divider")
  @js.native
  open class Divider protected () extends Component[DropdownDividerProps, ComponentState, Any] {
    def this(props: DropdownDividerProps) = this()
    def this(props: DropdownDividerProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Select.Header")
  @js.native
  open class Header protected () extends Component[DropdownHeaderProps, ComponentState, Any] {
    def this(props: DropdownHeaderProps) = this()
    def this(props: DropdownHeaderProps, context: Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Select.Item")
  @js.native
  open class Item protected () extends Component[DropdownItemProps, ComponentState, Any] {
    def this(props: DropdownItemProps) = this()
    def this(props: DropdownItemProps, context: Any) = this()
  }
  
  type _To = SelectComponent
  
  /* This means you don't have to write `^`, but can instead just say `Select.foo` */
  override def _to: SelectComponent = ^
}
