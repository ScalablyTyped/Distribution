package typings.prosemirrorState.anon

import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doc[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  var doc: js.UndefOr[Node[S] | Null] = js.undefined
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.undefined
  var schema: js.UndefOr[S | Null] = js.undefined
  var selection: js.UndefOr[Selection[S] | Null] = js.undefined
  var storedMarks: js.UndefOr[js.Array[Mark[_]] | Null] = js.undefined
}

object Doc {
  @scala.inline
  def apply[S](
    doc: js.UndefOr[Null | Node[S]] = js.undefined,
    plugins: js.UndefOr[Null | (js.Array[Plugin[_, S]])] = js.undefined,
    schema: js.UndefOr[Null | S] = js.undefined,
    selection: js.UndefOr[Null | Selection[S]] = js.undefined,
    storedMarks: js.UndefOr[Null | js.Array[Mark[_]]] = js.undefined
  ): Doc[S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doc)) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(selection)) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(storedMarks)) __obj.updateDynamic("storedMarks")(storedMarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc[S]]
  }
}

