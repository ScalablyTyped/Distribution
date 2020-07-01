package typings.prosemirrorState.anon

import typings.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins[S /* <: typings.prosemirrorModel.mod.Schema[_, _] */] extends js.Object {
  var plugins: js.UndefOr[(js.Array[Plugin[_, S]]) | Null] = js.undefined
  var schema: js.UndefOr[S | Null] = js.undefined
}

object Plugins {
  @scala.inline
  def apply[/* <: typings.prosemirrorModel.mod.Schema[_, _] */ S](
    plugins: js.UndefOr[Null | (js.Array[Plugin[_, S]])] = js.undefined,
    schema: js.UndefOr[Null | S] = js.undefined
  ): Plugins[S] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plugins)) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins[S]]
  }
}

