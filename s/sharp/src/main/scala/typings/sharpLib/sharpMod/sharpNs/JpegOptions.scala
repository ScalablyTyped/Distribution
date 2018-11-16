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

