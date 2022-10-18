package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsElementsIconIconMod.IconProps
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesDropdownDropdownHeaderMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownHeader", JSImport.Default)
  @js.native
  open class default protected () extends Component[DropdownHeaderProps, ComponentState, Any] {
    def this(props: DropdownHeaderProps) = this()
    def this(props: DropdownHeaderProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dropdown/DropdownHeader", JSImport.Default)
  @js.native
  val default: ComponentClass[DropdownHeaderProps, ComponentState] = js.native
  
  trait DropdownHeaderProps
    extends StObject
       with StrictDropdownHeaderProps
       with /* key */ StringDictionary[Any]
  object DropdownHeaderProps {
    
    inline def apply(): DropdownHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownHeaderProps]
    }
  }
  
  trait StrictDropdownHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for Icon. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
  }
  object StrictDropdownHeaderProps {
    
    inline def apply(): StrictDropdownHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDropdownHeaderProps]
    }
    
    extension [Self <: StrictDropdownHeaderProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setIcon(value: SemanticShorthandItem[IconProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction3(
        value: (/* component */ ElementType[IconProps], IconProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
  
  type _To = ComponentClass[DropdownHeaderProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesDropdownDropdownHeaderMod.foo` */
  override def _to: ComponentClass[DropdownHeaderProps, ComponentState] = default
}
