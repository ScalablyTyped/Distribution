package typings.sharp.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PngOptions extends js.Object {
  /** use adaptive row filtering (optional, default false) */
  var adaptiveFiltering: js.UndefOr[Boolean] = js.undefined
  /** Alternative Spelling of "colours". Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colors: js.UndefOr[Double] = js.undefined
  /** Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colours: js.UndefOr[Double] = js.undefined
  /** zlib compression level, 0-9 (optional, default 9) */
  var compressionLevel: js.UndefOr[Double] = js.undefined
  /**  Level of Floyd-Steinberg error diffusion, requires libimagequant (optional, default 1.0) */
  var dither: js.UndefOr[Double] = js.undefined
  /** Force PNG output, otherwise attempt to use input format (optional, default  true) */
  var force: js.UndefOr[Boolean] = js.undefined
  /** Quantise to a palette-based image with alpha transparency support, requires libimagequant (optional, default false) */
  var palette: js.UndefOr[Boolean] = js.undefined
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[Boolean] = js.undefined
  /** use the lowest number of colours needed to achieve given quality, requires libimagequant (optional, default `100`) */
  var quality: js.UndefOr[Double] = js.undefined
}

object PngOptions {
  @scala.inline
  def apply(
    adaptiveFiltering: js.UndefOr[Boolean] = js.undefined,
    colors: Int | Double = null,
    colours: Int | Double = null,
    compressionLevel: Int | Double = null,
    dither: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    palette: js.UndefOr[Boolean] = js.undefined,
    progressive: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null
  ): PngOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adaptiveFiltering)) __obj.updateDynamic("adaptiveFiltering")(adaptiveFiltering.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (colours != null) __obj.updateDynamic("colours")(colours.asInstanceOf[js.Any])
    if (compressionLevel != null) __obj.updateDynamic("compressionLevel")(compressionLevel.asInstanceOf[js.Any])
    if (dither != null) __obj.updateDynamic("dither")(dither.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(palette)) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[PngOptions]
  }
}

