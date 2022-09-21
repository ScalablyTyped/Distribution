package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.placeholderHeaderMod.PlaceholderHeaderComponent
import typings.semanticUiReact.placeholderImageMod.PlaceholderImageComponent
import typings.semanticUiReact.placeholderLineMod.PlaceholderLineComponent
import typings.semanticUiReact.placeholderParagraphMod.PlaceholderParagraphComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object placeholderPlaceholderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Placeholder/Placeholder", JSImport.Default)
  @js.native
  val default: PlaceholderComponent = js.native
  
  @js.native
  trait PlaceholderComponent
    extends StObject
       with FunctionComponent[PlaceholderProps] {
    
    var Header: PlaceholderHeaderComponent = js.native
    
    var Image: PlaceholderImageComponent = js.native
    
    var Line: PlaceholderLineComponent = js.native
    
    var Paragraph: PlaceholderParagraphComponent = js.native
  }
  
  trait PlaceholderProps
    extends StObject
       with StrictPlaceholderProps
       with /* key */ StringDictionary[Any]
  object PlaceholderProps {
    
    inline def apply(): PlaceholderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlaceholderProps]
    }
  }
  
  trait StrictPlaceholderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A fluid placeholder takes up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** A placeholder can have their colors inverted. */
    var inverted: js.UndefOr[Boolean] = js.undefined
  }
  object StrictPlaceholderProps {
    
    inline def apply(): StrictPlaceholderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPlaceholderProps]
    }
    
    extension [Self <: StrictPlaceholderProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    }
  }
  
  type _To = PlaceholderComponent
  
  /* This means you don't have to write `default`, but can instead just say `placeholderPlaceholderMod.foo` */
  override def _to: PlaceholderComponent = default
}
