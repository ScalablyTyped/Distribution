package typings.prosemirrorState.anon

import typings.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.undefined
  var schema: S
}

object Schema {
  @scala.inline
  def apply[S](schema: S, plugins: js.UndefOr[Null | (js.Array[Plugin[_, S]])] = js.undefined): Schema[S] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema[S]]
  }
}

