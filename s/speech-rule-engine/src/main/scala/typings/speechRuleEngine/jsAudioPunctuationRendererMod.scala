package typings.speechRuleEngine

import typings.speechRuleEngine.jsAudioAbstractAudioRendererMod.AbstractAudioRenderer
import typings.speechRuleEngine.jsAudioAudioUtilMod.PauseValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsAudioPunctuationRendererMod {
  
  @JSImport("speech-rule-engine/js/audio/punctuation_renderer", "PunctuationRenderer")
  @js.native
  open class PunctuationRenderer () extends AbstractAudioRenderer {
    
    def pause(pause: PauseValue): String = js.native
  }
  /* static members */
  object PunctuationRenderer {
    
    @JSImport("speech-rule-engine/js/audio/punctuation_renderer", "PunctuationRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("speech-rule-engine/js/audio/punctuation_renderer", "PunctuationRenderer.PAUSE_PUNCTUATION")
    @js.native
    def PAUSE_PUNCTUATION: Any = js.native
    inline def PAUSE_PUNCTUATION_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAUSE_PUNCTUATION")(x.asInstanceOf[js.Any])
  }
}
