package typings.rollup.rollupMod

import typings.rollup.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupError extends RollupLogProps {
  var stack: js.UndefOr[String] = js.undefined
}

object RollupError {
  @scala.inline
  def apply(
    message: String,
    code: String = null,
    frame: String = null,
    hook: String = null,
    id: String = null,
    loc: Anon_Column = null,
    name: String = null,
    plugin: String = null,
    pluginCode: String = null,
    pos: Int | Double = null,
    stack: String = null,
    url: String = null
  ): RollupError = {
    val __obj = js.Dynamic.literal(message = message)
    if (code != null) __obj.updateDynamic("code")(code)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (hook != null) __obj.updateDynamic("hook")(hook)
    if (id != null) __obj.updateDynamic("id")(id)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (pluginCode != null) __obj.updateDynamic("pluginCode")(pluginCode)
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RollupError]
  }
}

