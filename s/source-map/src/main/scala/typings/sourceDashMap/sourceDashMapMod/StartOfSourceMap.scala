package typings.sourceDashMap.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOfSourceMap extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var skipValidation: js.UndefOr[Boolean] = js.undefined
  var sourceRoot: js.UndefOr[String] = js.undefined
}

object StartOfSourceMap {
  @scala.inline
  def apply(file: String = null, skipValidation: js.UndefOr[Boolean] = js.undefined, sourceRoot: String = null): StartOfSourceMap = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[StartOfSourceMap]
  }
}

