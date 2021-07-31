package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeechRecognitionEventMap extends StObject {
  
  var audioend: Event
  
  var audiostart: Event
  
  var end: Event
  
  var error: ErrorEvent
  
  var nomatch: SpeechRecognitionEvent
  
  var result: SpeechRecognitionEvent
  
  var soundend: Event
  
  var soundstart: Event
  
  var speechend: Event
  
  var speechstart: Event
  
  var start: Event
}
object SpeechRecognitionEventMap {
  
  @scala.inline
  def apply(
    audioend: Event,
    audiostart: Event,
    end: Event,
    error: ErrorEvent,
    nomatch: SpeechRecognitionEvent,
    result: SpeechRecognitionEvent,
    soundend: Event,
    soundstart: Event,
    speechend: Event,
    speechstart: Event,
    start: Event
  ): SpeechRecognitionEventMap = {
    val __obj = js.Dynamic.literal(audioend = audioend.asInstanceOf[js.Any], audiostart = audiostart.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], nomatch = nomatch.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], soundend = soundend.asInstanceOf[js.Any], soundstart = soundstart.asInstanceOf[js.Any], speechend = speechend.asInstanceOf[js.Any], speechstart = speechstart.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionEventMap]
  }
  
  @scala.inline
  implicit class SpeechRecognitionEventMapMutableBuilder[Self <: SpeechRecognitionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioend(value: Event): Self = StObject.set(x, "audioend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudiostart(value: Event): Self = StObject.set(x, "audiostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Event): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNomatch(value: SpeechRecognitionEvent): Self = StObject.set(x, "nomatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: SpeechRecognitionEvent): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundend(value: Event): Self = StObject.set(x, "soundend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundstart(value: Event): Self = StObject.set(x, "soundstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechend(value: Event): Self = StObject.set(x, "speechend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechstart(value: Event): Self = StObject.set(x, "speechstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Event): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
