package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownDividerMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownDivider", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[DropdownDividerProps, ComponentState, js.Any] {
    def this(props: DropdownDividerProps) = this()
    def this(props: DropdownDividerProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownDivider", JSImport.Default)
  @js.native
  val default: ComponentClass[DropdownDividerProps, ComponentState] = js.native
  
  @js.native
  trait DropdownDividerProps
    extends StrictDropdownDividerProps
       with /* key */ StringDictionary[js.Any]
  object DropdownDividerProps {
    
    @scala.inline
    def apply(): DropdownDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownDividerProps]
    }
  }
  
  @js.native
  trait StrictDropdownDividerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
  }
  object StrictDropdownDividerProps {
    
    @scala.inline
    def apply(): StrictDropdownDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownDividerProps]
    }
    
    @scala.inline
    implicit class StrictDropdownDividerPropsMutableBuilder[Self <: StrictDropdownDividerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type _To = ComponentClass[DropdownDividerProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownDividerMod.foo` */
  override def _to: ComponentClass[DropdownDividerProps, ComponentState] = default
}
