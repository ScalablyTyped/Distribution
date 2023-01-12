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
import typings.semanticUiReact.distCommonjsViewsFeedFeedLikeMod.FeedLikeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsFeedFeedMetaMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedMeta", JSImport.Default)
  @js.native
  val default: FC[FeedMetaProps] = js.native
  
  trait FeedMetaProps
    extends StObject
       with StrictFeedMetaProps
       with /* key */ StringDictionary[Any]
  object FeedMetaProps {
    
    inline def apply(): FeedMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedMetaProps]
    }
  }
  
  trait StrictFeedMetaProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Shorthand for FeedLike. */
    var like: js.UndefOr[SemanticShorthandItem[FeedLikeProps]] = js.undefined
  }
  object StrictFeedMetaProps {
    
    inline def apply(): StrictFeedMetaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedMetaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrictFeedMetaProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setLike(value: SemanticShorthandItem[FeedLikeProps]): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
      
      inline def setLikeFunction3(
        value: (/* component */ ElementType[FeedLikeProps], FeedLikeProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "like", js.Any.fromFunction3(value))
      
      inline def setLikeUndefined: Self = StObject.set(x, "like", js.undefined)
    }
  }
  
  type _To = FC[FeedMetaProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsFeedFeedMetaMod.foo` */
  override def _to: FC[FeedMetaProps] = default
}
