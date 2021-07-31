package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeechRecognitionAlternative extends StObject {
  
  val confidence: Double
  
  val transcript: java.lang.String
}
object SpeechRecognitionAlternative {
  
  @scala.inline
  def apply(confidence: Double, transcript: java.lang.String): SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionAlternative]
  }
  
  @scala.inline
  implicit class SpeechRecognitionAlternativeMutableBuilder[Self <: SpeechRecognitionAlternative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscript(value: java.lang.String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
  }
}
