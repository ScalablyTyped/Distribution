package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticUiReact.distCommonjsViewsCardCardDescriptionMod.CardDescriptionProps
import typings.semanticUiReact.distCommonjsViewsCardCardHeaderMod.CardHeaderProps
import typings.semanticUiReact.distCommonjsViewsCardCardMetaMod.CardMetaProps
import typings.semanticUiReact.semanticUiReactStrings.center
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsCardCardContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Card/CardContent", JSImport.Default)
  @js.native
  val default: FC[CardContentProps] = js.native
  
  trait CardContentProps
    extends StObject
       with StrictCardContentProps
       with /* key */ StringDictionary[Any]
  object CardContentProps {
    
    inline def apply(): CardContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardContentProps]
    }
  }
  
  trait StrictCardContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for CardDescription. */
    var description: js.UndefOr[SemanticShorthandItem[CardDescriptionProps]] = js.undefined
    
    /** A card can contain extra content meant to be formatted separately from the main content. */
    var extra: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for CardHeader. */
    var header: js.UndefOr[SemanticShorthandItem[CardHeaderProps]] = js.undefined
    
    /** Shorthand for CardMeta. */
    var meta: js.UndefOr[SemanticShorthandItem[CardMetaProps]] = js.undefined
    
    /** A card content can adjust its text alignment. */
    var textAlign: js.UndefOr[center | left | right] = js.undefined
  }
  object StrictCardContentProps {
    
    inline def apply(): StrictCardContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCardContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictCardContentProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDescription(value: SemanticShorthandItem[CardDescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionFunction3(
        value: (/* component */ ElementType[CardDescriptionProps], CardDescriptionProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "description", js.Any.fromFunction3(value))
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExtra(value: Boolean): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setHeader(value: SemanticShorthandItem[CardHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFunction3(
        value: (/* component */ ElementType[CardHeaderProps], CardHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setMeta(value: SemanticShorthandItem[CardMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction3(
        value: (/* component */ ElementType[CardMetaProps], CardMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setTextAlign(value: center | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    }
  }
  
  type _To = FC[CardContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsCardCardContentMod.foo` */
  override def _to: FC[CardContentProps] = default
}
