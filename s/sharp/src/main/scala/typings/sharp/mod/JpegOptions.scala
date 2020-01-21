package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JpegOptions extends OutputOptions {
  /** Set to '4:4:4' to prevent chroma subsampling when quality <= 90 (optional, default '4:2:0') */
  var chromaSubsampling: js.UndefOr[String] = js.undefined
  /** Optimise Huffman coding tables (optional, default true) */
  var optimiseCoding: js.UndefOr[Boolean] = js.undefined
  /** Optimise progressive scans, forces progressive, requires mozjpeg (optional, default false) */
  var optimiseScans: js.UndefOr[Boolean] = js.undefined
  /** Alternative spelling of optimiseCoding (optional, default true) */
  var optimizeCoding: js.UndefOr[Boolean] = js.undefined
  /** Alternative spelling of optimiseScans (optional, default false) */
  var optimizeScans: js.UndefOr[Boolean] = js.undefined
  /** Apply overshoot deringing, requires mozjpeg (optional, default  false) */
  var overshootDeringing: js.UndefOr[Boolean] = js.undefined
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[Boolean] = js.undefined
  /** Quantization table to use, integer 0-8, requires mozjpeg (optional, default 0) */
  var quantisationTable: js.UndefOr[Double] = js.undefined
  /** Alternative spelling of quantisationTable (optional, default 0) */
  var quantizationTable: js.UndefOr[Double] = js.undefined
  /** Apply trellis quantisation, requires mozjpeg (optional, default  false) */
  var trellisQuantisation: js.UndefOr[Boolean] = js.undefined
}

object JpegOptions {
  @scala.inline
  def apply(
    chromaSubsampling: String = null,
    force: js.UndefOr[Boolean] = js.undefined,
    optimiseCoding: js.UndefOr[Boolean] = js.undefined,
    optimiseScans: js.UndefOr[Boolean] = js.undefined,
    optimizeCoding: js.UndefOr[Boolean] = js.undefined,
    optimizeScans: js.UndefOr[Boolean] = js.undefined,
    overshootDeringing: js.UndefOr[Boolean] = js.undefined,
    progressive: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    quantisationTable: Int | Double = null,
    quantizationTable: Int | Double = null,
    trellisQuantisation: js.UndefOr[Boolean] = js.undefined
  ): JpegOptions = {
    val __obj = js.Dynamic.literal()
    if (chromaSubsampling != null) __obj.updateDynamic("chromaSubsampling")(chromaSubsampling.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(optimiseCoding)) __obj.updateDynamic("optimiseCoding")(optimiseCoding.asInstanceOf[js.Any])
    if (!js.isUndefined(optimiseScans)) __obj.updateDynamic("optimiseScans")(optimiseScans.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeCoding)) __obj.updateDynamic("optimizeCoding")(optimizeCoding.asInstanceOf[js.Any])
    if (!js.isUndefined(optimizeScans)) __obj.updateDynamic("optimizeScans")(optimizeScans.asInstanceOf[js.Any])
    if (!js.isUndefined(overshootDeringing)) __obj.updateDynamic("overshootDeringing")(overshootDeringing.asInstanceOf[js.Any])
    if (!js.isUndefined(progressive)) __obj.updateDynamic("progressive")(progressive.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (quantisationTable != null) __obj.updateDynamic("quantisationTable")(quantisationTable.asInstanceOf[js.Any])
    if (quantizationTable != null) __obj.updateDynamic("quantizationTable")(quantizationTable.asInstanceOf[js.Any])
    if (!js.isUndefined(trellisQuantisation)) __obj.updateDynamic("trellisQuantisation")(trellisQuantisation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JpegOptions]
  }
}

