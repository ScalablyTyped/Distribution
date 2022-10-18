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

object distCommonjsModulesDimmerDimmerDimmableMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/DimmerDimmable", JSImport.Default)
  @js.native
  open class default protected () extends Component[DimmerDimmableProps, ComponentState, Any] {
    def this(props: DimmerDimmableProps) = this()
    def this(props: DimmerDimmableProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/DimmerDimmable", JSImport.Default)
  @js.native
  val default: ComponentClass[DimmerDimmableProps, ComponentState] = js.native
  
  trait DimmerDimmableProps
    extends StObject
       with StrictDimmerDimmableProps
       with /* key */ StringDictionary[Any]
  object DimmerDimmableProps {
    
    inline def apply(): DimmerDimmableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DimmerDimmableProps]
    }
  }
  
  trait StrictDimmerDimmableProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** A dimmable element can blur its contents. */
    var blurring: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Controls whether or not the dim is displayed. */
    var dimmed: js.UndefOr[Boolean] = js.undefined
  }
  object StrictDimmerDimmableProps {
    
    inline def apply(): StrictDimmerDimmableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDimmerDimmableProps]
    }
    
    extension [Self <: StrictDimmerDimmableProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBlurring(value: Boolean): Self = StObject.set(x, "blurring", value.asInstanceOf[js.Any])
      
      inline def setBlurringUndefined: Self = StObject.set(x, "blurring", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDimmed(value: Boolean): Self = StObject.set(x, "dimmed", value.asInstanceOf[js.Any])
      
      inline def setDimmedUndefined: Self = StObject.set(x, "dimmed", js.undefined)
    }
  }
  
  type _To = ComponentClass[DimmerDimmableProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsModulesDimmerDimmerDimmableMod.foo` */
  override def _to: ComponentClass[DimmerDimmableProps, ComponentState] = default
}
