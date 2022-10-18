package typings.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsViewsCommentCommentActionMod.CommentActionProps
import typings.semanticUiReact.distCommonjsViewsCommentCommentMod.CommentComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Comment extends Shortcut {
  
  @JSImport("semantic-ui-react", "Comment")
  @js.native
  val ^ : CommentComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Comment.Action")
  @js.native
  open class Action protected () extends Component[CommentActionProps, ComponentState, Any] {
    def this(props: CommentActionProps) = this()
    def this(props: CommentActionProps, context: Any) = this()
  }
  
  type _To = CommentComponent
  
  /* This means you don't have to write `^`, but can instead just say `Comment.foo` */
  override def _to: CommentComponent = ^
}
