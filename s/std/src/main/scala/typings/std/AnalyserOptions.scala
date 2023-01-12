package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyserOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var fftSize: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var maxDecibels: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var minDecibels: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var smoothingTimeConstant: js.UndefOr[Double] = js.undefined
}
object AnalyserOptions {
  
  inline def apply(): AnalyserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyserOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalyserOptions] (val x: Self) extends AnyVal {
    
    inline def setFftSize(value: Double): Self = StObject.set(x, "fftSize", value.asInstanceOf[js.Any])
    
    inline def setFftSizeUndefined: Self = StObject.set(x, "fftSize", js.undefined)
    
    inline def setMaxDecibels(value: Double): Self = StObject.set(x, "maxDecibels", value.asInstanceOf[js.Any])
    
    inline def setMaxDecibelsUndefined: Self = StObject.set(x, "maxDecibels", js.undefined)
    
    inline def setMinDecibels(value: Double): Self = StObject.set(x, "minDecibels", value.asInstanceOf[js.Any])
    
    inline def setMinDecibelsUndefined: Self = StObject.set(x, "minDecibels", js.undefined)
    
    inline def setSmoothingTimeConstant(value: Double): Self = StObject.set(x, "smoothingTimeConstant", value.asInstanceOf[js.Any])
    
    inline def setSmoothingTimeConstantUndefined: Self = StObject.set(x, "smoothingTimeConstant", js.undefined)
  }
}
