package typings.prosemirrorView.mod

import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectEditorProps[S /* <: Schema[_, _] */]
  extends EditorProps[js.Any, S] {
  
  /**
    * The callback over which to send transactions (state updates)
    * produced by the view. If you specify this, you probably want to
    * make sure this ends up calling the view's
    * [`updateState`](#view.EditorView.updateState) method with a new
    * state that has the transaction
    * [applied](#state.EditorState.apply). The callback will be bound to have
    * the view instance as its `this` binding.
    */
  var dispatchTransaction: js.UndefOr[
    (js.ThisFunction1[
      /* this */ EditorView[S], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
      Unit
    ]) | Null
  ] = js.native
  
  /**
    * The current state of the editor.
    */
  var state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any = js.native
}
object DirectEditorProps {
  
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
  ): DirectEditorProps[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectEditorProps[S]]
  }
  
  @scala.inline
  implicit class DirectEditorPropsOps[Self <: DirectEditorProps[_], S /* <: Schema[_, _] */] (val x: Self with DirectEditorProps[S]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EditorState<S> */ js.Any
    ): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatchTransaction(
      value: js.ThisFunction1[
          /* this */ EditorView[S], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Transaction<S> */ /* tr */ js.Any, 
          Unit
        ]
    ): Self = this.set("dispatchTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispatchTransaction: Self = this.set("dispatchTransaction", js.undefined)
    
    @scala.inline
    def setDispatchTransactionNull: Self = this.set("dispatchTransaction", null)
  }
}
