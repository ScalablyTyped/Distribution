package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OscillatorOptions
  extends StObject
     with AudioNodeOptions {
  
  var detune: js.UndefOr[Double] = js.undefined
  
  var frequency: js.UndefOr[Double] = js.undefined
  
  var periodicWave: js.UndefOr[PeriodicWave] = js.undefined
  
  var `type`: js.UndefOr[OscillatorType] = js.undefined
}
object OscillatorOptions {
  
  @scala.inline
  def apply(): OscillatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OscillatorOptions]
  }
  
  @scala.inline
  implicit class OscillatorOptionsMutableBuilder[Self <: OscillatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setPeriodicWave(value: PeriodicWave): Self = StObject.set(x, "periodicWave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodicWaveUndefined: Self = StObject.set(x, "periodicWave", js.undefined)
    
    @scala.inline
    def setType(value: OscillatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
