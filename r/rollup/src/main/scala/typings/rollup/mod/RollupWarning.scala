package typings.rollup.mod

import typings.rollup.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupWarning extends RollupLogProps {
  var chunkName: js.UndefOr[String] = js.undefined
  var cycle: js.UndefOr[js.Array[String]] = js.undefined
  var exportName: js.UndefOr[String] = js.undefined
  var exporter: js.UndefOr[String] = js.undefined
  var guess: js.UndefOr[String] = js.undefined
  var importer: js.UndefOr[String] = js.undefined
  var missing: js.UndefOr[String] = js.undefined
  var modules: js.UndefOr[js.Array[String]] = js.undefined
  var names: js.UndefOr[js.Array[String]] = js.undefined
  var reexporter: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}

object RollupWarning {
  @scala.inline
  def apply(
    message: String,
    chunkName: String = null,
    code: String = null,
    cycle: js.Array[String] = null,
    exportName: String = null,
    exporter: String = null,
    frame: String = null,
    guess: String = null,
    hook: String = null,
    id: String = null,
    importer: String = null,
    loc: Column = null,
    missing: String = null,
    modules: js.Array[String] = null,
    name: String = null,
    names: js.Array[String] = null,
    plugin: String = null,
    pluginCode: String = null,
    pos: js.UndefOr[Double] = js.undefined,
    reexporter: String = null,
    source: String = null,
    sources: js.Array[String] = null,
    url: String = null
  ): RollupWarning = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (chunkName != null) __obj.updateDynamic("chunkName")(chunkName.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (cycle != null) __obj.updateDynamic("cycle")(cycle.asInstanceOf[js.Any])
    if (exportName != null) __obj.updateDynamic("exportName")(exportName.asInstanceOf[js.Any])
    if (exporter != null) __obj.updateDynamic("exporter")(exporter.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    if (guess != null) __obj.updateDynamic("guess")(guess.asInstanceOf[js.Any])
    if (hook != null) __obj.updateDynamic("hook")(hook.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (importer != null) __obj.updateDynamic("importer")(importer.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (plugin != null) __obj.updateDynamic("plugin")(plugin.asInstanceOf[js.Any])
    if (pluginCode != null) __obj.updateDynamic("pluginCode")(pluginCode.asInstanceOf[js.Any])
    if (!js.isUndefined(pos)) __obj.updateDynamic("pos")(pos.get.asInstanceOf[js.Any])
    if (reexporter != null) __obj.updateDynamic("reexporter")(reexporter.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupWarning]
  }
}

