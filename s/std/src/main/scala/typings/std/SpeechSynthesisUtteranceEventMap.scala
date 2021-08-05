package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeechSynthesisUtteranceEventMap extends StObject {
  
  var boundary: SpeechSynthesisEvent
  
  var end: SpeechSynthesisEvent
  
  var error: SpeechSynthesisErrorEvent
  
  var mark: SpeechSynthesisEvent
  
  var pause: SpeechSynthesisEvent
  
  var resume: SpeechSynthesisEvent
  
  var start: SpeechSynthesisEvent
}
object SpeechSynthesisUtteranceEventMap {
  
  inline def apply(
    boundary: SpeechSynthesisEvent,
    end: SpeechSynthesisEvent,
    error: SpeechSynthesisErrorEvent,
    mark: SpeechSynthesisEvent,
    pause: SpeechSynthesisEvent,
    resume: SpeechSynthesisEvent,
    start: SpeechSynthesisEvent
  ): SpeechSynthesisUtteranceEventMap = {
    val __obj = js.Dynamic.literal(boundary = boundary.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], resume = resume.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisUtteranceEventMap]
  }
  
  extension [Self <: SpeechSynthesisUtteranceEventMap](x: Self) {
    
    inline def setBoundary(value: SpeechSynthesisEvent): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: SpeechSynthesisEvent): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setError(value: SpeechSynthesisErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMark(value: SpeechSynthesisEvent): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setPause(value: SpeechSynthesisEvent): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
    
    inline def setResume(value: SpeechSynthesisEvent): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    inline def setStart(value: SpeechSynthesisEvent): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
