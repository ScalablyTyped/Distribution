package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupLogProps extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var frame: js.UndefOr[java.lang.String] = js.undefined
  var hook: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var loc: js.UndefOr[rollupLib.Anon_Column] = js.undefined
  var message: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var plugin: js.UndefOr[java.lang.String] = js.undefined
  var pluginCode: js.UndefOr[java.lang.String] = js.undefined
  var pos: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object RollupLogProps {
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
    url: java.lang.String = null
  ): RollupLogProps = {
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
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RollupLogProps]
  }
}

