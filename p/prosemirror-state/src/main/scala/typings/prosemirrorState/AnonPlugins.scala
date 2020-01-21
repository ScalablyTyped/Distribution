package typings.prosemirrorState

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlugins[S /* <: Schema[_, _] */] extends js.Object {
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.undefined
  var schema: js.UndefOr[S | Null] = js.undefined
}

object AnonPlugins {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](plugins: js.Array[Plugin[_, S]] = null, schema: S = null): AnonPlugins[S] = {
    val __obj = js.Dynamic.literal()
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlugins[S]]
  }
}

