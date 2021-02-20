package typings.reactSpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FinalTranscript extends StObject {
    
    var finalTranscript: String = js.native
    
    var interimTranscript: String = js.native
    
    var listening: Boolean = js.native
    
    def resetTranscript(): Unit = js.native
    
    var transcript: String = js.native
  }
  object FinalTranscript {
    
    @scala.inline
    def apply(
      finalTranscript: String,
      interimTranscript: String,
      listening: Boolean,
      resetTranscript: () => Unit,
      transcript: String
    ): FinalTranscript = {
      val __obj = js.Dynamic.literal(finalTranscript = finalTranscript.asInstanceOf[js.Any], interimTranscript = interimTranscript.asInstanceOf[js.Any], listening = listening.asInstanceOf[js.Any], resetTranscript = js.Any.fromFunction0(resetTranscript), transcript = transcript.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalTranscript]
    }
    
    @scala.inline
    implicit class FinalTranscriptMutableBuilder[Self <: FinalTranscript] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinalTranscript(value: String): Self = StObject.set(x, "finalTranscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterimTranscript(value: String): Self = StObject.set(x, "interimTranscript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListening(value: Boolean): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetTranscript(value: () => Unit): Self = StObject.set(x, "resetTranscript", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    }
  }
}
