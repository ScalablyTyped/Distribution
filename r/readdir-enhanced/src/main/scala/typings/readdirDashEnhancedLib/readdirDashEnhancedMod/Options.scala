package typings
package readdirDashEnhancedLib.readdirDashEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var deep: js.UndefOr[scala.Boolean | scala.Double | stdLib.RegExp | FilterFunction] = js.undefined
  var filter: js.UndefOr[java.lang.String | stdLib.RegExp | FilterFunction] = js.undefined
  var fs: js.UndefOr[FileSystem] = js.undefined
  var sep: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basePath: java.lang.String = null,
    deep: scala.Boolean | scala.Double | stdLib.RegExp | FilterFunction = null,
    filter: java.lang.String | stdLib.RegExp | FilterFunction = null,
    fs: FileSystem = null,
    sep: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (deep != null) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (fs != null) __obj.updateDynamic("fs")(fs)
    if (sep != null) __obj.updateDynamic("sep")(sep)
    __obj.asInstanceOf[Options]
  }
}

