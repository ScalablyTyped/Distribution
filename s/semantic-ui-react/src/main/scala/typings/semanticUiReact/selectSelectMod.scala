package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typings.semanticUiReact.dropdownDropdownMod.StrictDropdownProps
import typings.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSelectMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", JSImport.Default)
    @js.native
    val ^ : SelectComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", "default.Divider")
    @js.native
    class Divider protected ()
      extends Component[DropdownDividerProps, ComponentState, js.Any] {
      def this(props: DropdownDividerProps) = this()
      def this(props: DropdownDividerProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", "default.Header")
    @js.native
    class Header protected ()
      extends Component[DropdownHeaderProps, ComponentState, js.Any] {
      def this(props: DropdownHeaderProps) = this()
      def this(props: DropdownHeaderProps, context: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Select/Select", "default.Item")
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
  
  @js.native
  trait SelectComponent
    extends StObject
       with FunctionComponent[SelectProps] {
    
    var Divider: ComponentClass[DropdownDividerProps, ComponentState] = js.native
    
    var Header: ComponentClass[DropdownHeaderProps, ComponentState] = js.native
    
    var Item: ComponentClass[DropdownItemProps, ComponentState] = js.native
    
    var Menu: StatelessComponent[DropdownMenuProps] = js.native
  }
  
  trait SelectProps
    extends StObject
       with StrictSelectProps
       with /* key */ StringDictionary[js.Any]
  object SelectProps {
    
    @scala.inline
    def apply(options: js.Array[DropdownItemProps]): SelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
  }
  
  trait StrictSelectProps
    extends StObject
       with StrictDropdownProps {
    
    /** Array of Dropdown.Item props e.g. `{ text: '', value: '' }` */
    @JSName("options")
    var options_StrictSelectProps: js.Array[DropdownItemProps]
  }
  object StrictSelectProps {
    
    @scala.inline
    def apply(options: js.Array[DropdownItemProps]): StrictSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictSelectProps]
    }
    
    @scala.inline
    implicit class StrictSelectPropsMutableBuilder[Self <: StrictSelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Array[DropdownItemProps]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: DropdownItemProps*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
}
