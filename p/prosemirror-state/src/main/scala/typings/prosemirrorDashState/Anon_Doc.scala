package typings.prosemirrorDashState

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Mark
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Node
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import typings.prosemirrorDashState.prosemirrorDashStateMod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[S /* <: Schema[_, _] */] extends js.Object {
  var doc: js.UndefOr[Node[S] | Null] = js.undefined
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.undefined
  var schema: js.UndefOr[S | Null] = js.undefined
  var selection: js.UndefOr[Selection[S] | Null] = js.undefined
  var storedMarks: js.UndefOr[js.Array[Mark[_]] | Null] = js.undefined
}

object Anon_Doc {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    doc: Node[S] = null,
    plugins: js.Array[Plugin[_, S]] = null,
    schema: S = null,
    selection: Selection[S] = null,
    storedMarks: js.Array[Mark[_]] = null
  ): Anon_Doc[S] = {
    val __obj = js.Dynamic.literal()
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (storedMarks != null) __obj.updateDynamic("storedMarks")(storedMarks)
    __obj.asInstanceOf[Anon_Doc[S]]
  }
}

