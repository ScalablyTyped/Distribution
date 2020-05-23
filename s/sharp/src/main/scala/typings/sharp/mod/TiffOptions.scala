package typings.sharp.mod

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
    quality: js.UndefOr[Double] = js.undefined,
    squash: js.UndefOr[Boolean] = js.undefined,
    xres: js.UndefOr[Double] = js.undefined,
    yres: js.UndefOr[Double] = js.undefined
  ): TiffOptions = {
    val __obj = js.Dynamic.literal()
    if (compression != null) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (predictor != null) __obj.updateDynamic("predictor")(predictor.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(squash)) __obj.updateDynamic("squash")(squash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xres)) __obj.updateDynamic("xres")(xres.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yres)) __obj.updateDynamic("yres")(yres.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiffOptions]
  }
}

