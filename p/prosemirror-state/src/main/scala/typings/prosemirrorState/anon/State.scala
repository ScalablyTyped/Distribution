package typings.prosemirrorState.anon

import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  var state: EditorState[S]
  var transactions: js.Array[Transaction[S]]
}

object State {
  @scala.inline
  def apply[S](state: EditorState[S], transactions: js.Array[Transaction[S]]): State[S] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[S]]
  }
}

