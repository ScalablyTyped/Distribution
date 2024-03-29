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
import typings.semanticUiReact.distCommonjsViewsFeedFeedUserMod.FeedUserProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsFeedFeedSummaryMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedSummary", JSImport.Default)
  @js.native
  val default: FC[FeedSummaryProps] = js.native
  
  trait FeedSummaryProps
    extends StObject
       with StrictFeedSummaryProps
       with /* key */ StringDictionary[Any]
  object FeedSummaryProps {
    
    inline def apply(): FeedSummaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedSummaryProps]
    }
  }
  
  trait StrictFeedSummaryProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for FeedDate. */
    var date: js.UndefOr[SemanticShorthandItem[FeedDateProps]] = js.undefined
    
    /** Shorthand for FeedUser. */
    var user: js.UndefOr[SemanticShorthandItem[FeedUserProps]] = js.undefined
  }
  object StrictFeedSummaryProps {
    
    inline def apply(): StrictFeedSummaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedSummaryProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictFeedSummaryProps] (val x: Self) extends AnyVal {
      
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
      
      inline def setUser(value: SemanticShorthandItem[FeedUserProps]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserFunction3(
        value: (/* component */ ElementType[FeedUserProps], FeedUserProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "user", js.Any.fromFunction3(value))
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  type _To = FC[FeedSummaryProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsFeedFeedSummaryMod.foo` */
  override def _to: FC[FeedSummaryProps] = default
}
