package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentAuthorMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentAuthor", JSImport.Default)
  @js.native
  val default: StatelessComponent[CommentAuthorProps] = js.native
  
  @js.native
  trait CommentAuthorProps
    extends StrictCommentAuthorProps
       with /* key */ StringDictionary[js.Any]
  object CommentAuthorProps {
    
    @scala.inline
    def apply(): CommentAuthorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentAuthorProps]
    }
  }
  
  @js.native
  trait StrictCommentAuthorProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictCommentAuthorProps {
    
    @scala.inline
    def apply(): StrictCommentAuthorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentAuthorProps]
    }
    
    @scala.inline
    implicit class StrictCommentAuthorPropsMutableBuilder[Self <: StrictCommentAuthorProps] (val x: Self) extends AnyVal {
      
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
    }
  }
  
  type _To = StatelessComponent[CommentAuthorProps]
  
  /* This means you don't have to write `default`, but can instead just say `commentAuthorMod.foo` */
  override def _to: StatelessComponent[CommentAuthorProps] = default
}
