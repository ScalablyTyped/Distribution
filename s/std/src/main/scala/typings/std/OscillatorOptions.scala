package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OscillatorOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var detune: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var periodicWave: js.UndefOr[PeriodicWave] = js.undefined
  
  /* standard dom */
  var `type`: js.UndefOr[OscillatorType] = js.undefined
}
object OscillatorOptions {
  
  inline def apply(): OscillatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OscillatorOptions]
  }
  
  extension [Self <: OscillatorOptions](x: Self) {
    
    inline def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
    
    inline def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setPeriodicWave(value: PeriodicWave): Self = StObject.set(x, "periodicWave", value.asInstanceOf[js.Any])
    
    inline def setPeriodicWaveUndefined: Self = StObject.set(x, "periodicWave", js.undefined)
    
    inline def setType(value: OscillatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
