package typings.reactSpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BrowserSupportsSpeechRecognition extends StObject {
    
    var browserSupportsSpeechRecognition: Boolean
    
    var finalTranscript: String
    
    var interimTranscript: String
    
    var isMicrophoneAvailable: Boolean
    
    var listening: Boolean
    
    def resetTranscript(): Unit
    
    var transcript: String
  }
  object BrowserSupportsSpeechRecognition {
    
    inline def apply(
      browserSupportsSpeechRecognition: Boolean,
      finalTranscript: String,
      interimTranscript: String,
      isMicrophoneAvailable: Boolean,
      listening: Boolean,
      resetTranscript: () => Unit,
      transcript: String
    ): BrowserSupportsSpeechRecognition = {
      val __obj = js.Dynamic.literal(browserSupportsSpeechRecognition = browserSupportsSpeechRecognition.asInstanceOf[js.Any], finalTranscript = finalTranscript.asInstanceOf[js.Any], interimTranscript = interimTranscript.asInstanceOf[js.Any], isMicrophoneAvailable = isMicrophoneAvailable.asInstanceOf[js.Any], listening = listening.asInstanceOf[js.Any], resetTranscript = js.Any.fromFunction0(resetTranscript), transcript = transcript.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserSupportsSpeechRecognition]
    }
    
    extension [Self <: BrowserSupportsSpeechRecognition](x: Self) {
      
      inline def setBrowserSupportsSpeechRecognition(value: Boolean): Self = StObject.set(x, "browserSupportsSpeechRecognition", value.asInstanceOf[js.Any])
      
      inline def setFinalTranscript(value: String): Self = StObject.set(x, "finalTranscript", value.asInstanceOf[js.Any])
      
      inline def setInterimTranscript(value: String): Self = StObject.set(x, "interimTranscript", value.asInstanceOf[js.Any])
      
      inline def setIsMicrophoneAvailable(value: Boolean): Self = StObject.set(x, "isMicrophoneAvailable", value.asInstanceOf[js.Any])
      
      inline def setListening(value: Boolean): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
      
      inline def setResetTranscript(value: () => Unit): Self = StObject.set(x, "resetTranscript", js.Any.fromFunction0(value))
      
      inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    }
  }
}
