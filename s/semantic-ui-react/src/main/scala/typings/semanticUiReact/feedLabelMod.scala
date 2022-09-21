package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.genericMod.HtmlImageProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.iconIconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedLabelMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedLabel", JSImport.Default)
  @js.native
  val default: FC[FeedLabelProps] = js.native
  
  trait FeedLabelProps
    extends StObject
       with StrictFeedLabelProps
       with /* key */ StringDictionary[Any]
  object FeedLabelProps {
    
    inline def apply(): FeedLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedLabelProps]
    }
  }
  
  trait StrictFeedLabelProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** An event can contain icon label. */
    var icon: js.UndefOr[SemanticShorthandItem[IconProps]] = js.undefined
    
    /** An event can contain image label. */
    var image: js.UndefOr[SemanticShorthandItem[HtmlImageProps]] = js.undefined
  }
  object StrictFeedLabelProps {
    
    inline def apply(): StrictFeedLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedLabelProps]
    }
    
    extension [Self <: StrictFeedLabelProps](x: Self) {
      
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
      
      inline def setImage(value: SemanticShorthandItem[HtmlImageProps]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageFunction3(
        value: (/* component */ ElementType[HtmlImageProps], HtmlImageProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "image", js.Any.fromFunction3(value))
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    }
  }
  
  type _To = FC[FeedLabelProps]
  
  /* This means you don't have to write `default`, but can instead just say `feedLabelMod.foo` */
  override def _to: FC[FeedLabelProps] = default
}
