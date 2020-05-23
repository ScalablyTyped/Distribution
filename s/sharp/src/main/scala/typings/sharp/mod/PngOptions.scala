package typings.sharp.mod

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
    colors: js.UndefOr[Double] = js.undefined,
    colours: js.UndefOr[Double] = js.undefined,
    compressionLevel: js.UndefOr[Double] = js.undefined,
    dither: js.UndefOr[Double] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    palette: js.UndefOr[Boolean] = js.undefined,
    progressive: js.UndefOr[Boolean] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined
  ): PngOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adaptiveFiltering)) __obj.updateDynamic("adaptiveFiltering")(adaptiveFiltering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colours)) __obj.updateDynamic("colours")(colours.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compressionLevel)) __obj.updateDynamic("compressionLevel")(compressionLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dither)) __obj.updateDynamic("dither")(dither.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(palette)) __obj.updateDynamic("palette")(palette.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PngOptions]
  }
}

