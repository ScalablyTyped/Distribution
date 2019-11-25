package typings.rollup.rollupMod

import typings.rollup.Anon_Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupLogProps extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var frame: js.UndefOr[String] = js.undefined
  var hook: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var loc: js.UndefOr[Anon_Column] = js.undefined
  var message: String
  var name: js.UndefOr[String] = js.undefined
  var plugin: js.UndefOr[String] = js.undefined
  var pluginCode: js.UndefOr[String] = js.undefined
  var pos: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object RollupLogProps {
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
    url: String = null
  ): RollupLogProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(hook.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (pluginCode != null) __obj.updateDynamic("pluginCode")(pluginCode.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupLogProps]
  }
}

