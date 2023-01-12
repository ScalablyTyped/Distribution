package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioContextOptions extends StObject {
  
  /* standard dom */
  var latencyHint: js.UndefOr[AudioContextLatencyCategory | Double] = js.undefined
  
  /* standard dom */
  var sampleRate: js.UndefOr[Double] = js.undefined
}
object AudioContextOptions {
  
  inline def apply(): AudioContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioContextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioContextOptions] (val x: Self) extends AnyVal {
    
    inline def setLatencyHint(value: AudioContextLatencyCategory | Double): Self = StObject.set(x, "latencyHint", value.asInstanceOf[js.Any])
    
    inline def setLatencyHintUndefined: Self = StObject.set(x, "latencyHint", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
