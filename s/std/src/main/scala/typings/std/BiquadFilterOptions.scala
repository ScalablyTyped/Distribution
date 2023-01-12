package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiquadFilterOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var Q: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var detune: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var gain: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var `type`: js.UndefOr[BiquadFilterType] = js.undefined
}
object BiquadFilterOptions {
  
  inline def apply(): BiquadFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiquadFilterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiquadFilterOptions] (val x: Self) extends AnyVal {
    
    inline def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
    
    inline def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    inline def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
    
    inline def setQ(value: Double): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "Q", js.undefined)
    
    inline def setType(value: BiquadFilterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
