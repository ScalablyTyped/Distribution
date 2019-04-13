package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiffOptions extends OutputOptions {
  /** Compression options: lzw, deflate, jpeg, ccittfax4 (optional, default 'jpeg') */
  var compression: js.UndefOr[java.lang.String] = js.undefined
  /** Compression predictor options: none, horizontal, float (optional, default 'horizontal') */
  var predictor: js.UndefOr[java.lang.String] = js.undefined
  /** Squash 8-bit images down to 1 bit (optional, default false) */
  var squash: js.UndefOr[scala.Boolean] = js.undefined
  /** Horizontal resolution in pixels/mm (optional, default 1.0) */
  var xres: js.UndefOr[scala.Double] = js.undefined
  /** Vertical resolution in pixels/mm (optional, default 1.0) */
  var yres: js.UndefOr[scala.Double] = js.undefined
}

object TiffOptions {
  @scala.inline
  def apply(
    compression: java.lang.String = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    predictor: java.lang.String = null,
    quality: scala.Int | scala.Double = null,
    squash: js.UndefOr[scala.Boolean] = js.undefined,
    xres: scala.Int | scala.Double = null,
    yres: scala.Int | scala.Double = null
  ): TiffOptions = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (predictor != null) __obj.updateDynamic("predictor")(predictor)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(squash)) __obj.updateDynamic("squash")(squash)
    if (xres != null) __obj.updateDynamic("xres")(xres.asInstanceOf[js.Any])
    if (yres != null) __obj.updateDynamic("yres")(yres.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiffOptions]
  }
}

