package typings
package rollupDashPluginDashNodeDashGlobalsLib.rollupDashPluginDashNodeDashGlobalsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var baseDir: js.UndefOr[java.lang.String] = js.undefined
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  var dirname: js.UndefOr[scala.Boolean] = js.undefined
  var exclude: js.UndefOr[
    (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
  ] = js.undefined
  var filename: js.UndefOr[scala.Boolean] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  // Every files will be parsed by default, but you can specify which files to include or exclude
  var include: js.UndefOr[
    (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
  ] = js.undefined
  // Plugin's options
  var process: js.UndefOr[scala.Boolean] = js.undefined
  // Enable sourcemaps support
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baseDir: java.lang.String = null,
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    dirname: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp = null,
    filename: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    include: (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp = null,
    process: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (!js.isUndefined(dirname)) __obj.updateDynamic("dirname")(dirname)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(filename)) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(process)) __obj.updateDynamic("process")(process)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[Options]
  }
}

