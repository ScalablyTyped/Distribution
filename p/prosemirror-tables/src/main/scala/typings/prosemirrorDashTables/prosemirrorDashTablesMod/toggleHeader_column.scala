package typings.prosemirrorDashTables.prosemirrorDashTablesMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import typings.prosemirrorDashTables.Anon_UseDeprecatedLogic
import typings.prosemirrorDashTables.prosemirrorDashTablesStrings.column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "toggleHeader")
@js.native
object toggleHeader_column extends js.Object {
  def apply[S /* <: Schema[_, _] */](`type`: column): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def apply[S /* <: Schema[_, _] */](`type`: column, options: Anon_UseDeprecatedLogic): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}

