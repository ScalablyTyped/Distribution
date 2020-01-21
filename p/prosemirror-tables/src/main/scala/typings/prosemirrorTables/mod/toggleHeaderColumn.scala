package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "toggleHeaderColumn")
@js.native
object toggleHeaderColumn extends js.Object {
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def apply[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
}

