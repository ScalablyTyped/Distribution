package typings.prosemirrorState

import typings.prosemirrorModel.mod.Mark
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDoc[S /* <: Schema[_, _] */] extends js.Object {
  var doc: js.UndefOr[Node[S] | Null] = js.undefined
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.undefined
  var schema: js.UndefOr[S | Null] = js.undefined
  var selection: js.UndefOr[Selection[S] | Null] = js.undefined
  var storedMarks: js.UndefOr[js.Array[Mark[_]] | Null] = js.undefined
}

object AnonDoc {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    doc: Node[S] = null,
    plugins: js.Array[Plugin[_, S]] = null,
    schema: S = null,
    selection: Selection[S] = null,
    storedMarks: js.Array[Mark[_]] = null
  ): AnonDoc[S] = {
    val __obj = js.Dynamic.literal()
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (storedMarks != null) __obj.updateDynamic("storedMarks")(storedMarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDoc[S]]
  }
}

