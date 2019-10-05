package typings.prosemirrorDashTables.prosemirrorDashTablesMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "setCellAttr")
@js.native
object setCellAttr extends js.Object {
  def apply[S /* <: Schema[_, _] */](name: String, value: js.Any): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}

