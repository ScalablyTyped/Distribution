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
import typings.semanticUiReact.distCommonjsViewsFeedFeedDateMod.FeedDateProps
import typings.semanticUiReact.distCommonjsViewsFeedFeedExtraMod.FeedExtraProps
import typings.semanticUiReact.distCommonjsViewsFeedFeedMetaMod.FeedMetaProps
import typings.semanticUiReact.distCommonjsViewsFeedFeedSummaryMod.FeedSummaryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsFeedFeedContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedContent", JSImport.Default)
  @js.native
  val default: FC[FeedContentProps] = js.native
  
  trait FeedContentProps
    extends StObject
       with StrictFeedContentProps
       with /* key */ StringDictionary[Any]
  object FeedContentProps {
    
    inline def apply(): FeedContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedContentProps]
    }
  }
  
  trait StrictFeedContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** An event can contain a date. */
    var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.undefined
    
    /** Shorthand for FeedExtra with images. */
    var extraImages: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.undefined
    
    /** Shorthand for FeedExtra with text. */
    var extraText: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.undefined
    
    /** Shorthand for FeedMeta. */
    var meta: js.UndefOr[SemanticShorthandItem[FeedMetaProps]] = js.undefined
    
    /** Shorthand for FeedSummary. */
    var summary: js.UndefOr[SemanticShorthandItem[FeedSummaryProps]] = js.undefined
  }
  object StrictFeedContentProps {
    
    inline def apply(): StrictFeedContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictFeedContentProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDate(value: SemanticShorthandItem[FeedDateProps]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateFunction3(
        value: (/* component */ ElementType[FeedDateProps], FeedDateProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "date", js.Any.fromFunction3(value))
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setExtraImages(value: SemanticShorthandItem[FeedExtraProps]): Self = StObject.set(x, "extraImages", value.asInstanceOf[js.Any])
      
      inline def setExtraImagesFunction3(
        value: (/* component */ ElementType[FeedExtraProps], FeedExtraProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "extraImages", js.Any.fromFunction3(value))
      
      inline def setExtraImagesUndefined: Self = StObject.set(x, "extraImages", js.undefined)
      
      inline def setExtraText(value: SemanticShorthandItem[FeedExtraProps]): Self = StObject.set(x, "extraText", value.asInstanceOf[js.Any])
      
      inline def setExtraTextFunction3(
        value: (/* component */ ElementType[FeedExtraProps], FeedExtraProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "extraText", js.Any.fromFunction3(value))
      
      inline def setExtraTextUndefined: Self = StObject.set(x, "extraText", js.undefined)
      
      inline def setMeta(value: SemanticShorthandItem[FeedMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaFunction3(
        value: (/* component */ ElementType[FeedMetaProps], FeedMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setSummary(value: SemanticShorthandItem[FeedSummaryProps]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryFunction3(
        value: (/* component */ ElementType[FeedSummaryProps], FeedSummaryProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "summary", js.Any.fromFunction3(value))
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  type _To = FC[FeedContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsFeedFeedContentMod.foo` */
  override def _to: FC[FeedContentProps] = default
}
