package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsMenuMenuHeaderMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/MenuHeader", JSImport.Default)
  @js.native
  open class default protected () extends Component[MenuHeaderProps, ComponentState, Any] {
    def this(props: MenuHeaderProps) = this()
    def this(props: MenuHeaderProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Menu/MenuHeader", JSImport.Default)
  @js.native
  val default: ComponentClass[MenuHeaderProps, ComponentState] = js.native
  
  trait MenuHeaderProps
    extends StObject
       with StrictMenuHeaderProps
       with /* key */ StringDictionary[Any]
  object MenuHeaderProps {
    
    inline def apply(): MenuHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuHeaderProps]
    }
  }
  
  trait StrictMenuHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictMenuHeaderProps {
    
    inline def apply(): StrictMenuHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMenuHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictMenuHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = ComponentClass[MenuHeaderProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsMenuMenuHeaderMod.foo` */
  override def _to: ComponentClass[MenuHeaderProps, ComponentState] = default
}
