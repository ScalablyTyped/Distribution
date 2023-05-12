package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JxlOptions
  extends StObject
     with OutputOptions {
  
  /** Target decode speed tier, between 0 (highest quality) and 4 (lowest quality) (optional, default 0) */
  var decodingTier: js.UndefOr[Double] = js.undefined
  
  /** Maximum encoding error, between 0 (highest quality) and 15 (lowest quality) (optional, default 1.0) */
  var distance: js.UndefOr[Double] = js.undefined
  
  /** CPU effort, between 3 (fastest) and 9 (slowest) (optional, default 7) */
  var effort: js.UndefOr[Double] = js.undefined
  
  /** Use lossless compression (optional, default false) */
  var lossless: js.UndefOr[Boolean] = js.undefined
  
  /** Calculate distance based on JPEG-like quality, between 1 and 100, overrides distance if specified */
  var quality: js.UndefOr[Double] = js.undefined
}
object JxlOptions {
  
  inline def apply(): JxlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JxlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JxlOptions] (val x: Self) extends AnyVal {
    
    inline def setDecodingTier(value: Double): Self = StObject.set(x, "decodingTier", value.asInstanceOf[js.Any])
    
    inline def setDecodingTierUndefined: Self = StObject.set(x, "decodingTier", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEffort(value: Double): Self = StObject.set(x, "effort", value.asInstanceOf[js.Any])
    
    inline def setEffortUndefined: Self = StObject.set(x, "effort", js.undefined)
    
    inline def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    inline def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
