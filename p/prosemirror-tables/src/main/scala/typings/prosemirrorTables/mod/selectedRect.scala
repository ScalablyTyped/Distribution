package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "selectedRect")
@js.native
object selectedRect extends js.Object {
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): TableRect = js.native
}

