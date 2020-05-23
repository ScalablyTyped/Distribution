package typings.rollup.mod

import typings.rollup.anon.Column
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupError extends RollupLogProps {
  var parserError: js.UndefOr[Error] = js.undefined
  var stack: js.UndefOr[String] = js.undefined
  var watchFiles: js.UndefOr[js.Array[String]] = js.undefined
}

object RollupError {
  @scala.inline
  def apply(
    message: String,
    code: String = null,
    frame: String = null,
    hook: String = null,
    id: String = null,
    loc: Column = null,
    name: String = null,
    parserError: Error = null,
    plugin: String = null,
    pluginCode: String = null,
    pos: js.UndefOr[Double] = js.undefined,
    stack: String = null,
    url: String = null,
    watchFiles: js.Array[String] = null
  ): RollupError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(hook.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parserError != null) __obj.updateDynamic("parserError")(parserError.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (pluginCode != null) __obj.updateDynamic("pluginCode")(pluginCode.asInstanceOf[js.Any])
    if (!js.isUndefined(pos)) __obj.updateDynamic("pos")(pos.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (watchFiles != null) __obj.updateDynamic("watchFiles")(watchFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupError]
  }
}

