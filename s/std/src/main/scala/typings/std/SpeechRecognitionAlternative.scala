package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionAlternative) */
trait SpeechRecognitionAlternative extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionAlternative/confidence) */
  /* standard dom */
  val confidence: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionAlternative/transcript) */
  /* standard dom */
  val transcript: java.lang.String
}
object SpeechRecognitionAlternative {
  
  inline def apply(confidence: Double, transcript: java.lang.String): SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionAlternative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeechRecognitionAlternative] (val x: Self) extends AnyVal {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setTranscript(value: java.lang.String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
  }
}
