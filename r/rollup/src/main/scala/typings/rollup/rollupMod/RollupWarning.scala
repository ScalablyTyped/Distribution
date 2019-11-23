package typings.rollup.rollupMod

import typings.rollup.Anon_Column
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
    loc: Anon_Column = null,
    missing: String = null,
    modules: js.Array[String] = null,
    name: String = null,
    names: js.Array[String] = null,
    plugin: String = null,
    pluginCode: String = null,
    pos: Int | Double = null,
    reexporter: String = null,
    source: String = null,
    sources: js.Array[String] = null,
    url: String = null
  ): RollupWarning = {
    val __obj = js.Dynamic.literal(message = message)
    if (chunkName != null) __obj.updateDynamic("chunkName")(chunkName)
    if (code != null) __obj.updateDynamic("code")(code)
    if (cycle != null) __obj.updateDynamic("cycle")(cycle)
    if (exportName != null) __obj.updateDynamic("exportName")(exportName)
    if (exporter != null) __obj.updateDynamic("exporter")(exporter)
    if (frame != null) __obj.updateDynamic("frame")(frame)
    if (guess != null) __obj.updateDynamic("guess")(guess)
    if (hook != null) __obj.updateDynamic("hook")(hook)
    if (id != null) __obj.updateDynamic("id")(id)
    if (importer != null) __obj.updateDynamic("importer")(importer)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (missing != null) __obj.updateDynamic("missing")(missing)
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (pluginCode != null) __obj.updateDynamic("pluginCode")(pluginCode)
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (reexporter != null) __obj.updateDynamic("reexporter")(reexporter)
    if (source != null) __obj.updateDynamic("source")(source)
    if (sources != null) __obj.updateDynamic("sources")(sources)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[RollupWarning]
  }
}

