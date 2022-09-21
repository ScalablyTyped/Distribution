package typings.sharp.mod

import typings.sharp.sharpStrings.gaussian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Noise extends StObject {
  
  /** mean of pixels in generated noise. */
  var mean: js.UndefOr[Double] = js.undefined
  
  /** standard deviation of pixels in generated noise. */
  var sigma: js.UndefOr[Double] = js.undefined
  
  /** type of generated noise, currently only gaussian is supported. */
  var `type`: js.UndefOr[gaussian] = js.undefined
}
object Noise {
  
  inline def apply(): Noise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Noise]
  }
  
  extension [Self <: Noise](x: Self) {
    
    inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    inline def setSigma(value: Double): Self = StObject.set(x, "sigma", value.asInstanceOf[js.Any])
    
    inline def setSigmaUndefined: Self = StObject.set(x, "sigma", js.undefined)
    
    inline def setType(value: gaussian): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
