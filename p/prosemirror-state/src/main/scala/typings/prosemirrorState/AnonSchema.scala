package typings.prosemirrorState

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSchema[S /* <: Schema[_, _] */] extends js.Object {
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.undefined
  var schema: S
}

object AnonSchema {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](schema: S, plugins: js.Array[Plugin[_, S]] = null): AnonSchema[S] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSchema[S]]
  }
}

