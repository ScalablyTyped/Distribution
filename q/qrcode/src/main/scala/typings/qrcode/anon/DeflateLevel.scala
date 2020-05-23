package typings.qrcode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeflateLevel extends js.Object {
  /**
    * Compression level for deflate.
    * Default: 9
    */
  var deflateLevel: js.UndefOr[Double] = js.undefined
  /**
    * Compression strategy for deflate.
    * Default: 3
    */
  var deflateStrategy: js.UndefOr[Double] = js.undefined
}

object DeflateLevel {
  @scala.inline
  def apply(
    deflateLevel: js.UndefOr[Double] = js.undefined,
    deflateStrategy: js.UndefOr[Double] = js.undefined
  ): DeflateLevel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deflateLevel)) __obj.updateDynamic("deflateLevel")(deflateLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deflateStrategy)) __obj.updateDynamic("deflateStrategy")(deflateStrategy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeflateLevel]
  }
}

