package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TiffOptions extends OutputOptions {
  /** Compression options: lzw, deflate, jpeg, ccittfax4 (optional, default 'jpeg') */
  var compression: js.UndefOr[String] = js.undefined
  /** Compression predictor options: none, horizontal, float (optional, default 'horizontal') */
  var predictor: js.UndefOr[String] = js.undefined
  /** Squash 8-bit images down to 1 bit (optional, default false) */
  var squash: js.UndefOr[Boolean] = js.undefined
  /** Horizontal resolution in pixels/mm (optional, default 1.0) */
  var xres: js.UndefOr[Double] = js.undefined
  /** Vertical resolution in pixels/mm (optional, default 1.0) */
  var yres: js.UndefOr[Double] = js.undefined
}

object TiffOptions {
  @scala.inline
  def apply(
    compression: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    predictor: String = null,
    quality: Int | Double = null,
    squash: js.UndefOr[Boolean] = js.undefined,
    xres: Int | Double = null,
    yres: Int | Double = null
  ): TiffOptions = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (predictor != null) __obj.updateDynamic("predictor")(predictor.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(squash)) __obj.updateDynamic("squash")(squash.asInstanceOf[js.Any])
    if (xres != null) __obj.updateDynamic("xres")(xres.asInstanceOf[js.Any])
    if (yres != null) __obj.updateDynamic("yres")(yres.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiffOptions]
  }
}

