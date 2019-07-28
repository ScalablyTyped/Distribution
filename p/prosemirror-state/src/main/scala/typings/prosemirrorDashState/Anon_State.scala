package typings.prosemirrorDashState

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State[S /* <: Schema[_, _] */] extends js.Object {
  var state: EditorState[S]
  var transactions: js.Array[Transaction[S]]
}

object Anon_State {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](state: EditorState[S], transactions: js.Array[Transaction[S]]): Anon_State[S] = {
    val __obj = js.Dynamic.literal(state = state, transactions = transactions)
  
    __obj.asInstanceOf[Anon_State[S]]
  }
}

