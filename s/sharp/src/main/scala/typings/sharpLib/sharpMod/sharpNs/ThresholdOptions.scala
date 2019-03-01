package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThresholdOptions extends js.Object {
  /** alternative spelling for greyscale. (optional, default true) */
  var grayscale: js.UndefOr[scala.Boolean] = js.undefined
  /** convert to single channel greyscale. (optional, default true) */
  var greyscale: js.UndefOr[scala.Boolean] = js.undefined
}

object ThresholdOptions {
  @scala.inline
  def apply(
    grayscale: js.UndefOr[scala.Boolean] = js.undefined,
    greyscale: js.UndefOr[scala.Boolean] = js.undefined
  ): ThresholdOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(grayscale)) __obj.updateDynamic("grayscale")(grayscale)
    if (!js.isUndefined(greyscale)) __obj.updateDynamic("greyscale")(greyscale)
    __obj.asInstanceOf[ThresholdOptions]
  }
}

