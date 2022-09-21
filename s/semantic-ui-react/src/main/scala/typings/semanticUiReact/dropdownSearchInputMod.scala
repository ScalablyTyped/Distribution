package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownSearchInputMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownSearchInput", JSImport.Default)
  @js.native
  open class default protected () extends Component[DropdownSearchInputProps, ComponentState, Any] {
    def this(props: DropdownSearchInputProps) = this()
    def this(props: DropdownSearchInputProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownSearchInput", JSImport.Default)
  @js.native
  val default: ComponentClass[DropdownSearchInputProps, ComponentState] = js.native
  
  trait DropdownSearchInputProps
    extends StObject
       with StrictDropdownSearchInputProps
       with /* key */ StringDictionary[Any]
  object DropdownSearchInputProps {
    
    inline def apply(): DropdownSearchInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownSearchInputProps]
    }
  }
  
  trait StrictDropdownSearchInputProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** An input can have the auto complete. */
    var autoComplete: js.UndefOr[String] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** An input can receive focus. */
    var tabIndex: js.UndefOr[Double | String] = js.undefined
    
    /** The HTML input type. */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Stored value. */
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object StrictDropdownSearchInputProps {
    
    inline def apply(): StrictDropdownSearchInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownSearchInputProps]
    }
    
    extension [Self <: StrictDropdownSearchInputProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = ComponentClass[DropdownSearchInputProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `dropdownSearchInputMod.foo` */
  override def _to: ComponentClass[DropdownSearchInputProps, ComponentState] = default
}
