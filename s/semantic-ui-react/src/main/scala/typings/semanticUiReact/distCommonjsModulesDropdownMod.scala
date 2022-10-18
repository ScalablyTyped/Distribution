package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownDividerMod.DropdownDividerProps
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownHeaderMod.DropdownHeaderProps
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownMod.DropdownComponent
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownMod.DropdownProps
import typings.semanticUiReact.distCommonjsModulesDropdownDropdownSearchInputMod.DropdownSearchInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesDropdownMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown", JSImport.Default)
  @js.native
  open class default protected () extends Component[DropdownProps, ComponentState, Any] {
    def this(props: DropdownProps) = this()
    def this(props: DropdownProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown", JSImport.Default)
    @js.native
    val ^ : DropdownComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown", "default.Divider")
    @js.native
    open class Divider protected () extends Component[DropdownDividerProps, ComponentState, Any] {
      def this(props: DropdownDividerProps) = this()
      def this(props: DropdownDividerProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown", "default.Header")
    @js.native
    open class Header protected () extends Component[DropdownHeaderProps, ComponentState, Any] {
      def this(props: DropdownHeaderProps) = this()
      def this(props: DropdownHeaderProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown", "default.Item")
    @js.native
    open class Item protected () extends Component[DropdownItemProps, ComponentState, Any] {
      def this(props: DropdownItemProps) = this()
      def this(props: DropdownItemProps, context: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown", "default.SearchInput")
    @js.native
    open class SearchInput protected () extends Component[DropdownSearchInputProps, ComponentState, Any] {
      def this(props: DropdownSearchInputProps) = this()
      def this(props: DropdownSearchInputProps, context: Any) = this()
    }
    
    type _To = DropdownComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: DropdownComponent = ^
  }
}
