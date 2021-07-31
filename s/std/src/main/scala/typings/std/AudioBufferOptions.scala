package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioBufferOptions extends StObject {
  
  var length: Double
  
  var numberOfChannels: js.UndefOr[Double] = js.undefined
  
  var sampleRate: Double
}
object AudioBufferOptions {
  
  @scala.inline
  def apply(length: Double, sampleRate: Double): AudioBufferOptions = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioBufferOptions]
  }
  
  @scala.inline
  implicit class AudioBufferOptionsMutableBuilder[Self <: AudioBufferOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfChannelsUndefined: Self = StObject.set(x, "numberOfChannels", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
  }
}
