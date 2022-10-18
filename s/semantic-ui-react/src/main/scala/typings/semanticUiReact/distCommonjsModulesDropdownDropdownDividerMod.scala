package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesDropdownDropdownDividerMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownDivider", JSImport.Default)
  @js.native
  open class default protected () extends Component[DropdownDividerProps, ComponentState, Any] {
    def this(props: DropdownDividerProps) = this()
    def this(props: DropdownDividerProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownDivider", JSImport.Default)
  @js.native
  val default: ComponentClass[DropdownDividerProps, ComponentState] = js.native
  
  trait DropdownDividerProps
    extends StObject
       with StrictDropdownDividerProps
       with /* key */ StringDictionary[Any]
  object DropdownDividerProps {
    
    inline def apply(): DropdownDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownDividerProps]
    }
  }
  
  trait StrictDropdownDividerProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
  }
  object StrictDropdownDividerProps {
    
    inline def apply(): StrictDropdownDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownDividerProps]
    }
    
    extension [Self <: StrictDropdownDividerProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type _To = ComponentClass[DropdownDividerProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesDropdownDropdownDividerMod.foo` */
  override def _to: ComponentClass[DropdownDividerProps, ComponentState] = default
}
