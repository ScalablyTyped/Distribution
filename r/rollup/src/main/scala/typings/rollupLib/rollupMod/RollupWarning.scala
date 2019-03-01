package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupWarning extends RollupLogProps {
  var exportName: js.UndefOr[java.lang.String] = js.undefined
  var exporter: js.UndefOr[java.lang.String] = js.undefined
  var guess: js.UndefOr[java.lang.String] = js.undefined
  var importer: js.UndefOr[java.lang.String] = js.undefined
  var missing: js.UndefOr[java.lang.String] = js.undefined
  var modules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var names: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reexporter: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var sources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RollupWarning {
  @scala.inline
  def apply(
    message: java.lang.String,
    code: java.lang.String = null,
    exportName: java.lang.String = null,
    exporter: java.lang.String = null,
    frame: java.lang.String = null,
    guess: java.lang.String = null,
    hook: java.lang.String = null,
    id: java.lang.String = null,
    importer: java.lang.String = null,
    loc: rollupLib.Anon_Column = null,
    missing: java.lang.String = null,
    modules: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    names: js.Array[java.lang.String] = null,
    plugin: java.lang.String = null,
    pluginCode: java.lang.String = null,
    pos: scala.Int | scala.Double = null,
    reexporter: java.lang.String = null,
    source: java.lang.String = null,
    sources: js.Array[java.lang.String] = null,
    url: java.lang.String = null
  ): RollupWarning = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (code != null) __obj.updateDynamic("code")(code)
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

