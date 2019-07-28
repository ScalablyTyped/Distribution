package typings.rollup.rollupMod

import typings.node.Buffer
import typings.rollup.rollupNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputAsset extends js.Object {
  var code: js.UndefOr[scala.Nothing] = js.undefined
  var fileName: String
  var isAsset: `true`
  var source: String | Buffer
}

object OutputAsset {
  @scala.inline
  def apply(
    fileName: String,
    isAsset: `true`,
    source: String | Buffer,
    code: js.UndefOr[scala.Nothing] = js.undefined
  ): OutputAsset = {
    val __obj = js.Dynamic.literal(fileName = fileName, isAsset = isAsset, source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code)
    __obj.asInstanceOf[OutputAsset]
  }
}

