package typings
package prosemirrorDashStateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PluginsSchema[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] extends js.Object {
  var plugins: js.UndefOr[
    (js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, S]]) | scala.Null
  ] = js.undefined
  var schema: S
}

object Anon_PluginsSchema {
  @scala.inline
  def apply[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](schema: S, plugins: js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, S]] = null): Anon_PluginsSchema[S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    __obj.asInstanceOf[Anon_PluginsSchema[S]]
  }
}

