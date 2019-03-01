package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpOptions extends OutputOptions {
  /** Quality of alpha layer, number from 0-100 (optional, default 100) */
  var alphaQuality: js.UndefOr[scala.Double] = js.undefined
  /** Use lossless compression mode (optional, default false) */
  var lossless: js.UndefOr[scala.Boolean] = js.undefined
  /** Use near_lossless compression mode (optional, default false) */
  var nearLossless: js.UndefOr[scala.Boolean] = js.undefined
}

object WebpOptions {
  @scala.inline
  def apply(
    alphaQuality: scala.Int | scala.Double = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    lossless: js.UndefOr[scala.Boolean] = js.undefined,
    nearLossless: js.UndefOr[scala.Boolean] = js.undefined,
    quality: scala.Int | scala.Double = null
  ): WebpOptions = {
    val __obj = js.Dynamic.literal()
    if (alphaQuality != null) __obj.updateDynamic("alphaQuality")(alphaQuality.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(lossless)) __obj.updateDynamic("lossless")(lossless)
    if (!js.isUndefined(nearLossless)) __obj.updateDynamic("nearLossless")(nearLossless)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpOptions]
  }
}

