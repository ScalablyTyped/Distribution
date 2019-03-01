package typings
package rollupDashPluginDashSourcemapsLib.rollupDashPluginDashSourcemapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exclude: js.UndefOr[
    (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
  ] = js.undefined
  var include: js.UndefOr[
    (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp | scala.Null
  ] = js.undefined
  var readFile: js.UndefOr[ReadFileFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp = null,
    include: (js.Array[java.lang.String | stdLib.RegExp]) | java.lang.String | stdLib.RegExp = null,
    readFile: ReadFileFunction = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(readFile)
    __obj.asInstanceOf[Options]
  }
}

