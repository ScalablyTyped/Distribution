package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioContextInfo extends StObject {
  
  var currentTime: js.UndefOr[Double] = js.undefined
  
  var sampleRate: js.UndefOr[Double] = js.undefined
}
object AudioContextInfo {
  
  inline def apply(): AudioContextInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioContextInfo]
  }
  
  extension [Self <: AudioContextInfo](x: Self) {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
