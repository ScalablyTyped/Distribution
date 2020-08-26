package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JpegOptions extends OutputOptions {
  /** Set to '4:4:4' to prevent chroma subsampling when quality <= 90 (optional, default '4:2:0') */
  var chromaSubsampling: js.UndefOr[String] = js.native
  /** Optimise Huffman coding tables (optional, default true) */
  var optimiseCoding: js.UndefOr[Boolean] = js.native
  /** Optimise progressive scans, forces progressive, requires mozjpeg (optional, default false) */
  var optimiseScans: js.UndefOr[Boolean] = js.native
  /** Alternative spelling of optimiseCoding (optional, default true) */
  var optimizeCoding: js.UndefOr[Boolean] = js.native
  /** Alternative spelling of optimiseScans (optional, default false) */
  var optimizeScans: js.UndefOr[Boolean] = js.native
  /** Apply overshoot deringing, requires mozjpeg (optional, default  false) */
  var overshootDeringing: js.UndefOr[Boolean] = js.native
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[Boolean] = js.native
  /** Quantization table to use, integer 0-8, requires mozjpeg (optional, default 0) */
  var quantisationTable: js.UndefOr[Double] = js.native
  /** Alternative spelling of quantisationTable (optional, default 0) */
  var quantizationTable: js.UndefOr[Double] = js.native
  /** Apply trellis quantisation, requires mozjpeg (optional, default  false) */
  var trellisQuantisation: js.UndefOr[Boolean] = js.native
}

object JpegOptions {
  @scala.inline
  def apply(): JpegOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JpegOptions]
  }
  @scala.inline
  implicit class JpegOptionsOps[Self <: JpegOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChromaSubsampling(value: String): Self = this.set("chromaSubsampling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromaSubsampling: Self = this.set("chromaSubsampling", js.undefined)
    @scala.inline
    def setOptimiseCoding(value: Boolean): Self = this.set("optimiseCoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimiseCoding: Self = this.set("optimiseCoding", js.undefined)
    @scala.inline
    def setOptimiseScans(value: Boolean): Self = this.set("optimiseScans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimiseScans: Self = this.set("optimiseScans", js.undefined)
    @scala.inline
    def setOptimizeCoding(value: Boolean): Self = this.set("optimizeCoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizeCoding: Self = this.set("optimizeCoding", js.undefined)
    @scala.inline
    def setOptimizeScans(value: Boolean): Self = this.set("optimizeScans", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizeScans: Self = this.set("optimizeScans", js.undefined)
    @scala.inline
    def setOvershootDeringing(value: Boolean): Self = this.set("overshootDeringing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOvershootDeringing: Self = this.set("overshootDeringing", js.undefined)
    @scala.inline
    def setProgressive(value: Boolean): Self = this.set("progressive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressive: Self = this.set("progressive", js.undefined)
    @scala.inline
    def setQuantisationTable(value: Double): Self = this.set("quantisationTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantisationTable: Self = this.set("quantisationTable", js.undefined)
    @scala.inline
    def setQuantizationTable(value: Double): Self = this.set("quantizationTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantizationTable: Self = this.set("quantizationTable", js.undefined)
    @scala.inline
    def setTrellisQuantisation(value: Boolean): Self = this.set("trellisQuantisation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrellisQuantisation: Self = this.set("trellisQuantisation", js.undefined)
  }
  
}

