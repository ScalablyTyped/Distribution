package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioContextInfo extends StObject {
  
  var currentTime: js.UndefOr[Double] = js.undefined
  
  var sampleRate: js.UndefOr[Double] = js.undefined
}
object AudioContextInfo {
  
  @scala.inline
  def apply(): AudioContextInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioContextInfo]
  }
  
  @scala.inline
  implicit class AudioContextInfoMutableBuilder[Self <: AudioContextInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
