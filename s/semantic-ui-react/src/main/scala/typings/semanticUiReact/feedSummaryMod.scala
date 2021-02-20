package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.feedDateMod.FeedDateProps
import typings.semanticUiReact.feedUserMod.FeedUserProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedSummaryMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedSummary", JSImport.Default)
  @js.native
  val default: StatelessComponent[FeedSummaryProps] = js.native
  
  @js.native
  trait FeedSummaryProps
    extends StrictFeedSummaryProps
       with /* key */ StringDictionary[js.Any]
  object FeedSummaryProps {
    
    @scala.inline
    def apply(): FeedSummaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedSummaryProps]
    }
  }
  
  @js.native
  trait StrictFeedSummaryProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Shorthand for FeedDate. */
    var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.native
    
    /** Shorthand for FeedUser. */
    var user: js.UndefOr[SemanticShorthandItem[FeedUserProps]] = js.native
  }
  object StrictFeedSummaryProps {
    
    @scala.inline
    def apply(): StrictFeedSummaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedSummaryProps]
    }
    
    @scala.inline
    implicit class StrictFeedSummaryPropsMutableBuilder[Self <: StrictFeedSummaryProps] (val x: Self) extends AnyVal {
      
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
      def setUser(value: SemanticShorthandItem[FeedUserProps]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserFunction3(
        value: (/* component */ ElementType[FeedUserProps], FeedUserProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "user", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  type _To = StatelessComponent[FeedSummaryProps]
  
  /* This means you don't have to write `default`, but can instead just say `feedSummaryMod.foo` */
  override def _to: StatelessComponent[FeedSummaryProps] = default
}
