package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.feedDateMod.FeedDateProps
import typings.semanticUiReact.feedExtraMod.FeedExtraProps
import typings.semanticUiReact.feedMetaMod.FeedMetaProps
import typings.semanticUiReact.feedSummaryMod.FeedSummaryProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedContent", JSImport.Default)
  @js.native
  val default: StatelessComponent[FeedContentProps] = js.native
  
  @js.native
  trait FeedContentProps
    extends StrictFeedContentProps
       with /* key */ StringDictionary[js.Any]
  object FeedContentProps {
    
    @scala.inline
    def apply(): FeedContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedContentProps]
    }
  }
  
  @js.native
  trait StrictFeedContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** An event can contain a date. */
    var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.native
    
    /** Shorthand for FeedExtra with images. */
    var extraImages: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.native
    
    /** Shorthand for FeedExtra with text. */
    var extraText: js.UndefOr[SemanticShorthandItem[FeedExtraProps]] = js.native
    
    /** Shorthand for FeedMeta. */
    var meta: js.UndefOr[SemanticShorthandItem[FeedMetaProps]] = js.native
    
    /** Shorthand for FeedSummary. */
    var summary: js.UndefOr[SemanticShorthandItem[FeedSummaryProps]] = js.native
  }
  object StrictFeedContentProps {
    
    @scala.inline
    def apply(): StrictFeedContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedContentProps]
    }
    
    @scala.inline
    implicit class StrictFeedContentPropsMutableBuilder[Self <: StrictFeedContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDate(value: SemanticShorthandItem[FeedDateProps]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFunction3(
        value: (/* component */ ElementType[FeedDateProps], FeedDateProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "date", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setExtraImages(value: SemanticShorthandItem[FeedExtraProps]): Self = StObject.set(x, "extraImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraImagesFunction3(
        value: (/* component */ ElementType[FeedExtraProps], FeedExtraProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "extraImages", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExtraImagesUndefined: Self = StObject.set(x, "extraImages", js.undefined)
      
      @scala.inline
      def setExtraText(value: SemanticShorthandItem[FeedExtraProps]): Self = StObject.set(x, "extraText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraTextFunction3(
        value: (/* component */ ElementType[FeedExtraProps], FeedExtraProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "extraText", js.Any.fromFunction3(value))
      
      @scala.inline
      def setExtraTextUndefined: Self = StObject.set(x, "extraText", js.undefined)
      
      @scala.inline
      def setMeta(value: SemanticShorthandItem[FeedMetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaFunction3(
        value: (/* component */ ElementType[FeedMetaProps], FeedMetaProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "meta", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setSummary(value: SemanticShorthandItem[FeedSummaryProps]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryFunction3(
        value: (/* component */ ElementType[FeedSummaryProps], FeedSummaryProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "summary", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  type _To = StatelessComponent[FeedContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `feedContentMod.foo` */
  override def _to: StatelessComponent[FeedContentProps] = default
}
