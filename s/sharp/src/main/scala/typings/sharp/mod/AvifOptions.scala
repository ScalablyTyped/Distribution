package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvifOptions
  extends StObject
     with OutputOptions {
  
  /** set to '4:2:0' to use chroma subsampling, requires libvips v8.11.0 (optional, default '4:4:4') */
  var chromaSubsampling: js.UndefOr[String] = js.undefined
  
  /** Level of CPU effort to reduce file size, between 0 (fastest) and 9 (slowest) (optional, default 4) */
  var effort: js.UndefOr[Double] = js.undefined
  
  /** use lossless compression (optional, default false) */
  var lossless: js.UndefOr[Boolean] = js.undefined
  
  /** quality, integer 1-100 (optional, default 50) */
  var quality: js.UndefOr[Double] = js.undefined
}
object AvifOptions {
  
  inline def apply(): AvifOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvifOptions]
  }
  
  extension [Self <: AvifOptions](x: Self) {
    
    inline def setChromaSubsampling(value: String): Self = StObject.set(x, "chromaSubsampling", value.asInstanceOf[js.Any])
    
    inline def setChromaSubsamplingUndefined: Self = StObject.set(x, "chromaSubsampling", js.undefined)
    
    inline def setEffort(value: Double): Self = StObject.set(x, "effort", value.asInstanceOf[js.Any])
    
    inline def setEffortUndefined: Self = StObject.set(x, "effort", js.undefined)
    
    inline def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    inline def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
