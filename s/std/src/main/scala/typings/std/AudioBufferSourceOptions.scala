package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioBufferSourceOptions extends StObject {
  
  var buffer: js.UndefOr[AudioBuffer | Null] = js.undefined
  
  var detune: js.UndefOr[Double] = js.undefined
  
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  
  var loopEnd: js.UndefOr[Double] = js.undefined
  
  var loopStart: js.UndefOr[Double] = js.undefined
  
  var playbackRate: js.UndefOr[Double] = js.undefined
}
object AudioBufferSourceOptions {
  
  @scala.inline
  def apply(): AudioBufferSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioBufferSourceOptions]
  }
  
  @scala.inline
  implicit class AudioBufferSourceOptionsMutableBuilder[Self <: AudioBufferSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: AudioBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferNull: Self = StObject.set(x, "buffer", null)
    
    @scala.inline
    def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    @scala.inline
    def setDetune(value: Double): Self = StObject.set(x, "detune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetuneUndefined: Self = StObject.set(x, "detune", js.undefined)
    
    @scala.inline
    def setLoop(value: scala.Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopEnd(value: Double): Self = StObject.set(x, "loopEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopEndUndefined: Self = StObject.set(x, "loopEnd", js.undefined)
    
    @scala.inline
    def setLoopStart(value: Double): Self = StObject.set(x, "loopStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopStartUndefined: Self = StObject.set(x, "loopStart", js.undefined)
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
  }
}
