package typings.reactSpeechRecognition

import typings.reactSpeechRecognition.anon.FinalTranscript
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-speech-recognition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-speech-recognition", JSImport.Default)
  @js.native
  val default: SpeechRecognition = js.native
  
  inline def useSpeechRecognition(): FinalTranscript = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpeechRecognition")().asInstanceOf[FinalTranscript]
  inline def useSpeechRecognition(options: SpeechRecognitionOptions): FinalTranscript = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpeechRecognition")(options.asInstanceOf[js.Any]).asInstanceOf[FinalTranscript]
  
  trait Command extends StObject {
    
    def callback(args: js.Any*): js.Any
    
    var command: String | RegExp
    
    var fuzzyMatchingThreshold: js.UndefOr[Double] = js.undefined
    
    var isFuzzyMatch: js.UndefOr[Boolean] = js.undefined
    
    var matchInterim: js.UndefOr[Boolean] = js.undefined
  }
  object Command {
    
    inline def apply(callback: /* repeated */ js.Any => js.Any, command: String | RegExp): Command = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setCallback(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCommand(value: String | RegExp): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setFuzzyMatchingThreshold(value: Double): Self = StObject.set(x, "fuzzyMatchingThreshold", value.asInstanceOf[js.Any])
      
      inline def setFuzzyMatchingThresholdUndefined: Self = StObject.set(x, "fuzzyMatchingThreshold", js.undefined)
      
      inline def setIsFuzzyMatch(value: Boolean): Self = StObject.set(x, "isFuzzyMatch", value.asInstanceOf[js.Any])
      
      inline def setIsFuzzyMatchUndefined: Self = StObject.set(x, "isFuzzyMatch", js.undefined)
      
      inline def setMatchInterim(value: Boolean): Self = StObject.set(x, "matchInterim", value.asInstanceOf[js.Any])
      
      inline def setMatchInterimUndefined: Self = StObject.set(x, "matchInterim", js.undefined)
    }
  }
  
  trait ListeningOptions extends StObject {
    
    var continuous: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
  }
  object ListeningOptions {
    
    inline def apply(): ListeningOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListeningOptions]
    }
    
    extension [Self <: ListeningOptions](x: Self) {
      
      inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  @js.native
  trait SpeechRecognition extends StObject {
    
    def abortListening(): Unit = js.native
    
    def browserSupportsSpeechRecognition(): Boolean = js.native
    
    def getRecognition(): SpeechRecognition | Null = js.native
    
    def startListening(): js.Promise[Unit] = js.native
    def startListening(options: ListeningOptions): js.Promise[Unit] = js.native
    
    def stopListening(): Unit = js.native
  }
  
  trait SpeechRecognitionOptions extends StObject {
    
    var clearTranscriptOnListen: js.UndefOr[Boolean] = js.undefined
    
    var commands: js.UndefOr[js.Array[Command]] = js.undefined
    
    var transcribing: js.UndefOr[Boolean] = js.undefined
  }
  object SpeechRecognitionOptions {
    
    inline def apply(): SpeechRecognitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpeechRecognitionOptions]
    }
    
    extension [Self <: SpeechRecognitionOptions](x: Self) {
      
      inline def setClearTranscriptOnListen(value: Boolean): Self = StObject.set(x, "clearTranscriptOnListen", value.asInstanceOf[js.Any])
      
      inline def setClearTranscriptOnListenUndefined: Self = StObject.set(x, "clearTranscriptOnListen", js.undefined)
      
      inline def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      inline def setTranscribing(value: Boolean): Self = StObject.set(x, "transcribing", value.asInstanceOf[js.Any])
      
      inline def setTranscribingUndefined: Self = StObject.set(x, "transcribing", js.undefined)
    }
  }
}
