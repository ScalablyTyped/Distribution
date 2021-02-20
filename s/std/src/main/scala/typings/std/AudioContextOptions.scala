package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioContextOptions extends StObject {
  
  var latencyHint: js.UndefOr[AudioContextLatencyCategory | Double] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
}
object AudioContextOptions {
  
  @scala.inline
  def apply(): AudioContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioContextOptions]
  }
  
  @scala.inline
  implicit class AudioContextOptionsMutableBuilder[Self <: AudioContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatencyHint(value: AudioContextLatencyCategory | Double): Self = StObject.set(x, "latencyHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyHintUndefined: Self = StObject.set(x, "latencyHint", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
  }
}
