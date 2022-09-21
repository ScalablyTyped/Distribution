package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JpegOptions
  extends StObject
     with OutputOptions {
  
  /** Set to '4:4:4' to prevent chroma subsampling when quality <= 90 (optional, default '4:2:0') */
  var chromaSubsampling: js.UndefOr[String] = js.undefined
  
  /** Use mozjpeg defaults (optional, default false) */
  var mozjpeg: js.UndefOr[Boolean] = js.undefined
  
  /** Optimise Huffman coding tables (optional, default true) */
  var optimiseCoding: js.UndefOr[Boolean] = js.undefined
  
  /** Optimise progressive scans, forces progressive (optional, default false) */
  var optimiseScans: js.UndefOr[Boolean] = js.undefined
  
  /** Alternative spelling of optimiseCoding (optional, default true) */
  var optimizeCoding: js.UndefOr[Boolean] = js.undefined
  
  /** Alternative spelling of optimiseScans (optional, default false) */
  var optimizeScans: js.UndefOr[Boolean] = js.undefined
  
  /** Apply overshoot deringing (optional, default  false) */
  var overshootDeringing: js.UndefOr[Boolean] = js.undefined
  
  /** Use progressive (interlace) scan (optional, default false) */
  var progressive: js.UndefOr[Boolean] = js.undefined
  
  /** Quality, integer 1-100 (optional, default 80) */
  var quality: js.UndefOr[Double] = js.undefined
  
  /** Quantization table to use, integer 0-8 (optional, default 0) */
  var quantisationTable: js.UndefOr[Double] = js.undefined
  
  /** Alternative spelling of quantisationTable (optional, default 0) */
  var quantizationTable: js.UndefOr[Double] = js.undefined
  
  /** Apply trellis quantisation (optional, default  false) */
  var trellisQuantisation: js.UndefOr[Boolean] = js.undefined
}
object JpegOptions {
  
  inline def apply(): JpegOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JpegOptions]
  }
  
  extension [Self <: JpegOptions](x: Self) {
    
    inline def setChromaSubsampling(value: String): Self = StObject.set(x, "chromaSubsampling", value.asInstanceOf[js.Any])
    
    inline def setChromaSubsamplingUndefined: Self = StObject.set(x, "chromaSubsampling", js.undefined)
    
    inline def setMozjpeg(value: Boolean): Self = StObject.set(x, "mozjpeg", value.asInstanceOf[js.Any])
    
    inline def setMozjpegUndefined: Self = StObject.set(x, "mozjpeg", js.undefined)
    
    inline def setOptimiseCoding(value: Boolean): Self = StObject.set(x, "optimiseCoding", value.asInstanceOf[js.Any])
    
    inline def setOptimiseCodingUndefined: Self = StObject.set(x, "optimiseCoding", js.undefined)
    
    inline def setOptimiseScans(value: Boolean): Self = StObject.set(x, "optimiseScans", value.asInstanceOf[js.Any])
    
    inline def setOptimiseScansUndefined: Self = StObject.set(x, "optimiseScans", js.undefined)
    
    inline def setOptimizeCoding(value: Boolean): Self = StObject.set(x, "optimizeCoding", value.asInstanceOf[js.Any])
    
    inline def setOptimizeCodingUndefined: Self = StObject.set(x, "optimizeCoding", js.undefined)
    
    inline def setOptimizeScans(value: Boolean): Self = StObject.set(x, "optimizeScans", value.asInstanceOf[js.Any])
    
    inline def setOptimizeScansUndefined: Self = StObject.set(x, "optimizeScans", js.undefined)
    
    inline def setOvershootDeringing(value: Boolean): Self = StObject.set(x, "overshootDeringing", value.asInstanceOf[js.Any])
    
    inline def setOvershootDeringingUndefined: Self = StObject.set(x, "overshootDeringing", js.undefined)
    
    inline def setProgressive(value: Boolean): Self = StObject.set(x, "progressive", value.asInstanceOf[js.Any])
    
    inline def setProgressiveUndefined: Self = StObject.set(x, "progressive", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setQuantisationTable(value: Double): Self = StObject.set(x, "quantisationTable", value.asInstanceOf[js.Any])
    
    inline def setQuantisationTableUndefined: Self = StObject.set(x, "quantisationTable", js.undefined)
    
    inline def setQuantizationTable(value: Double): Self = StObject.set(x, "quantizationTable", value.asInstanceOf[js.Any])
    
    inline def setQuantizationTableUndefined: Self = StObject.set(x, "quantizationTable", js.undefined)
    
    inline def setTrellisQuantisation(value: Boolean): Self = StObject.set(x, "trellisQuantisation", value.asInstanceOf[js.Any])
    
    inline def setTrellisQuantisationUndefined: Self = StObject.set(x, "trellisQuantisation", js.undefined)
  }
}
