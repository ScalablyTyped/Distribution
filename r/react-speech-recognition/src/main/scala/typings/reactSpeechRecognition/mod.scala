package typings.reactSpeechRecognition

import typings.reactSpeechRecognition.anon.BrowserSupportsSpeechRecognition
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
  
  inline def useSpeechRecognition(): BrowserSupportsSpeechRecognition = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpeechRecognition")().asInstanceOf[BrowserSupportsSpeechRecognition]
  inline def useSpeechRecognition(options: SpeechRecognitionOptions): BrowserSupportsSpeechRecognition = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpeechRecognition")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserSupportsSpeechRecognition]
  
  trait Command extends StObject {
    
    var bestMatchOnly: js.UndefOr[Boolean] = js.undefined
    
    def callback(args: Any*): Any
    
    var command: String | js.Array[String] | js.RegExp
    
    var fuzzyMatchingThreshold: js.UndefOr[Double] = js.undefined
    
    var isFuzzyMatch: js.UndefOr[Boolean] = js.undefined
    
    var matchInterim: js.UndefOr[Boolean] = js.undefined
  }
  object Command {
    
    inline def apply(callback: /* repeated */ Any => Any, command: String | js.Array[String] | js.RegExp): Command = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      inline def setBestMatchOnly(value: Boolean): Self = StObject.set(x, "bestMatchOnly", value.asInstanceOf[js.Any])
      
      inline def setBestMatchOnlyUndefined: Self = StObject.set(x, "bestMatchOnly", js.undefined)
      
      inline def setCallback(value: /* repeated */ Any => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCommand(value: String | js.Array[String] | js.RegExp): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandVarargs(value: String*): Self = StObject.set(x, "command", js.Array(value*))
      
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
    
    var interimResults: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
  }
  object ListeningOptions {
    
    inline def apply(): ListeningOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListeningOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListeningOptions] (val x: Self) extends AnyVal {
      
      inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      inline def setInterimResults(value: Boolean): Self = StObject.set(x, "interimResults", value.asInstanceOf[js.Any])
      
      inline def setInterimResultsUndefined: Self = StObject.set(x, "interimResults", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  @js.native
  trait SpeechRecognition extends StObject {
    
    def abortListening(): js.Promise[Unit] = js.native
    
    def applyPolyfill(speechRecognitionPolyfill: Any): Unit = js.native
    
    def browserSupportsSpeechRecognition(): Boolean = js.native
    
    def getRecognition(): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.SpeechRecognition */ Any) | Null = js.native
    
    def startListening(): js.Promise[Unit] = js.native
    def startListening(options: ListeningOptions): js.Promise[Unit] = js.native
    
    def stopListening(): js.Promise[Unit] = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpeechRecognitionOptions] (val x: Self) extends AnyVal {
      
      inline def setClearTranscriptOnListen(value: Boolean): Self = StObject.set(x, "clearTranscriptOnListen", value.asInstanceOf[js.Any])
      
      inline def setClearTranscriptOnListenUndefined: Self = StObject.set(x, "clearTranscriptOnListen", js.undefined)
      
      inline def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setTranscribing(value: Boolean): Self = StObject.set(x, "transcribing", value.asInstanceOf[js.Any])
      
      inline def setTranscribingUndefined: Self = StObject.set(x, "transcribing", js.undefined)
    }
  }
}
