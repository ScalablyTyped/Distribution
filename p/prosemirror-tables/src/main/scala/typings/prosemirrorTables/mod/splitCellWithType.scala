package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "splitCellWithType")
@js.native
object splitCellWithType extends js.Object {
  def apply[S /* <: Schema[_, _] */](getCellType: js.Function1[/* options */ GetCellTypeOptions, NodeType[S]]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}

