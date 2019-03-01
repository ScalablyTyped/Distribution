package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JpegOptions extends OutputOptions {
  /** Set to '4:4:4' to prevent chroma subsampling when quality <= 90 (optional, default '4:2:0') */
  var chromaSubsampling: js.UndefOr[java.lang.String] = js.undefined
  /** Optimise Huffman coding tables (optional, default true) */
  var optimiseCoding: js.UndefOr[scala.Boolean] = js.undefined
  /** Optimise progressive scans, forces progressive, requires mozjpeg (optional, default false) */
  var optimiseScans: js.UndefOr[scala.Boolean] = js.undefined
  /** Alternative spelling of optimiseCoding (optional, default true) */
  var optimizeCoding: js.UndefOr[scala.Boolean] = js.undefined
  /** Alternative spelling of optimiseScans (optional, default false) */
  var optimizeScans: js.UndefOr[scala.Boolean] = js.undefined
  /** Apply overshoot deringing, requires mozjpeg (optional, default  false) */
  var overshootDeringing: js.UndefOr[scala.Boolean] = js.undefined
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[scala.Boolean] = js.undefined
  /** Quantization table to use, integer 0-8, requires mozjpeg (optional, default 0) */
  var quantisationTable: js.UndefOr[scala.Double] = js.undefined
  /** Alternative spelling of quantisationTable (optional, default 0) */
  var quantizationTable: js.UndefOr[scala.Double] = js.undefined
  /** Apply trellis quantisation, requires mozjpeg (optional, default  false) */
  var trellisQuantisation: js.UndefOr[scala.Boolean] = js.undefined
}

object JpegOptions {
  @scala.inline
  def apply(
    chromaSubsampling: java.lang.String = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    optimiseCoding: js.UndefOr[scala.Boolean] = js.undefined,
    optimiseScans: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeCoding: js.UndefOr[scala.Boolean] = js.undefined,
    optimizeScans: js.UndefOr[scala.Boolean] = js.undefined,
    overshootDeringing: js.UndefOr[scala.Boolean] = js.undefined,
    progressive: js.UndefOr[scala.Boolean] = js.undefined,
    quality: scala.Int | scala.Double = null,
    quantisationTable: scala.Int | scala.Double = null,
    quantizationTable: scala.Int | scala.Double = null,
    trellisQuantisation: js.UndefOr[scala.Boolean] = js.undefined
  ): JpegOptions = {
    val __obj = js.Dynamic.literal()
    if (chromaSubsampling != null) __obj.updateDynamic("chromaSubsampling")(chromaSubsampling)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(optimiseCoding)) __obj.updateDynamic("optimiseCoding")(optimiseCoding)
    if (!js.isUndefined(optimiseScans)) __obj.updateDynamic("optimiseScans")(optimiseScans)
    if (!js.isUndefined(optimizeCoding)) __obj.updateDynamic("optimizeCoding")(optimizeCoding)
    if (!js.isUndefined(optimizeScans)) __obj.updateDynamic("optimizeScans")(optimizeScans)
    if (!js.isUndefined(overshootDeringing)) __obj.updateDynamic("overshootDeringing")(overshootDeringing)
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (quantisationTable != null) __obj.updateDynamic("quantisationTable")(quantisationTable.asInstanceOf[js.Any])
    if (quantizationTable != null) __obj.updateDynamic("quantizationTable")(quantizationTable.asInstanceOf[js.Any])
    if (!js.isUndefined(trellisQuantisation)) __obj.updateDynamic("trellisQuantisation")(trellisQuantisation)
    __obj.asInstanceOf[JpegOptions]
  }
}

