package typings
package prosemirrorDashStateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Doc[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var doc: js.UndefOr[prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S] | scala.Null] = js.undefined
  var plugins: js.UndefOr[
    (js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, S]]) | scala.Null
  ] = js.undefined
  var schema: js.UndefOr[S | scala.Null] = js.undefined
  var selection: js.UndefOr[prosemirrorDashStateLib.prosemirrorDashStateMod.Selection[S] | scala.Null] = js.undefined
  var storedMarks: js.UndefOr[js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]] | scala.Null] = js.undefined
}

object Anon_Doc {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S] = null,
    plugins: js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, S]] = null,
    schema: S = null,
    selection: prosemirrorDashStateLib.prosemirrorDashStateMod.Selection[S] = null,
    storedMarks: js.Array[prosemirrorDashModelLib.prosemirrorDashModelMod.Mark[_]] = null
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

