package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputOptions extends js.Object {
  /** Force format output, otherwise attempt to use input format (optional, default true) */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /** Quality, integer 1-100 (optional, default 80) */
  var quality: js.UndefOr[scala.Double] = js.undefined
}

object OutputOptions {
  @scala.inline
  def apply(force: js.UndefOr[scala.Boolean] = js.undefined, quality: scala.Int | scala.Double = null): OutputOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputOptions]
  }
}

