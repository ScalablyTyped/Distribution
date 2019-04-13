package typings
package sharpLib.sharpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PngOptions extends js.Object {
  /** use adaptive row filtering (optional, default false) */
  var adaptiveFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Alternative Spelling of "colours". Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colors: js.UndefOr[scala.Double] = js.undefined
  /** Maximum number of palette entries, requires libimagequant (optional, default 256) */
  var colours: js.UndefOr[scala.Double] = js.undefined
  /** zlib compression level, 0-9 (optional, default 9) */
  var compressionLevel: js.UndefOr[scala.Double] = js.undefined
  /**  Level of Floyd-Steinberg error diffusion, requires libimagequant (optional, default 1.0) */
  var dither: js.UndefOr[scala.Double] = js.undefined
  /** Force PNG output, otherwise attempt to use input format (optional, default  true) */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /** Quantise to a palette-based image with alpha transparency support, requires libimagequant (optional, default false) */
  var palette: js.UndefOr[scala.Boolean] = js.undefined
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[scala.Boolean] = js.undefined
  /** use the lowest number of colours needed to achieve given quality, requires libimagequant (optional, default `100`) */
  var quality: js.UndefOr[scala.Double] = js.undefined
}

object PngOptions {
  @scala.inline
  def apply(
    adaptiveFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    colors: scala.Int | scala.Double = null,
    colours: scala.Int | scala.Double = null,
    compressionLevel: scala.Int | scala.Double = null,
    dither: scala.Int | scala.Double = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    palette: js.UndefOr[scala.Boolean] = js.undefined,
    progressive: js.UndefOr[scala.Boolean] = js.undefined,
    quality: scala.Int | scala.Double = null
  ): PngOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adaptiveFiltering)) __obj.updateDynamic("adaptiveFiltering")(adaptiveFiltering)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (colours != null) __obj.updateDynamic("colours")(colours.asInstanceOf[js.Any])
    if (compressionLevel != null) __obj.updateDynamic("compressionLevel")(compressionLevel.asInstanceOf[js.Any])
    if (dither != null) __obj.updateDynamic("dither")(dither.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(palette)) __obj.updateDynamic("palette")(palette)
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[PngOptions]
  }
}

