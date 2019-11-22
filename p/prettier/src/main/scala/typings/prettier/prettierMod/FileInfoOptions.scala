package typings.prettier.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfoOptions extends js.Object {
  var ignorePath: js.UndefOr[String] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var resolveConfig: js.UndefOr[Boolean] = js.undefined
  var withNodeModules: js.UndefOr[Boolean] = js.undefined
}

object FileInfoOptions {
  @scala.inline
  def apply(
    ignorePath: String = null,
    plugins: js.Array[String] = null,
    resolveConfig: js.UndefOr[Boolean] = js.undefined,
    withNodeModules: js.UndefOr[Boolean] = js.undefined
  ): FileInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(resolveConfig)) __obj.updateDynamic("resolveConfig")(resolveConfig)
    if (!js.isUndefined(withNodeModules)) __obj.updateDynamic("withNodeModules")(withNodeModules)
    __obj.asInstanceOf[FileInfoOptions]
  }
}

