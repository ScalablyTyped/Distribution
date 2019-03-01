package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfoOptions extends js.Object {
  var ignorePath: js.UndefOr[java.lang.String] = js.undefined
  var plugins: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var withNodeModules: js.UndefOr[scala.Boolean] = js.undefined
}

object FileInfoOptions {
  @scala.inline
  def apply(
    ignorePath: java.lang.String = null,
    plugins: js.Array[java.lang.String] = null,
    withNodeModules: js.UndefOr[scala.Boolean] = js.undefined
  ): FileInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(withNodeModules)) __obj.updateDynamic("withNodeModules")(withNodeModules)
    __obj.asInstanceOf[FileInfoOptions]
  }
}

