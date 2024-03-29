package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsPlaceholderPlaceholderHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/PlaceholderHeader", JSImport.Default)
  @js.native
  val default: PlaceholderHeaderComponent = js.native
  
  type PlaceholderHeaderComponent = FC[PlaceholderHeaderProps]
  
  trait PlaceholderHeaderProps
    extends StObject
       with StrictPlaceholderHeaderProps
       with /* key */ StringDictionary[Any]
  object PlaceholderHeaderProps {
    
    inline def apply(): PlaceholderHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderHeaderProps]
    }
  }
  
  trait StrictPlaceholderHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A placeholder can contain an image. */
    var image: js.UndefOr[Boolean] = js.undefined
  }
  object StrictPlaceholderHeaderProps {
    
    inline def apply(): StrictPlaceholderHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPlaceholderHeaderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictPlaceholderHeaderProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setImage(value: Boolean): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
  
  type _To = PlaceholderHeaderComponent
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsElementsPlaceholderPlaceholderHeaderMod.foo` */
  override def _to: PlaceholderHeaderComponent = default
}
