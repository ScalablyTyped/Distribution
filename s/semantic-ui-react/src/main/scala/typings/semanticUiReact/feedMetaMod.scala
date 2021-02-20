package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.feedLikeMod.FeedLikeProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedMetaMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedMeta", JSImport.Default)
  @js.native
  val default: StatelessComponent[FeedMetaProps] = js.native
  
  @js.native
  trait FeedMetaProps
    extends StrictFeedMetaProps
       with /* key */ StringDictionary[js.Any]
  object FeedMetaProps {
    
    @scala.inline
    def apply(): FeedMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedMetaProps]
    }
  }
  
  @js.native
  trait StrictFeedMetaProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Shorthand for FeedLike. */
    var like: js.UndefOr[SemanticShorthandItem[FeedLikeProps]] = js.native
  }
  object StrictFeedMetaProps {
    
    @scala.inline
    def apply(): StrictFeedMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedMetaProps]
    }
    
    @scala.inline
    implicit class StrictFeedMetaPropsMutableBuilder[Self <: StrictFeedMetaProps] (val x: Self) extends AnyVal {
      
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
      def setLike(value: SemanticShorthandItem[FeedLikeProps]): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLikeFunction3(
        value: (/* component */ ElementType[FeedLikeProps], FeedLikeProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "like", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLikeUndefined: Self = StObject.set(x, "like", js.undefined)
    }
  }
  
  type _To = StatelessComponent[FeedMetaProps]
  
  /* This means you don't have to write `default`, but can instead just say `feedMetaMod.foo` */
  override def _to: StatelessComponent[FeedMetaProps] = default
}
