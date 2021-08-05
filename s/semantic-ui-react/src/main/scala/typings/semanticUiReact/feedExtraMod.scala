package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.HtmlImageProps
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedExtraMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedExtra", JSImport.Default)
  @js.native
  val default: StatelessComponent[FeedExtraProps] = js.native
  
  trait FeedExtraProps
    extends StObject
       with StrictFeedExtraProps
       with /* key */ StringDictionary[js.Any]
  object FeedExtraProps {
    
    inline def apply(): FeedExtraProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedExtraProps]
    }
  }
  
  trait StrictFeedExtraProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** An event can contain additional information like a set of images. */
    var images: js.UndefOr[Boolean | js.Array[SemanticShorthandCollection[HtmlImageProps]]] = js.undefined
    
    /** An event can contain additional text information. */
    var text: js.UndefOr[Boolean] = js.undefined
  }
  object StrictFeedExtraProps {
    
    inline def apply(): StrictFeedExtraProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedExtraProps]
    }
    
    extension [Self <: StrictFeedExtraProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setImages(value: Boolean | js.Array[SemanticShorthandCollection[HtmlImageProps]]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
      
      inline def setImagesVarargs(value: SemanticShorthandCollection[HtmlImageProps]*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      inline def setText(value: Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type _To = StatelessComponent[FeedExtraProps]
  
  /* This means you don't have to write `default`, but can instead just say `feedExtraMod.foo` */
  override def _to: StatelessComponent[FeedExtraProps] = default
}
