package typings
package prosemirrorDashStateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_State[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]
  var transactions: js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S]]
}

object Anon_State {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    transactions: js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S]]
  ): Anon_State[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("transactions")(transactions)
    __obj.asInstanceOf[Anon_State[S]]
  }
}

