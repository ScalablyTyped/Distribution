package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupError extends RollupLogProps {
  var stack: js.UndefOr[java.lang.String] = js.undefined
}

object RollupError {
  @scala.inline
  def apply(
    message: java.lang.String,
    code: java.lang.String = null,
    frame: java.lang.String = null,
    hook: java.lang.String = null,
    id: java.lang.String = null,
    loc: rollupLib.Anon_Column = null,
    name: java.lang.String = null,
    plugin: java.lang.String = null,
    pluginCode: java.lang.String = null,
    pos: scala.Int | scala.Double = null,
    stack: java.lang.String = null,
    url: java.lang.String = null
  ): RollupError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
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

