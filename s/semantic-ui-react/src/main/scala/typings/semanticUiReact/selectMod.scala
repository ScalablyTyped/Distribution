package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typings.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.selectSelectMod.SelectComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select", JSImport.Default)
    @js.native
    val ^ : SelectComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select", "default.Divider")
    @js.native
    class Divider protected ()
      extends Component[DropdownDividerProps, ComponentState, js.Any] {
      def this(props: DropdownDividerProps) = this()
      def this(props: DropdownDividerProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select", "default.Header")
    @js.native
    class Header protected ()
      extends Component[DropdownHeaderProps, ComponentState, js.Any] {
      def this(props: DropdownHeaderProps) = this()
      def this(props: DropdownHeaderProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select", "default.Item")
    @js.native
    class Item protected ()
      extends Component[DropdownItemProps, ComponentState, js.Any] {
      def this(props: DropdownItemProps) = this()
      def this(props: DropdownItemProps, context: js.Any) = this()
    }
    
    type _To = SelectComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: SelectComponent = ^
  }
}
