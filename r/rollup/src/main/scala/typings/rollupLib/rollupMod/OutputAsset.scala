package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputAsset extends js.Object {
  var code: js.UndefOr[scala.Nothing] = js.undefined
  var fileName: java.lang.String
  var isAsset: rollupLib.rollupLibNumbers.`true`
  var source: java.lang.String | nodeLib.Buffer
}

object OutputAsset {
  @scala.inline
  def apply(
    fileName: java.lang.String,
    isAsset: rollupLib.rollupLibNumbers.`true`,
    source: java.lang.String | nodeLib.Buffer,
    code: js.UndefOr[scala.Nothing] = js.undefined
  ): OutputAsset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("isAsset")(isAsset)
    __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code)
    __obj.asInstanceOf[OutputAsset]
  }
}

