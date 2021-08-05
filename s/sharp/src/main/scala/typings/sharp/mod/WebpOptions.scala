package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpOptions
  extends StObject
     with OutputOptions
     with AnimationOptions {
  
  /** Quality of alpha layer, number from 0-100 (optional, default 100) */
  var alphaQuality: js.UndefOr[Double] = js.undefined
  
  /** Use lossless compression mode (optional, default false) */
  var lossless: js.UndefOr[Boolean] = js.undefined
  
  /** Use near_lossless compression mode (optional, default false) */
  var nearLossless: js.UndefOr[Boolean] = js.undefined
  
  /** Level of CPU effort to reduce file size, integer 0-6 (optional, default 4) */
  var reductionEffort: js.UndefOr[Double] = js.undefined
  
  /** Use high quality chroma subsampling (optional, default false) */
  var smartSubsample: js.UndefOr[Boolean] = js.undefined
}
object WebpOptions {
  
  inline def apply(): WebpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpOptions]
  }
  
  extension [Self <: WebpOptions](x: Self) {
    
    inline def setAlphaQuality(value: Double): Self = StObject.set(x, "alphaQuality", value.asInstanceOf[js.Any])
    
    inline def setAlphaQualityUndefined: Self = StObject.set(x, "alphaQuality", js.undefined)
    
    inline def setLossless(value: Boolean): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    inline def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
    
    inline def setNearLossless(value: Boolean): Self = StObject.set(x, "nearLossless", value.asInstanceOf[js.Any])
    
    inline def setNearLosslessUndefined: Self = StObject.set(x, "nearLossless", js.undefined)
    
    inline def setReductionEffort(value: Double): Self = StObject.set(x, "reductionEffort", value.asInstanceOf[js.Any])
    
    inline def setReductionEffortUndefined: Self = StObject.set(x, "reductionEffort", js.undefined)
    
    inline def setSmartSubsample(value: Boolean): Self = StObject.set(x, "smartSubsample", value.asInstanceOf[js.Any])
    
    inline def setSmartSubsampleUndefined: Self = StObject.set(x, "smartSubsample", js.undefined)
  }
}
