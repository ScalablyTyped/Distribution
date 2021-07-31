package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JpegOptions
  extends StObject
     with OutputOptions {
  
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
  def apply(): JpegOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JpegOptions]
  }
  
  @scala.inline
  implicit class JpegOptionsMutableBuilder[Self <: JpegOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChromaSubsampling(value: String): Self = StObject.set(x, "chromaSubsampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromaSubsamplingUndefined: Self = StObject.set(x, "chromaSubsampling", js.undefined)
    
    @scala.inline
    def setOptimiseCoding(value: Boolean): Self = StObject.set(x, "optimiseCoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimiseCodingUndefined: Self = StObject.set(x, "optimiseCoding", js.undefined)
    
    @scala.inline
    def setOptimiseScans(value: Boolean): Self = StObject.set(x, "optimiseScans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimiseScansUndefined: Self = StObject.set(x, "optimiseScans", js.undefined)
    
    @scala.inline
    def setOptimizeCoding(value: Boolean): Self = StObject.set(x, "optimizeCoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeCodingUndefined: Self = StObject.set(x, "optimizeCoding", js.undefined)
    
    @scala.inline
    def setOptimizeScans(value: Boolean): Self = StObject.set(x, "optimizeScans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeScansUndefined: Self = StObject.set(x, "optimizeScans", js.undefined)
    
    @scala.inline
    def setOvershootDeringing(value: Boolean): Self = StObject.set(x, "overshootDeringing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOvershootDeringingUndefined: Self = StObject.set(x, "overshootDeringing", js.undefined)
    
    @scala.inline
    def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
    
    @scala.inline
    def setQuantisationTable(value: Double): Self = StObject.set(x, "quantisationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantisationTableUndefined: Self = StObject.set(x, "quantisationTable", js.undefined)
    
    @scala.inline
    def setQuantizationTable(value: Double): Self = StObject.set(x, "quantizationTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantizationTableUndefined: Self = StObject.set(x, "quantizationTable", js.undefined)
    
    @scala.inline
    def setTrellisQuantisation(value: Boolean): Self = StObject.set(x, "trellisQuantisation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrellisQuantisationUndefined: Self = StObject.set(x, "trellisQuantisation", js.undefined)
  }
}
