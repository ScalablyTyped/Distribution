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

