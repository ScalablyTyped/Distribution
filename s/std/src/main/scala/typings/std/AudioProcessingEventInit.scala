package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioProcessingEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var inputBuffer: AudioBuffer
  
  /* standard dom */
  var outputBuffer: AudioBuffer
  
  /* standard dom */
  var playbackTime: Double
}
object AudioProcessingEventInit {
  
  inline def apply(inputBuffer: AudioBuffer, outputBuffer: AudioBuffer, playbackTime: Double): AudioProcessingEventInit = {
    val __obj = js.Dynamic.literal(inputBuffer = inputBuffer.asInstanceOf[js.Any], outputBuffer = outputBuffer.asInstanceOf[js.Any], playbackTime = playbackTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioProcessingEventInit]
  }
  
  extension [Self <: AudioProcessingEventInit](x: Self) {
    
    inline def setInputBuffer(value: AudioBuffer): Self = StObject.set(x, "inputBuffer", value.asInstanceOf[js.Any])
    
    inline def setOutputBuffer(value: AudioBuffer): Self = StObject.set(x, "outputBuffer", value.asInstanceOf[js.Any])
    
    inline def setPlaybackTime(value: Double): Self = StObject.set(x, "playbackTime", value.asInstanceOf[js.Any])
  }
}
