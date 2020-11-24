package typings.prosemirrorState.anon

import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  
  var state: EditorState[S] = js.native
  
  var transactions: js.Array[Transaction[S]] = js.native
}
object State {
  
  @scala.inline
  def apply[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */](state: EditorState[S], transactions: js.Array[Transaction[S]]): State[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[S]]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State[_], S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] (val x: Self with State[S]) extends AnyVal {
    
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
    def setState(value: EditorState[S]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionsVarargs(value: Transaction[S]*): Self = this.set("transactions", js.Array(value :_*))
    
    @scala.inline
    def setTransactions(value: js.Array[Transaction[S]]): Self = this.set("transactions", value.asInstanceOf[js.Any])
  }
}
