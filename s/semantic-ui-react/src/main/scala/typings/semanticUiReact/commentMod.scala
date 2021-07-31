package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.commentActionMod.CommentActionProps
import typings.semanticUiReact.commentCommentMod.CommentComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment", JSImport.Default)
    @js.native
    val ^ : CommentComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment", "default.Action")
    @js.native
    class Action protected ()
      extends Component[CommentActionProps, ComponentState, js.Any] {
      def this(props: CommentActionProps) = this()
      def this(props: CommentActionProps, context: js.Any) = this()
    }
    
    type _To = CommentComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CommentComponent = ^
  }
}
