package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineAudioCompletionEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var renderedBuffer: AudioBuffer
}
object OfflineAudioCompletionEventInit {
  
  inline def apply(renderedBuffer: AudioBuffer): OfflineAudioCompletionEventInit = {
    val __obj = js.Dynamic.literal(renderedBuffer = renderedBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioCompletionEventInit]
  }
  
  extension [Self <: OfflineAudioCompletionEventInit](x: Self) {
    
    inline def setRenderedBuffer(value: AudioBuffer): Self = StObject.set(x, "renderedBuffer", value.asInstanceOf[js.Any])
  }
}
