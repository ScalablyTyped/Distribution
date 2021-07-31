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
  
  @scala.inline
  def useSpeechRecognition(): FinalTranscript = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpeechRecognition")().asInstanceOf[FinalTranscript]
  @scala.inline
  def useSpeechRecognition(options: SpeechRecognitionOptions): FinalTranscript = ^.asInstanceOf[js.Dynamic].applyDynamic("useSpeechRecognition")(options.asInstanceOf[js.Any]).asInstanceOf[FinalTranscript]
  
  trait Command extends StObject {
    
    def callback(args: js.Any*): js.Any
    
    var command: String | RegExp
    
    var fuzzyMatchingThreshold: js.UndefOr[Double] = js.undefined
    
    var isFuzzyMatch: js.UndefOr[Boolean] = js.undefined
    
    var matchInterim: js.UndefOr[Boolean] = js.undefined
  }
  object Command {
    
    @scala.inline
    def apply(callback: /* repeated */ js.Any => js.Any, command: String | RegExp): Command = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCommand(value: String | RegExp): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuzzyMatchingThreshold(value: Double): Self = StObject.set(x, "fuzzyMatchingThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFuzzyMatchingThresholdUndefined: Self = StObject.set(x, "fuzzyMatchingThreshold", js.undefined)
      
      @scala.inline
      def setIsFuzzyMatch(value: Boolean): Self = StObject.set(x, "isFuzzyMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFuzzyMatchUndefined: Self = StObject.set(x, "isFuzzyMatch", js.undefined)
      
      @scala.inline
      def setMatchInterim(value: Boolean): Self = StObject.set(x, "matchInterim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchInterimUndefined: Self = StObject.set(x, "matchInterim", js.undefined)
    }
  }
  
  trait ListeningOptions extends StObject {
    
    var continuous: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
  }
  object ListeningOptions {
    
    @scala.inline
    def apply(): ListeningOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListeningOptions]
    }
    
    @scala.inline
    implicit class ListeningOptionsMutableBuilder[Self <: ListeningOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
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
    
    @scala.inline
    def apply(): SpeechRecognitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpeechRecognitionOptions]
    }
    
    @scala.inline
    implicit class SpeechRecognitionOptionsMutableBuilder[Self <: SpeechRecognitionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearTranscriptOnListen(value: Boolean): Self = StObject.set(x, "clearTranscriptOnListen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearTranscriptOnListenUndefined: Self = StObject.set(x, "clearTranscriptOnListen", js.undefined)
      
      @scala.inline
      def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
      
      @scala.inline
      def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value :_*))
      
      @scala.inline
      def setTranscribing(value: Boolean): Self = StObject.set(x, "transcribing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscribingUndefined: Self = StObject.set(x, "transcribing", js.undefined)
    }
  }
}
