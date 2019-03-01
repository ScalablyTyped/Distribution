package typings
package prosemirrorDashStateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Plugins[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var plugins: js.UndefOr[
    (js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, S]]) | scala.Null
  ] = js.undefined
  var schema: js.UndefOr[S | scala.Null] = js.undefined
}

object Anon_Plugins {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    plugins: js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, S]] = null,
    schema: S = null
  ): Anon_Plugins[S] = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Plugins[S]]
  }
}

