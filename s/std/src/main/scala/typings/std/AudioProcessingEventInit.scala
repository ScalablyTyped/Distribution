package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioProcessingEventInit extends EventInit {
  
  var inputBuffer: AudioBuffer = js.native
  
  var outputBuffer: AudioBuffer = js.native
  
  var playbackTime: Double = js.native
}
object AudioProcessingEventInit {
  
  @scala.inline
  def apply(inputBuffer: AudioBuffer, outputBuffer: AudioBuffer, playbackTime: Double): AudioProcessingEventInit = {
    val __obj = js.Dynamic.literal(inputBuffer = inputBuffer.asInstanceOf[js.Any], outputBuffer = outputBuffer.asInstanceOf[js.Any], playbackTime = playbackTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioProcessingEventInit]
  }
  
  @scala.inline
  implicit class AudioProcessingEventInitMutableBuilder[Self <: AudioProcessingEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputBuffer(value: AudioBuffer): Self = StObject.set(x, "inputBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBuffer(value: AudioBuffer): Self = StObject.set(x, "outputBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackTime(value: Double): Self = StObject.set(x, "playbackTime", value.asInstanceOf[js.Any])
  }
}
