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

object commentActionsMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentActions", JSImport.Default)
  @js.native
  val default: StatelessComponent[CommentActionsProps] = js.native
  
  @js.native
  trait CommentActionsProps
    extends StrictCommentActionsProps
       with /* key */ StringDictionary[js.Any]
  object CommentActionsProps {
    
    @scala.inline
    def apply(): CommentActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentActionsProps]
    }
  }
  
  @js.native
  trait StrictCommentActionsProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictCommentActionsProps {
    
    @scala.inline
    def apply(): StrictCommentActionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentActionsProps]
    }
    
    @scala.inline
    implicit class StrictCommentActionsPropsMutableBuilder[Self <: StrictCommentActionsProps] (val x: Self) extends AnyVal {
      
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
  
  type _To = StatelessComponent[CommentActionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `commentActionsMod.foo` */
  override def _to: StatelessComponent[CommentActionsProps] = default
}
