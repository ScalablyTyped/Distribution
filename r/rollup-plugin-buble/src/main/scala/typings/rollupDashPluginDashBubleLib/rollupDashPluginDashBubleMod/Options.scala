package typings
package rollupDashPluginDashBubleLib.rollupDashPluginDashBubleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends bubleLib.bubleMod.TransformOptions {
  var exclude: js.UndefOr[
    (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
  ] = js.undefined
  // Every files will be parsed by default, but you can specify which files to include or exclude
  var include: js.UndefOr[
    (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
  ] = js.undefined
}

