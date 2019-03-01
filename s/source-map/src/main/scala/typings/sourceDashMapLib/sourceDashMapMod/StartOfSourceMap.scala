package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOfSourceMap extends js.Object {
  var file: js.UndefOr[java.lang.String] = js.undefined
  var skipValidation: js.UndefOr[scala.Boolean] = js.undefined
  var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
}

object StartOfSourceMap {
  @scala.inline
  def apply(
    file: java.lang.String = null,
    skipValidation: js.UndefOr[scala.Boolean] = js.undefined,
    sourceRoot: java.lang.String = null
  ): StartOfSourceMap = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation)
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot)
    __obj.asInstanceOf[StartOfSourceMap]
  }
}

