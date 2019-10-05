package typings.prosemirrorDashTables.prosemirrorDashTablesMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.ResolvedPos
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "selectionCell")
@js.native
object selectionCell extends js.Object {
  def apply[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[ResolvedPos[S] | Null] = js.native
}

