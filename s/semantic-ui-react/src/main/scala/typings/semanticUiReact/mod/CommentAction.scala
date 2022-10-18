package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsViewsCommentCommentActionMod.CommentActionProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "CommentAction")
@js.native
open class CommentAction protected () extends Component[CommentActionProps, ComponentState, Any] {
  def this(props: CommentActionProps) = this()
  def this(props: CommentActionProps, context: Any) = this()
}
object CommentAction {
  
  inline def apply: ComponentClass[CommentActionProps, ComponentState] = ^.asInstanceOf[js.Dynamic].selectDynamic("CommentAction").asInstanceOf[ComponentClass[CommentActionProps, ComponentState]]
}
